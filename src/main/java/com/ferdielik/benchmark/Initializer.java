package com.ferdielik.benchmark;

import java.util.concurrent.ThreadLocalRandom;

import com.ferdielik.benchmark.searching.Search;
import com.ferdielik.benchmark.searching.impl.BinarySearch;
import com.ferdielik.benchmark.searching.impl.InterpolationSearch;
import com.ferdielik.benchmark.searching.impl.LinearSearch;
import com.ferdielik.benchmark.util.DataUtil;
import com.ferdielik.benchmark.util.StopWatch;

public class Initializer
{
    private static int[] data = DataUtil.generateSortedData(9999999);
    private static int searchKey;

    static
    {
        int rand = ThreadLocalRandom.current().nextInt(0, data.length);
        searchKey = data[rand];
    }

    public static void main(String[] args)
    {
        System.out.println("key: " + searchKey);

        testSearch(new LinearSearch());
        testSearch(new BinarySearch());
        testSearch(new InterpolationSearch());

    }

    private static void testSearch(Search searcher)
    {
        StopWatch watch = new StopWatch();
        Integer search = searcher.search(data, searchKey);
        long millis = watch.end();

        System.out.format("\n%s: founded in %s ms, index: %s\n", searcher, millis, search);
    }
}
