import java.util.Arrays;

public class Animal<T> implements Comparable<Animal>{
    private String name;
    private int age;
    private double[] foodHistory;
    private Boolean isHungry;
    private Boolean isThirsty;

    public Animal(String name){
        this.name = name;
    }
    public Animal(String name, int age, double[] foodHistory, Boolean isHungry, Boolean isThirsty) {
        this.name = name;
        this.age = age;
        this.foodHistory = foodHistory;
        this.isHungry = isHungry;
        this.isThirsty = isThirsty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getFoodHistory() {
        return foodHistory;
    }

    public void setFoodHistory(double[] foodHistory) {
        this.foodHistory = foodHistory;
    }

    public Boolean getHungry() {
        return isHungry;
    }

    public void setHungry(Boolean hungry) {
        isHungry = hungry;
    }

    public Boolean getThirsty() {
        return isThirsty;
    }

    public void setThirsty(Boolean thirsty) {
        isThirsty = thirsty;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", foodHistory=" + Arrays.toString(foodHistory) +
                ", isHungry=" + isHungry +
                ", isThirsty=" + isThirsty +
                '}';
    }


    @Override
    public int compareTo(Animal o) {
        return this.age - o.age;
    }
}
