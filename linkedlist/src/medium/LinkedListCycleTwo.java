package medium;

public class LinkedListCycleTwo {

  public static void main(String[] args) {
    LL ll = new LL();
    ll.insert(3);
    ll.insert(2);
    ll.insert(0);
    ll.insert(-4);

    Node head = ll.head;
    while (head != null) {
      System.out.print(head.val + " ");
      head = head.next;
    }

    System.out.println();

    Node temp = ll.head;
    while (temp.next != null) {
      temp = temp.next;
    }

    temp.next = ll.head.next.next;

    Node cycleNode = detectCycle(ll.head);
    System.out.println(cycleNode.val);

  }

  static Node detectCycle(Node head) {
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        Node temp = head;

        while (temp != slow) {
          temp = temp.next;
          slow = slow.next;
        }

        return temp;
      }
    }

    return null;
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
