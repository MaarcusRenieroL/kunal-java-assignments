package easy;

public class LinkedListCycle {

  static boolean hasCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtFirst(1);

    ll.insertAtLast(2);
    ll.insertAtLast(3);
    ll.insertAtLast(4);
    ll.insertAtLast(5);
    ll.insertAtLast(6);
    ll.insertAtLast(7);
    ll.insertAtLast(8);
    ll.insertAtLast(9);
    ll.insertAtLast(10);

    Node head = ll.head;

    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = head.next.next.next;

    System.out.println(hasCycle(head));
  }
}

class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }

  Node(int data, Node next) {
    this.data = data;
    this.next = next;
  }
}

class LL {
  Node head;
  Node tail;

  int size = 0;

  LL() {
    this.head = null;
  }

  void insertAtFirst(int value) {
    Node node = new Node(value);
    node.next = head;

    head = node;

    if (tail == null) {
      tail = head;
    }

    size += 1;
  }

  void insertAtLast(int value) {
    Node node = new Node(value);

    if (tail == null) {
      insertAtFirst(value);
    } else {
      tail.next = node;
      tail = node;

      size += 1;
    }

  }
}
