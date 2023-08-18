import ListExercise.Lista;

public class Main {

    public static void main(String[] args) {
        Lista myList = new Lista();
        myList.add(2);
        myList.add(3);
        myList.add(5);
        myList.printList();
        myList.addAtPosition(100, 5);
    }
}