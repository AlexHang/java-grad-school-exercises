package GenericsExample;

public class GenericContainer<T, V> {
    T myValue;
    V secondValue;
    public T getMyValue() {
        return myValue;
    }

    public void setMyValue(T myValue) {
        this.myValue = myValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(V secondValue) {
        this.secondValue = secondValue;
    }
}
