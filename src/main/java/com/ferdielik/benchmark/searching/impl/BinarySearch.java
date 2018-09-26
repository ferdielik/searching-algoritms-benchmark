package com.ferdielik.benchmark.searching.impl;

import com.ferdielik.benchmark.searching.Search;

// INFO: must be sorted list
public class BinarySearch implements Search
{
    public int search(int[] data, int item)
    {
        return search(data, item, 0, data.length);
    }

    private int search(int[] data, int key, int startIndex, int endIndex)
    {
        if (startIndex >= data.length || endIndex <= 0) return -1;

        int midpoint = (endIndex + startIndex) / 2;
        if (data[midpoint] == key) return midpoint;

        if (data[midpoint] <= key)
        {
            return search(data, key, midpoint, endIndex);
        }
        else
        {
            return search(data, key, startIndex, midpoint);
        }
    }
}
