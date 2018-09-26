package com.ferdielik.benchmark.searching.impl;

import com.ferdielik.benchmark.searching.Search;

public class LinearSearch implements Search
{
    public int search(int[] data, int item)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (item == data[i]) return i;
        }
        return -1;
    }
}
