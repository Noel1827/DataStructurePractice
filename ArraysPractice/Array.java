public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
    public void insert(int item){
        
        if(items.length == count){
            int[] newItems = new int[count*2];
            
            for(int i=0; i< count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++]= item;
        
    }

    public void removeAt(int index){
        if(index >= count || index <0)
        throw new IllegalArgumentException("Index out of bounds");

        for(int i= index; i < count-1; i++){
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item){
        // if it finds the item, return index
        // otherwise, return -1
        for(int i=0; i<count; i++){
            if(items[i] == item)
            return i;
        }
        return -1;
    }

    public int max(){
        int max = items[0];
       for(int i=1; i<count; i++){
           if(items[i] > max)
           max=items[i];
       }
       return max;
    }

    public Array intersect(Array other){
        // find the items that are common in both arrays and insert them at the return array
        Array returnArray = new Array(0); //maybe error since it has no parameter
        for(int x: items){
            if(other.indexOf(x) >=0)
            returnArray.insert(x);
        }
        return returnArray;
    }

    

}
