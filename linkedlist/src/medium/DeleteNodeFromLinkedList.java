package medium;

public class DeleteNodeFromLinkedList {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insertAtFirst(1);
    ll.insertAtLast(2);
    ll.insertAtLast(3);
    ll.insertAtLast(4);
    ll.insertAtLast(5);

    deleteNode(ll.h.next.next);

    Node temp = ll.h;

    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }

  static void deleteNode(Node node) {
    node.data = node.next.data;
    node.next = node.next.next;
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
  Node h;

  LL() {
    this.h = null;
  }

  void insertAtFirst(int v) {
    Node n = new Node(v);

    n.next = h;
    h = n;
  }

  void insertAtLast(int v) {
    Node n = new Node(v);
    Node t = h;

    while (t.next != null) {
      t = t.next;
    }

    t.next = n;
    t = n;
  }
}
