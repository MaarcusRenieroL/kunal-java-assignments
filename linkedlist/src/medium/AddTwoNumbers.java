package medium;

public class AddTwoNumbers {
  public static void main(String[] args) {
    LL l1 = new LL();
    l1.add(2);
    l1.add(4);
    l1.add(3);
    l1.print();

    LL l2 = new LL();
    l2.add(5);
    l2.add(6);
    l2.add(4);
    l2.print();

    Node result = addTwoNumbers(l1.head, l2.head);
    LL l3 = new LL();

    while (result != null) {
      l3.add(result.val);
      result = result.next;
    }

    l3.print();
  }

  static Node addTwoNumbers(Node l1, Node l2) {
    int sum = 0, carry = 0;
    Node dummy = new Node(0);
    Node temp = dummy;

    while (l1 != null || l2 != null) {
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      sum += carry;

      carry = sum / 10;

      temp.next = new Node(sum % 10);

      sum = 0;

      temp = temp.next;
    }

    if (carry > 0) {
      temp.next = new Node(carry);
    }

    return dummy.next;
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
