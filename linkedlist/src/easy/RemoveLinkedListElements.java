package easy;

public class RemoveLinkedListElements {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insert(1);
    ll.insert(2);
    ll.insert(6);
    ll.insert(3);
    ll.insert(4);
    ll.insert(5);
    ll.insert(6);

    Node head = ll.head;

    Node result = removeElements(head, 6);

    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }

  static Node removeElements(Node head, int val) {
    Node temp = new Node(0), current = temp;
    temp.next = head;

    while (current.next != null) {
      if (current.next.val == val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }

    return temp.next;
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
