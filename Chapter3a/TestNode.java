package Chapter3a;

public class TestNode {
  public static void main(String args[]) {
    // Node emptyList = null; // Emtpy List

    // head points to 1st node in the list
    Node head = new Node();

    // initialize the first node in the list 
    head.data = 5;
    head.nextNode = new Node();
    head.nextNode.data = 10;
   
    // null makrs the end of the list
    head.nextNode.nextNode = null;

    // print elements of the list
    Node currNode = head;
    while (currNode != null) {
      System.out.println(currNode.data);
      currNode = currNode.nextNode;
    }
  }
}
