import java.util.*;

public class Main {
    static class LFUCache {
        int capacity;
        int minFreq;
        Map<Integer, Integer> values = new HashMap<>();

        Map<Integer, Integer> frequency = new HashMap<>();
        Map<Integer, LinkedHashSet<Integer>> freqMap = new HashMap<>();

        LFUCache(int capacity) {
            this.capacity = capacity;
        }
        public int get(int key) {

            if (!values.containsKey(key)) {
                return -1;
            }

            increaseFrequency(key);

            return values.get(key);
        }

        public void put(int key, int value) {

            if (capacity == 0) {
                return;
            }

            if (values.containsKey(key)) {
                values.put(key, value);
                increaseFrequency(key);
                return;
            }
            if (values.size() == capacity) {

                LinkedHashSet<Integer> keys = freqMap.get(minFreq);

                int removeKey = keys.iterator().next();

                keys.remove(removeKey);
                values.remove(removeKey);
                frequency.remove(removeKey);

                if (keys.isEmpty()) {
                    freqMap.remove(minFreq);
                }
            }
            values.put(key, value);
            frequency.put(key, 1);

            freqMap
                .computeIfAbsent(1, k -> new LinkedHashSet<>())
                .add(key);

            minFreq = 1;
        }

        private void increaseFrequency(int key) {

            int oldFreq = frequency.get(key);
            int newFreq = oldFreq + 1;
            LinkedHashSet<Integer> oldSet = freqMap.get(oldFreq);
            oldSet.remove(key);

            if (oldSet.isEmpty()) {
                freqMap.remove(oldFreq);

                if (minFreq == oldFreq) {
                    minFreq = newFreq;
                }
            }
            frequency.put(key, newFreq);
            freqMap
                .computeIfAbsent(newFreq, k -> new LinkedHashSet<>())
                .add(key);
        }
    }
    public static void main(String[] args) {

        LFUCache cache = new LFUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1)); // 10
        cache.put(3, 30);
        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(1)); // 10
    }
}
