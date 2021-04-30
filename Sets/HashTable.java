import java.util.LinkedList;

public class HashTable {
    private class Entry{
        public int key;
        public String value;

        Entry(int key, String value){
            this.key = key;
            this.value = value;
        }
        
    }
    private LinkedList<Entry>[] entries = new LinkedList[5];
    private Entry entry;

    public void put(int key, String value){
        var index = hash(key);
        if(entries[index] == null){
            entries[index] = new LinkedList<>();
        }
        var entry = new Entry(key,value);
        entries[index].addLast(entry);
        
    }

    private int hash(int key){
        return key%entries.length;
    }

}
