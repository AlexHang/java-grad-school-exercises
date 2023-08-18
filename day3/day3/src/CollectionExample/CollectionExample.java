package CollectionExample;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Ana");
        set.add("Maria");
        set.add("Andrei");
        set.add("Mihai");
        set.add("Ana");
        System.out.println(set);


        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5, 6, 0, 2, 3 };
        Set<Integer> targetSet = new HashSet<>(Arrays.asList(sourceArray));
        System.out.println(targetSet);

        Integer[] secondArr = new Integer[20];
        int index = 0;
        for(Integer e: targetSet){
            secondArr[index++] = e;
        }

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        Set<Integer> newSet = new HashSet<>(myList);
    }

}
