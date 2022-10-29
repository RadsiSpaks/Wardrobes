import java.util.Map;
import java.util.HashMap;

public class Wardrobes {

    Map<Integer, Boolean> wardrobes = new HashMap<>();

    Wardrobes() {

        for (int i = 0; i < 100; i++) {

            wardrobes.put(i + 1, false);
        }
    }

    public void wistle(int num) {

        for (int key : wardrobes.keySet()) {

            if (key % num == 0) {

                boolean value = wardrobes.get(key);
                wardrobes.replace(key, !value);
            }
        }
    }
}
