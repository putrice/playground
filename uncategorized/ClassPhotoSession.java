package uncategorized;

import java.util.ArrayList;
import java.util.Collections;

public class ClassPhotoSession {

    private boolean classPhotos(
            ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
        Collections.sort(redShirtHeights, Collections.reverseOrder());
        Collections.sort(blueShirtHeights, Collections.reverseOrder());

        String shirtColorInFirstRow = (redShirtHeights.get(0) < blueShirtHeights.get(0)) ? "Red" : "Blue";
        return false;
    }
}
