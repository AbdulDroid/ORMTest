package geeks.android.orm_test;

public class SimpleProfiler {
    private long lastTime = System.currentTimeMillis();

    public void start() {
        lastTime = System.currentTimeMillis();
    }

    public long stop() {
        return System.currentTimeMillis() - lastTime;
    }
}
