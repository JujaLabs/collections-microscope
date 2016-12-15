package juja.webinar.collections.generics;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class GenericsDemo {

    public static void main(String[] args) {
        // No generics - any object
//        Collection collection = new ArrayList();
//        collection.add("STR1");
//        collection.add("STR2");
//        collection.add("STR3");
//        collection.add(Integer.valueOf(10));
//        System.out.println(collection);

        // Allows only strings
        Collection<String> onlyStrings = new ArrayList<>();
        onlyStrings.add("STR1");
        onlyStrings.add("STR2");
        onlyStrings.add("STR3");

        //compilation error

//        onlyStrings.add(Integer.valueOf(10));
    }

    public static void inheritanceGenerics() {
        Collection<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(Float.valueOf(10.1F));
        numbers.add(Long.valueOf(100L));
    }
}
