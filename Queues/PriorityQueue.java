public class PriorityQueue {
    int[] items;
    int count = 0;

    public PriorityQueue(int size){
        items = new int[size];
    }

    public void insert(int number) {
        if (count == 0) {
            items[0] = number;
            count++;
        } else {
            for (int i = count-1; i >=0; i--) {
                if (number < items[i]) {
                    items[i + 1] = items[i];

                } else if(items[i] > number) {
                    items[i] = number;
                    count++;
                    break;
                }
            }

        }
    }

    public void print(){
        for(int x:items){
            System.out.println(x);
        }
    }
}
