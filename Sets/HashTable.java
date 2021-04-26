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
    private LinkedList<Entry> list = new LinkedList<>();
    private Entry entry;

    public void put(int k, String value){
        entry = new Entry(k,value);
        list.add(entry);
    }

    public String get(int key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key == key)
            return list.get(i).value;
        }
        return "Not found"; /// FIIIXXXXXXXXXXXX
    }

    public void remove(int key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).key == key)
            list.remove(list.get(i));
        }
    }

    
}
