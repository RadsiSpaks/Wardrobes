import java.util.Map;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Wardrobes wardrobes = new Wardrobes();

        for (int i = 1; i < 101; i++) {

            wardrobes.wistle(i);

            for (Map.Entry<Integer, Boolean> i2 : wardrobes.wardrobes.entrySet()) {

                System.out.print(Arrays.toString(new Map.Entry[]{i2}) + " ");
            }

            System.out.println();
        }
    }
}
