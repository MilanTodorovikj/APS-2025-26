package Aud01;

import java.util.Scanner;

public class EvenNumbersSLL {
    public static int evenNumbers(SLL<Integer> list) {
        int even = 0;

        SLLNode<Integer> tmp = list.getFirst();
        while (tmp != null) {
            if (tmp.element % 2 == 0) {
                even++;
            }

            tmp = tmp.succ;
        }

        return even;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vnesete go brojot na elementi vo listata:");
        int n = Integer.parseInt(sc.nextLine());

        SLL<Integer> list = new SLL<>();
        System.out.println("Vnesete gi elementite vo listata (celi broevi):");
        for (int i = 0; i < n; i++) {
            list.insertLast(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Brojot na parni broevi vo vnesenata lista e: " + evenNumbers(list));
    }
}


