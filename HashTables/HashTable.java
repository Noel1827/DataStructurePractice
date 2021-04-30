import java.util.LinkedList;

public class HashTable {
    private class Entry {
        public int key;
        public String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        int index = hash(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));
    }

    private Entry getEntry(int key){
        var bucket = getBucket(key);

        for(var entry: bucket){
            if(entry.key == key)
            return entry;
        }
        return null;
    }

    private int hash(int key) {
        return key % entries.length;
    }

    public String get(int key) {

        var entry = getEntry(key);
        return (entry == null)? null:entry.value;

    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    public void remove(int key) {
        var bucket = getBucket(key);

        if (bucket != null){
        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
    }
        throw new IllegalStateException();
    }
}
