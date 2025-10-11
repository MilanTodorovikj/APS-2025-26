package Aud00;

// Да се направи класа Box која ќе има можност да чува генерички тип T
// Create a Box class that has the ability to store a generic type T

class Box<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}

public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(5);
        System.out.println(integerBox.get());

        Box<Double> doubleBox = new Box<Double>();
        doubleBox.set(7.0);
        System.out.println(doubleBox.get());

        Box<String> stringBox = new Box<String>();
        stringBox.set("String inside box");
        System.out.println(stringBox.get());
    }
}