package Chapter3a;

public class Stack {
  public static void main(String args[]) {
    SeqStack myStack = new SeqStack(3);
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);

    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
    System.out.println(myStack.pop());
  }

  static public class SeqStack {
    int top = -1;
    int memSpace[];
    int limit;

    SeqStack() {
      memSpace = new int[10];
      limit = 10;
    }

    SeqStack(int size) {
      memSpace = new int[size];
      limit = size;
    }

    boolean push(int value) {
      top++;
      // check if the stack is full
      if (top < limit) {
        memSpace[top] = value;
      } else {
        top--;
        return false;
      }

      return true;
    }

    int pop() {
      int temp = -1;
      // Check if the stack is empty
      if (top >= 0) {
        temp = memSpace[top];
        top--;
      } else {
        return -1;
      }
      return temp;
    }
  }
}
