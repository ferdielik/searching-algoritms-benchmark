package com.ferdielik.benchmark.util;

public class StopWatch
{
    private long start;

    public StopWatch()
    {
        start = System.currentTimeMillis();
    }

    public void start()
    {
        start = System.currentTimeMillis();
    }

    public long end()
    {
        return System.currentTimeMillis() - start;
    }
}