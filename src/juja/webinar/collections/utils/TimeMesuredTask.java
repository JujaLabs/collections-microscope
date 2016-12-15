package juja.webinar.collections.utils;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class TimeMesuredTask {
    private String taskName = "";
    private Runnable task;
    private long duration;

    public TimeMesuredTask(String taskName, Runnable task) {
        this.taskName = taskName;
        this.task = task;
    }

    public TimeMesuredTask runTask() {
        long start = System.currentTimeMillis();
        task.run();
        long end = System.currentTimeMillis();
        duration = end - start;
        return this;
    }

    public String reportInSeconds() {
        return taskName + " duration was " + (duration / 1000) + " seconds.";
    }

    public String reportInMillis() {
        return duration + " ms " + taskName;
    }

}
