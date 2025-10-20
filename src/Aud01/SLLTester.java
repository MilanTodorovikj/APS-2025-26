package Aud01;

public class SLLTester {

    public static void main(String[] args) {
        SLL<Integer> lista = new SLL<Integer>();

        lista.insertLast(5);
        System.out.print("Listata po vmetnuvanje na 5 kako posleden element: ");
        System.out.println(lista.toString());


        lista.insertFirst(3);
        System.out.print("Listata po vmetnuvanje na 3 kako prv element: ");
        System.out.println(lista.toString());

        lista.insertLast(1);
        System.out.print("Listata po vmetnuvanje na 1 kako posledent element: ");
        System.out.println(lista.toString());

        lista.deleteFirst();
        System.out.print("Listata po brisenje na prviot element: ");
        System.out.println(lista.toString());

        SLLNode<Integer> element = lista.find(5);
        lista.insertBefore(2, element);
        System.out.print("Listata po vmetnuvanje na elementot 2 pred elementot 5: ");
        System.out.println(lista.toString());

        element = lista.find(1);
        lista.insertAfter(3, element);
        System.out.print("Listata po vmetnuvanje na elementot 3 po elementot 1: ");
        System.out.println(lista.toString());


        System.out.println("Momentalna dolzina na listata: " + lista.size());

        System.out.print("Listata po prevrtuvanje: ");
        lista.mirror();
        System.out.println(lista.toString());

        element = lista.find(2);
        lista.delete(element);
        System.out.print("Listata po brisenje na elementot 2: ");
        System.out.println(lista.toString());

        System.out.println("Momentalna dolzina na listata: " + lista.size());

        lista.deleteList();
        System.out.print("Pecatenje na listata po nejzino brisenje: ");
        System.out.println(lista.toString());
        System.out.println("Momentalna dolzina na listata: " + lista.size());

    }

}
