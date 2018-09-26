package com.ferdielik.benchmark.searching.impl;

import com.ferdielik.benchmark.searching.Search;

public class InterpolationSearch implements Search
{
    public int search(int[] data, int item)
    {
        int low = 0, high = data.length - 1;

        while (high >= low && item >= data[low] && item <= data[high])
        {
            int pos = pos(data, item, low, high);
            if (data[pos] == item) return pos;

            if (data[pos] < item) low = pos + 1;
            else if (data[pos] > item) high = pos - 1;
        }

        return -1;
    }

    /**
     * it give us smaller index when item closer the min value, or high index if closer the high value
     */
    private int pos(int[] data, int item, int low, int high)
    {
        int res = ((high - low) / (data[high] - data[low])) * (item - data[low]);
        return low + res;
    }
}
