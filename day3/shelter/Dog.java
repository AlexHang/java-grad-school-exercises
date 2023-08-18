public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, int age, double[] foodHistory, Boolean isHungry, Boolean isThirsty) {
        super(name, age, foodHistory, isHungry, isThirsty);
    }
}
