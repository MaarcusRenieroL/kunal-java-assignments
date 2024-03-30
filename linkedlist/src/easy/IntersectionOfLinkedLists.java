package easy;

public class IntersectionOfLinkedLists {
  public static void main(String[] args) {
    LL l1 = new LL();
    l1.add(4);
    l1.add(1);
    l1.add(8);
    l1.add(4);
    l1.add(5);
    l1.print();

    LL l2 = new LL();
    l2.add(5);
    l2.add(6);
    l2.add(1);
    l2.add(8);
    l2.add(4);
    l2.add(5);
    l2.print();

    Node result = getIntersectionNode(l1.head, l2.head);
    System.out.println(result.val);
  }

  static Node getIntersectionNode(Node headA, Node headB) {
    int lengthA = getLength(headA);
    int lengthB = getLength(headB);

    while (lengthA > lengthB) {
      lengthA--;
      headA = headA.next;
    }

    while (lengthB > lengthA) {
      lengthB--;
      headB = headB.next;
    }

    while (headA != headB) {

      headA = headA.next;
      headB = headB.next;
    }

    return headA;
  }

  static int getLength(Node head) {
    Node temp = head;
    int length = 0;

    while (temp != null) {
      length++;
      temp = temp.next;
    }

    return length;
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

  void add(int val) {
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
