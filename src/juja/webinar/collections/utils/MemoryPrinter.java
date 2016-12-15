package juja.webinar.collections.utils;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class MemoryPrinter {

    public static void printMemoryUsage() {
        MemoryUsage heapMemoryUsage = ManagementFactory.getMemoryMXBean().getHeapMemoryUsage();
        final long used = heapMemoryUsage.getUsed();
        System.out.println((used / 1024) + " KB used ");
    }
}
