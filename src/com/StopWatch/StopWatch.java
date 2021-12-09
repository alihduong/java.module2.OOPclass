package com.StopWatch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long start(){
        startTime = System.currentTimeMillis();
        return startTime;
    }
    public long end(){
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public double getElapsedTime(){
        return (endTime - startTime)/1000.0;
    }

}
