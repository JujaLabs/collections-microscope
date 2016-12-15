package juja.webinar.collections.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class ArrayListDemo {

    private List<String> webinarParticipants = new ArrayList<>();

    public ArrayListDemo() {
        webinarParticipants.add("Tor");
    }

    public List<String> getWebinarParticipants() {
        return Collections.unmodifiableList(this.webinarParticipants);
    }

    public static void main(String[] args) {

        addElements();
//        capacityGrow();
    }

    private static void addElements() {
        List<String> strings = new ArrayList<>();
        strings.add("STR_1");
        strings.add("STR_2");
        strings.add("STR_3");
        strings.add("STR_4");
        strings.add("STR_5");
        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(strings.get(2));
        System.out.println(strings.contains("STR_2"));
        strings.remove(2);
        System.out.println(strings);

        String[] strArray = strings.toArray(new String[strings.size()]);

    }

    private static void capacityGrow() {
        // Check capacity grow
        System.out.println("Check capacity grow");
        List<String> strings = new ArrayListWrapper<>(100);
        for (int i = 0; i < 100; i++) {
            strings.add("STR_" + i);
        }
    }

}
