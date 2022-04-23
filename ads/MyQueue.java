public class MyQueue<T> {
    private Object[] arr;
    private int size = 0;

    public boolean empty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public T peek() {
        return (T)arr[0];
    }

    public T enqueue(T value) {
        Object[] tmp = new Object[size+1];
        for(int i=0;i<size;i++){
            tmp[i]=arr[i];
        }
        tmp[size] = value;
        arr = tmp;
        tmp = null;
        size++;
        return value;
    }

    public T dequeue(){
        T tmpObject = null;
        if(size>1){
            Object[] tmp = new Object[size-1];
            for(int i=0;i<size-1;i++){
                tmp[i]=arr[i+1];
            }
            tmp[size-2] = arr[size-1];
            tmpObject = (T)arr[0];
            arr = tmp;
            tmp = null;
            size--;
        }
        else{
            tmpObject = (T)arr[0];
            arr = null;
            size = 0;
        }
        return tmpObject;
    }
}
