package com.ferdielik.benchmark.util;

import java.util.Random;

public class DataUtil
{
    private static final int MULTIPLY = 10;

    public static int[] generateSortedData(int size)
    {
        Random r = new Random();
        int[] sortedData = new int[size];

        for (int i = 1; i < size; i++)
        {
            int min = (i - 1) * MULTIPLY;
            int max = i * MULTIPLY;

            sortedData[i] = r.nextInt((max - min) + 1) + min;
        }
        return sortedData;

    }
}
