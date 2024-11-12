import java.util.*;
import java.io.*;
import java.lang.*;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

        System.out.println("Enter the number of elements in the linked list:");
        int size = sc.nextInt();
        
        ListNode head = obj.createList(size, sc);
        
        System.out.print("Original list: ");
        obj.printList(head);
        
        head = obj.deleteDuplicates(head);
        
        System.out.print("List after removing duplicates: ");
        obj.printList(head);
    }
}

class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode createList(int size, Scanner sc) {
        ListNode head = null;
        ListNode tail = null;
        
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }
}
