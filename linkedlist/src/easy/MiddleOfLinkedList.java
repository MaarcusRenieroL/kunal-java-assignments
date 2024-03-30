package easy;

public class MiddleOfLinkedList {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);

    Node head = ll.head;

    Node middle = middleNode(head);

    System.out.println(middle.val);
  }

  static Node middleNode(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
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
}
