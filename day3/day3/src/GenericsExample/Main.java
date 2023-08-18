package GenericsExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        GenericContainer<String, Integer> container1 = new GenericContainer<>();
        container1.setMyValue("abc");

        GenericContainer<Integer, Double> container2 = new GenericContainer<>();
        container2.setMyValue(123);

        List<Double> myList = new ArrayList<>();
    }

}
