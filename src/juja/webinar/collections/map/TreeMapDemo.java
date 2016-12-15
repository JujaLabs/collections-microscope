package juja.webinar.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        Map<TreeMapDemo.MapKey, String> treeMap = new TreeMap<>(new Comparator<MapKey>() {
            @Override
            public int compare(MapKey o1, MapKey o2) {
                return o1.key - o2.key;
            }
        });
        for (int i = 0; i < 50; i++) {
            treeMap.put(new TreeMapDemo.MapKey(i), i + "");

        }
        treeMap.put(new MapKey(1), null);
        System.out.println(treeMap);
    }

    static class MapKey{
        private int key;

        MapKey(int key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;

            TreeMapDemo.MapKey mapKey = (TreeMapDemo.MapKey) o;

            return this.key == mapKey.key;

        }

        @Override
        public int hashCode() {

            throw new UnsupportedOperationException();
        }

        @Override
        public String toString() {
            return "key" + key;
        }

//        @Override
        public int compareTo(TreeMapDemo.MapKey o) {
            return key - o.key;
        }
    }

}
