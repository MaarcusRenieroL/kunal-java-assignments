package medium;

public class SortList {
  public static void main(String[] args) {
    LL l = new LL();

    l.add(4);
    l.add(2);
    l.add(1);
    l.add(3);

    l.head = sortList(l.head);
    l.show();
  }

  static ListNode sortList(ListNode h) {
    if (h == null || h.next == null) {
      return h;
    }

    ListNode m = findMid(h), l = sortList(h), r = sortList(m);

    return merge(l, r);
  }

  static ListNode findMid(ListNode h) {
    ListNode s = h, f = h;

    while (f != null && f.next != null && f.next.next != null) {
      s = s.next;
      f = f.next.next;
    }

    ListNode m = s.next;
    s.next = null;

    return m;
  }

  static ListNode merge(ListNode l, ListNode r) {
    ListNode d = new ListNode(), t = d;

    while (l != null && r != null) {
      if (l.val < r.val) {
        t.next = l;
        l = l.next;
      } else {
        t.next = r;
        r = r.next;
      }

      t = t.next;
    }

    if (l != null) {
      t.next = l;
    }

    if (r != null) {
      t.next = r;
    }

    return d.next;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class LL {
  ListNode head;

  void add(int val) {
    ListNode newNode = new ListNode(val);
    if (head == null) {
      head = newNode;
    } else {
      ListNode temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  void print() {
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  void show() {
    ListNode node = head;

    while (node != null) {
      System.out.print(node.val + " -> ");
      node = node.next;
    }

    System.out.println("END");

  }

}
