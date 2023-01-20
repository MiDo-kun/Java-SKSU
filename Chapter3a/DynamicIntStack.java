package Chapter3a;

public class DynamicIntStack {

  private IntStackNode top;

  class IntStackNode {
    int data;
    IntStackNode next;

    IntStackNode(int n) {
      data = n;
      next = null;
    }
  }

  void push(int n) {
    // No need to check for overflow
    IntStackNode node = new IntStackNode(n);
    node.next = top;
    top = node;
  }

  int pop() {
    if (isEmpty()) {
      return -1;
    } else {
      int n = top.data;
      top = top.next;
      return n;
    }
  }

  boolean isEmpty() {
    return top == null;
  }

  public static void main(String args[]) {
    DynamicIntStack stack = new DynamicIntStack();
    stack.push(5);
    stack.push(10);

    // print elements of the stack
    IntStackNode currNode = stack.top;
    while (currNode != null) {
      System.out.println(currNode.data);
      currNode = currNode.next;
    }
  }
}
