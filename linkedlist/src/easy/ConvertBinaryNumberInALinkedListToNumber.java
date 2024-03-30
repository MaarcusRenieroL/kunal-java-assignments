public class ConvertBinaryNumberInALinkedListToNumber {
  public static void main(String[] args) {
    LL ll = new LL();

    ll.insert(1);
    ll.insert(0);
    ll.insert(1);

    Node head = ll.head;

    System.out.println(getDecimalValue(head));
  }

  static int getDecimalValue(Node head) {
    int result = 0;

    while (head != null) {
      result = result * 2 + head.val;
      head = head.next;
    }

    return result;
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
