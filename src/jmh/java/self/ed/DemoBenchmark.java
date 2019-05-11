package self.ed;

import org.openjdk.jmh.annotations.*;

import java.util.Random;

public class DemoBenchmark {
    @State(Scope.Thread)
    public static class DemoState {
        private int random;

        @Setup(Level.Trial)
        public void setup() {
            random = new Random().nextInt();
        }
    }

    @Benchmark
    public void testFast(DemoState state) {
        // DemoState.random could be used if needed
        DemoUtils.fast();
    }

    @Benchmark
    public void testSlow(DemoState state) {
        // DemoState.random could be used if needed
        DemoUtils.slow();
    }
}
