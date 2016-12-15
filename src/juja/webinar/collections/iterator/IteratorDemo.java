package juja.webinar.collections.iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class IteratorDemo {

    public static void main(String[] args) {
        Collection<Number> numbers = IntStream.range(10, 20).boxed().collect(Collectors.toList());
        System.err.println(numbers);
        // Old style till java 1.5
        Iterator<Number> iterator = numbers.iterator();
        Iterator<Number> iterator1 = numbers.iterator();

        System.err.println("Old style iterating");
        while (iterator.hasNext()) {
            Number number = iterator.next();
            System.err.print(number + " ");

            if (number.equals(15)) {
                iterator.remove();
            }
        }
        System.err.println();
        System.err.println("After remove");
        System.err.println(numbers);

        // New style since java 1.5
        System.err.println("Old style iterating for each");
        for (Number number : numbers) {
            System.err.print(number + " ");
        }

        while (iterator1.hasNext()) {
            Number number = iterator1.next();
            System.err.print(number + " ");
        }

    }
}
