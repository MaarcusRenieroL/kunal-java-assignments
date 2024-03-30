public class DeleteNodeInALinkedList {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insert(4);
    ll.insert(5);
    ll.insert(1);
    ll.insert(9);

    Node head = ll.head;

    deleteNode(head.next);

    while (head != null) {
      System.out.println(head.val);
      head = head.next;
    }

  }

  static void deleteNode(Node node) {
    node.val = node.next.val;
    node.next = node.next.next;
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
