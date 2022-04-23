public class main {
    public static void main(String[] args) {
//        MyStack<Integer> arr = new MyStack<>();
//
//        arr.push(1);
//        arr.push(2);
//        arr.push(3);
//        arr.push(4);
//
//        System.out.println(arr.peek());
//
//        while(!arr.empty()){
//            System.out.println(arr.pop());
//        }

//        MyQueue<Integer> arr = new MyQueue<>();
//
//        arr.enqueue(1);
//        arr.enqueue(2);
//        arr.enqueue(3);
//        arr.enqueue(4);
//
//        System.out.println(arr.peek());
//
//        while(!arr.empty()){
//            System.out.println(arr.dequeue());
//        }
//
//        MyHeap arr = new MyHeap();
//
//        arr.insert(1);
//        arr.insert(0);
//        arr.insert(-1);
//
//        arr.extractMin();
//
//
//        arr.show();

        //Next Greater Element (NGE)
        int[] arr = {1,3,2,5,3,1,7,89,3,6,3};

        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.print(arr[j]);
                    System.out.print(' ');
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.print("-1 ");
                found = false;
            }
        }
    }
}
