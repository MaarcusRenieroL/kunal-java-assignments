package medium;

public class RemoveNthNodeFromEndOfList {
  public static void main(String[] args) {
    LL ll = new LL();
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);

    Node head = ll.head;
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }

    System.out.println();

    Node newHead = removeNthFromEnd(ll.head, 2);
    while (newHead != null) {
      System.out.print(newHead.val + " ");
      newHead = newHead.next;
    }
    System.out.println();
  }

  static Node removeNthFromEnd(Node head, int n) {
    Node temp = head;
    int length = 0;

    while (temp != null) {
      length++;
      temp = temp.next;
    }

    int targetIndex = length - n;

    if (targetIndex == 0) {
      return head.next;
    } else {
      temp = head;

      for (int i = 0; i < targetIndex - 1; i++) {
        temp = temp.next;
      }

      temp.next = temp.next.next;
    }

    return head;
  }
}

class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class LL {
  Node head;

  LL() {
    head = null;
  }

  void insert(int val) {
    Node newNode = new Node(val);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}
