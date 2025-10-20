package Aud01;

class Student {
    String index;
    String name;

    public Student(String index, String name) {
        this.index = index;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.index.equals(((Student) obj).index);
    }
}

public class ArrayTester {
    public static void main(String[] args) {
        Array<Integer> niza = new Array<Integer>(1);

        niza.insertLast(4);
        System.out.print("Nizata po vmetnuvanje na 4 kako posleden element: ");
        System.out.println(niza.toString());

        niza.insertLast(7);
        niza.insertLast(13);
        System.out.print("Nizata po vmetnuvanje na 7 i 13 kako elementi: ");
        System.out.println(niza.toString());

        niza.insert(1, 3);
        System.out.println(niza.toString());
        System.out.print("Nizata po dodavanje na 3 kako element na pozicija 1: ");

        niza.set(2, 6);
        System.out.print("Nizata po menuvanje na vrednosta na elementot na pozicija 2 vo 6: ");
        System.out.println(niza.toString());

        niza.delete(0);
        System.out.print("Nizata po brishenje na elementot na pozicija 0 (prviot element): ");
        System.out.println(niza.toString());

        System.out.print("Na pozicija 2 vo nizata sega se naogja: ");
        System.out.println(niza.get(2));

        System.out.print("Brojot 3 sega se naogja vo nizata na pozicija: ");
        System.out.println(niza.find(3));

        System.out.print("Sega na krajot goleminata na nizata e: ");
        System.out.println(niza.getSize());

        Array<Student> studentArray = new Array<Student>(3);
        studentArray.insertLast(new Student("111111", "Milan"));
        studentArray.insertLast(new Student("111111", "Marko"));
        Student student = new Student("111111", "Marko");
        System.out.println(studentArray.find(student));
    }
}
