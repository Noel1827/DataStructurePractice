public class HashMap {
    private class Entry {
        int key, value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Entry[] container = new Entry[5];

    public void put(int key, int value) {
        int index = hash(key);
        if (container[index] != null) {
            if (container[index].key == key) {
                container[index].value = value;
                return;
            } else {
                int i = index + 1;
                while (i != index) {
                    if (i == container.length)
                        i = 0;
                    if (container[i] != null && container[i].key == key) {
                        container[i].value = value;
                        return;
                    } else if (container == null) {
                        container[i] = new Entry(key, value);
                        return;
                    }
                    i++;
                }
            }
            container[index] = new Entry(key, value);

        }
    }

    public int get(int key) {
        for (var entry : container) {
            if (entry.key == key)
                return entry.value;
        }
        return -1;
    }

    private int hash(int key) {
        return key % container.length;
    }

    public int remove(int key){
        int index = hash(key);
        int temp = container[index].value;
        container[index] = null;
        return temp;
    }
}
