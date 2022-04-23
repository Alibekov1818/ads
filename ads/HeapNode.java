public class HeapNode {
    private int value;
    private HeapNode leftChild;
    private HeapNode rightChild;

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftChild(HeapNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(HeapNode rightChild) {
        this.rightChild = rightChild;
    }

    public HeapNode getLeftChild() {
        return leftChild;
    }

    public HeapNode getRightChild() {
        return rightChild;
    }

    public int getValue() {
        return value;
    }
}
