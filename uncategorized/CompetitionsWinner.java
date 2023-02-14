package uncategorized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CompetitionsWinner {
    private void updateScore(HashMap<String, Integer> totalPoint, int score, String team) {
        if (!totalPoint.containsKey(team)) {
            totalPoint.put(team, 0);
        }

        totalPoint.put(team, totalPoint.get(team) + score);
    }

    private String calculateCompetitions(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
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

    public static void main(String[] args) {
        CompetitionsWinner competitionsWinner = new CompetitionsWinner();

        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        System.out.println("Competition Winner: " + competitionsWinner.calculateCompetitions(competitions, results));
    }

}
