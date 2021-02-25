
public class NoelArray {
    private int size = 0, index = 0;
    private int[] arr;

    public NoelArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void insert(int num) {
        if (index >= size) {
            int[] copyarr = new int[size*2];// create the array + 1 space
            for (int i = 0; i <= size; i++)// use this loop to copy all elements to copyarr
                copyarr[i] = arr[i]; // last element to the element passed in parameter when i <= to size
            size +=1; // adding one to the size so it wont be bothered in the rest of the class
            arr = new int[size]; // make the boss arr a new int size+1, REMEMBER THE SIZE CHANGED
            for(int i=0; i<size;i++){ // copy all elements from copyarr to arr
                arr[i] = copyarr[i];
            }

        }
        arr[index++] = num;
    }

    public void removeAt(int D_index) {
        if (D_index < size && D_index > -1) { // bounds of the array
            arr[D_index] = 0; // "deleting the uh... object"
            for (int i = D_index; i < size - 1; i++) { // initializing the number to the next one
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0; // last number to 0;
            size--;
        }
    }

    public int indexOf(int num){
       
        for(int i=0; i<size;i++){
            if(arr[i] == num)
            return i;
        }
        return -1;
    }

    public void print(){
        for(int i = 0; i< size; i++){
            
        }
    }

}
