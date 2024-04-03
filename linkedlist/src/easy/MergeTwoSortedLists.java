package easy;

public class MergeTwoSortedLists {
  public static void main(String[] args) {
    Node l1 = new Node(1);
    l1.next = new Node(2);
    l1.next.next = new Node(4);

    Node l2 = new Node(1);
    l2.next = new Node(3);
    l2.next.next = new Node(4);

    Node result = mergeTwoLists(l1, l2);
    while (result != null) {
      System.out.println(result.data);
      result = result.next;
    }
  }

  static Node mergeTwoLists(Node l1, Node l2) {
    Node h = new Node(0);
    Node t = h;

    while (l1 != null && l2 != null) {
      if (l1.data < l2.data) {
        t.next = l1;
        l1 = l1.next;
        t = t.next;
      } else {
        t.next = l2;
        l2 = l2.next;
        t = t.next;
      }
    }

    t.next = (l1 != null) ? l1 : l2;

    return h.next;
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
