public class MyStack<T> {
    private Object[] arr;
    private int size = 0;

    public boolean empty(){
        return size==0;
    }

    public int size(){
        return size;
    }

    public T peek() {
        return (T)arr[size-1];
    }

    public T push(T value) {
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

    public T pop(){
        Object[] tmp = new Object[size-1];
        for(int i=0;i<size-1;i++){
            tmp[i]=arr[i];
        }
        T tmpObject = (T)arr[size-1];
        arr = tmp;
        tmp = null;
        size--;
        return tmpObject;
    }
}
