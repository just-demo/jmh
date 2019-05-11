package self.ed;

import java.util.Random;

public class DemoUtils {
    public static void fast() {
        run();
    }

    public static void slow() {
        run();
        run();
    }

    private static void run() {
        new Random().nextInt();
    }
}
