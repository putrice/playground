package uncategorized;

import java.util.ArrayList;
import java.util.HashMap;

public class TournamentWinner {
    private void updateScore(HashMap<String, Integer> totalPoint, int score, String team) {
        if (!totalPoint.containsKey(team)) {
            totalPoint.put(team, 0);
        }

        totalPoint.put(team, totalPoint.get(team) + score);
    }

    private String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String currentWinner = "";
        HashMap<String, Integer> totalPoint = new HashMap<String, Integer>();
        totalPoint.put(currentWinner, 0);

        for (int i = 0; i < competitions.size(); i++) {
            int result = results.get(i);
            String winningTeam = "";

            ArrayList<String> competition = competitions.get(i);
            if (result == 0) {
                updateScore(totalPoint, 3, competition.get(1));
                winningTeam = competition.get(1);
            } else {
                updateScore(totalPoint, 3, competition.get(0));
                winningTeam = competition.get(0);
            }

            if (totalPoint.get(winningTeam) > totalPoint.get(currentWinner)) {
                currentWinner = winningTeam;
            }
        }

        return currentWinner;
    }

}
