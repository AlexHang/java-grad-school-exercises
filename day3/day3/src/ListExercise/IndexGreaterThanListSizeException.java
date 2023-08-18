package ListExercise;

public class IndexGreaterThanListSizeException extends RuntimeException{
    public IndexGreaterThanListSizeException(){
        super("The index cannot be greater than the list size");
    }
}
