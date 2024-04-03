package easy;

public class PalindromeLinkedList {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtFirst(1);
    ll.insertAtLast(2);
    ll.insertAtLast(3);
    ll.insertAtLast(4);
    ll.insertAtLast(5);
    ll.insertAtLast(4);
    ll.insertAtLast(3);
    ll.insertAtLast(2);
    ll.insertAtLast(1);

    Node head = ll.head;

    System.out.println(new PalindromeLinkedList().isPalindrome(head));
  }

  private static final int[] array = new int[100_000];

  public boolean isPalindrome(Node head) {
    if (head == null || head.next == null) {
      return true;
    }
    Node h = head;
    final int[] array1 = array;
    int size = 0;

    while (h != null) {
      array1[size++] = h.val;
      h = h.next;
    }

    int m = size / 2;
    for (int i = 0; i < m; i++) {
      if (array[i] != array1[--size]) {
        return false;
      }
    }
    return true;
  }
}

class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }

  Node(int val, Node next) {
    this.val = val;
    this.next = next;
  }
}

class LL {
  Node head;
  Node tail;

  LL() {
    this.head = null;
  }

  void insertAtFirst(int v) {
    Node n = new Node(v);

    n.next = head;
    head = n;
  }

  void insertAtLast(int v) {
    Node n = new Node(v);
    Node t = head;

    while (t.next != null) {
      t = t.next;
    }

    t.next = n;
  }
}
