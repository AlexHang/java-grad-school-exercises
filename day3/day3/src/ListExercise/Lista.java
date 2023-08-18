package ListExercise;

public class Lista {
    private class Node {
        private int val;
        private Node next;

        public Node() {}

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node start;

    public Lista(){
        this.start = null;
    }

    public void printList(){
        Node current = this.start;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }
    }

    public void add(int val){
        Node newNode = new Node(val);
        if ( start == null){
            start = newNode;
        }else{
            Node current =  this.start;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public int size(){
        int size = 0;
        Node current = this.start;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    public void addAtPosition(int position, int val){
        if(position < 0 || position > this.size()){
            throw new IndexGreaterThanListSizeException();
        }
        Node newNode = new Node(val);
        int index = 0;
        Node current = this.start;
        if(start == null){
            throw new IndexGreaterThanListSizeException();
        }
        if(position == 0){
            Node aux = this.start;
            this.start = newNode;
            this.start.next = aux;
        }
        while (current != null && index != position-1){
            index++;
            current = current.next;
        }

        Node nextVal = current.next;
        current.next = newNode;
        newNode.next = nextVal;
    }



}
