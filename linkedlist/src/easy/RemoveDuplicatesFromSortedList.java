package easy;

public class RemoveDuplicatesFromSortedList {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insert(1);
    ll.insert(1);
    ll.insert(2);
    ll.insert(3);
    ll.insert(3);

    Node head = ll.head;

    Node result = deleteDuplicates(head);

    while (result != null) {
      System.out.println(result.val);
      result = result.next;
    }
  }

  static Node deleteDuplicates(Node head) {
    Node temp = head;

    while (temp != null && temp.next != null) {
      if (temp.val == temp.next.val) {
        temp.next = temp.next.next;
      } else {
        temp = temp.next;
      }
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
}
