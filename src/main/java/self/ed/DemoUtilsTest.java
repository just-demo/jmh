package self.ed;

import static java.lang.System.currentTimeMillis;

public class DemoUtilsTest {
    public static void main(String[] args) {
        test("Fast", DemoUtils::fast);
        test("Slow", DemoUtils::slow);
    }

    private static void test(String type, Runnable operation) {
        int count = 1000_000;
        long start = currentTimeMillis();
        for (int i = 0; i < count; i++) {
            operation.run();
        }
        long end = currentTimeMillis();
        long time = end - start;
        System.out.println(type + ": " + time + " ms - " + 1000d * count / time + " ops/s");
    }
}
