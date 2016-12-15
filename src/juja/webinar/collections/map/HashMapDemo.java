package juja.webinar.collections.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author viktor email kuchin.victor@gmail.com
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<MapKey, String> hashMap = new HashMap<>();

        MapKey key3 = new MapKey(33);
        hashMap.put(key3, "value3");
        MapKey key1 = new MapKey(10);
        hashMap.put(key1, "value1");
        MapKey key2 = new MapKey(210);
        hashMap.put(key2, "value2");
        hashMap.put(null, null);

        System.out.println("Map=" + hashMap);
    }

    static class MapKey {
        private int key;

        MapKey(int key) {
            this.key = key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof MapKey)) return false;

            MapKey mapKey = (MapKey) o;

            if (key != mapKey.key) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return (int) key;
        }

        @Override
        public String toString() {
            return "key" + key;
        }
    }

}
