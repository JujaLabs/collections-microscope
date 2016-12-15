package juja.webinar.collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class MutableListDemo {

    public static void main(String[] args) {
        List<MutableListDemo.Element> elements = new ArrayList<>();
        final MutableListDemo.Element element = new MutableListDemo.Element("element1");
        elements.add(element);
        System.out.println(elements);
        System.out.println(elements.contains(new MutableListDemo.Element("element1")));
    }

    static class Element {
        String value;

        public Element(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Element{");
            sb.append("value='").append(value).append('\'');
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;

            MutableListDemo.Element element = (MutableListDemo.Element) o;

            return this.value != null ? this.value.equals(element.value) : element.value == null;

        }

        @Override
        public int hashCode() {
            return this.value != null ? this.value.hashCode() : 0;
        }
    }
}
