package juja.webinar.collections.map;

import juja.webinar.collections.utils.MemoryPrinter;
import juja.webinar.collections.utils.TimeMesuredTask;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class MaptStressTest {

    public static void main(String[] args) {

        final int size = 976_550;
//        final int size = 2_000_000;
        final HashMap<Integer, String> map = new LinkedHashMap<>(size * 2);
        listAddElementTest(map, "HashMap initial capacity = size", size);
        listAddElementTest(new HashMap<>(), "HashMap initial capacity = default", size);
        listAddElementTest(new TreeMap<>(), "TreeMap initial capacity = default", size);
        System.out.println();
        MemoryPrinter.printMemoryUsage();
    }

    private static void listAddElementTest(Map<Integer, String> map, String taskName, int size) {
        System.out.println(
            new TimeMesuredTask(taskName, new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < size; i++) {
                        map.put(i, "value_" + i);
                    }
                }
            }).runTask().reportInMillis()
        );
    }

}
