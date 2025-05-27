import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class Day10_2 {

    public static Node removeDuplicates(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers in the list? ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Enter " + n + " numbers in sorted order:\n");
        int firstValue = input.nextInt();
        Node head = new Node(firstValue);
        Node current = head;

        for (int i = 1; i < n; i++) {
            int nextValue = input.nextInt();
            current.next = new Node(nextValue);
            current = current.next;
        }

        System.out.print("Original list: ");
        printList(head);

        Node newHead = removeDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(newHead);
    }
}
