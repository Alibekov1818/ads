public class MyHeap {
    private HeapNode[] arr;
    private int size = 0;

    public boolean empty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public int getMin(){
        return arr[0].getValue();
    }

    public int extractMin(){
        int tmp =  arr[0].getValue();
        if(size==1){
            arr = null;
        }
        else{
            swap(0,size-1);
            HeapNode[] tmparr = new HeapNode[size-1];
            for(int i=0;i<size-1;i++){
                tmparr[i]=arr[i];
            }
            HeapNode parent  = arr[(size-2)/2];
            if ((size-1)%2==1){
                parent.setLeftChild(null);
            }
            else{
                parent.setRightChild(null);
            }
            arr = tmparr;
            tmparr = null;
            normalizeDown(0);
        }
        size--;
        return tmp;
    }

    public void insert(int value){
        if(size==0){
            arr = new HeapNode[1];
            arr[0] = new HeapNode();
            arr[0].setValue(value);
        }
        else{
            HeapNode[] tmp = new HeapNode[size+1];
            for(int i=0;i<size;i++){
                tmp[i]=arr[i];
            }
            tmp[size] = new HeapNode();
            tmp[size].setValue(value);
            if(size%2==1){
                tmp[(size-1)/2].setLeftChild(tmp[size]);
            }else{
                tmp[(size-1)/2].setRightChild(tmp[size]);
            }
            arr = tmp;
            tmp = null;
            normalize(size);
        }
        size++;
    }

    private void normalize(int index) {
        if(index!=0){
            if(arr[(index-1)/2].getValue()/*parent*/ > arr[index].getValue()){
                swap((index-1)/2, index);
                normalize((index-1)/2);
            }
        }
    }

    private void normalizeDown(int index) {
        if(index!=size-1){
            if(arr[index].getRightChild()!=null){
                if(arr[index].getLeftChild()!=null) {
                    if (arr[index].getRightChild().getValue() > arr[index].getLeftChild().getValue()) {
                        swap(index, index * 2 + 1);
                        normalizeDown(index * 2 + 1);
                    } else {
                        swap(index, index * 2 + 2);
                        normalizeDown(index * 2 + 2);
                    }
                }
            }
            else{
                if(arr[index].getLeftChild()!=null) {

                    if (arr[index].getLeftChild().getValue() < arr[index].getValue()) {
                        swap(index, index * 2 + 1);
                    }
                }
            }
        }
    }

    private void swap(int index1, int index2) {
        int tmp = arr[index1].getValue();
        arr[index1].setValue(arr[index2].getValue());
        arr[index2].setValue(tmp);
    }

    public void show(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i].getValue());
            System.out.print(" ");
        }
    }
}
