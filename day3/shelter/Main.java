import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Animal> animalList = new LinkedList<>();
        Animal<Dog> dogAnimal1 = new Animal<>("dsad");
        dogAnimal1.setAge(1);
        Animal<Dog> dogAnimal2 = new Animal<>("ad");
        dogAnimal2.setAge(2);
        Animal<Dog> dogAnimal3 = new Animal<>("ad");
        dogAnimal3.setAge(3);
        Animal<Dog> dogAnimal4 = new Animal<>("dsd");
        dogAnimal4.setAge(4);
        animalList.add(dogAnimal2);
        animalList.add(dogAnimal1);
        animalList.add(dogAnimal3);
        animalList.add(dogAnimal4);
        Set<Animal> animalSet = new TreeSet<>(animalList);

        for (Animal<Dog> x : animalSet) {
            System.out.println(x);
        }


    }
}