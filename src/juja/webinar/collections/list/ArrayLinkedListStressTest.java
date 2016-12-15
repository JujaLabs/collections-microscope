package juja.webinar.collections.list;

import juja.webinar.collections.utils.MemoryPrinter;
import juja.webinar.collections.utils.TimeMesuredTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class ArrayLinkedListStressTest {

    public static void main(String[] args) {

        final int size = 100_000;
//        listAddElementTest(new LinkedList(), "LinkedListTest", size);
//        listAddElementTest(new ArrayList<Integer>(size + 1), "ArrayListTest initial capacity = size", size);
//        listAddElementTest(new ArrayList<Integer>(1), "ArrayListTest initial capacity = 1", size);

        // Add first
//        listAddFirstElementTest(new ArrayList<Integer>(size + 1), "ArrayListTest initial capacity = size", size);
//        listAddFirstElementTest(new ArrayList<Integer>(1), "ArrayListTest initial capacity = 1", size);
        listAddFirstElementTest(new LinkedList(), "LinkedListTest", size);

        MemoryPrinter.printMemoryUsage();
    }

    private static void listAddElementTest(List list, String taskName, int size) {
        System.out.println(
            new TimeMesuredTask(taskName, new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < size; i++) {
                        list.add(i);
                    }
                }
            }).runTask().reportInMillis()
        );
    }

    private static void listAddFirstElementTest(List list, String taskName, int size) {
        System.out.println(
            new TimeMesuredTask(taskName, new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < size; i++) {
                        list.add(0, i);
                    }
                }
            }).runTask().reportInMillis()
        );
    }

}
