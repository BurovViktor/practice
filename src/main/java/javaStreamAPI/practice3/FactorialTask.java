package javaStreamAPI.practice3;

import java.util.concurrent.RecursiveTask;

public class FactorialTask extends RecursiveTask<Long> {

    private final int n;

    FactorialTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if (n <= 1) {
            return 1L;
        }FactorialTask subtask = new FactorialTask(n - 1);
        subtask.fork();

        long subtaskResult = subtask.join();
        return (long) n * subtaskResult;
    }

}
