package easy;

public class ReverseLinkedList {
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

    Node reversedHead = reverseList(ll.head);
    while (reversedHead != null) {
      System.out.print(reversedHead.val + " ");
      reversedHead = reversedHead.next;
    }
    System.out.println();
  }

  static Node reverseList(Node head) {
    Node newHead = null;
    while (head != null) {
      Node next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }

    return newHead;
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
