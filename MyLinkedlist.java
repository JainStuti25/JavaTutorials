public class MyLinkedlist{
  Node head;
  void add(int data){
    Node toAdd = new Node(data);
    
    if(isEmpty()){
      head = toAdd;
      return;
    }
    
    while(temp.next != null){
      temp = temp.next;
    }
    temp.next = toAdd;
  }
  
  void print(){
    Node temp= head;
    while (temp.next != null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
  
  boolean isEmpty(){
    return head == null;
  }
  
  static class Node{
    int data;
    Node next;
    
    public Node(int data){
      this.data = data;
      next = null;
    }
  }
}
