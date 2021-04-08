/*******************
Name:Brendan McCullagh

Date:20210318

Notes: The best coding happens after dark
*******************/

// Java program for reversing the linked list

class MyLinkedList 
{

   static Node head;

   static class Node 
   {

   int data;
   Node next;

   Node(int d) 
   {

      data = d;
      next = null;
  
   }

 }

/* Function to reverse the linked list */
Node reverse(Node node) {

   Node firstNode;
   
   if (node.next == null)
   {
   
      return node;
      
   }
   
   firstNode = reverse(node.next);
   
   node.next.next = node;
   
   node.next = null; 
   
   return firstNode; 
   
   }

   // prints content of double linked list
   void printList(Node node) 
   {
   
   while (node != null) 
   {

   System.out.print(node.data + " ");
   node = node.next;
   
  }
  
}

   public static void main(String[] args) 
   {
   
      MyLinkedList myAssignmentList = new MyLinkedList();
      
      myAssignmentList.head = new Node(10);
      myAssignmentList.head.next = new Node(20);
      myAssignmentList.head.next.next = new Node(30);
      myAssignmentList.head.next.next.next = new Node(40);
      myAssignmentList.head.next.next.next.next = new Node(50);
      
      System.out.println("\n------------------------------------");
      
      System.out.println("Original Linked List");
      myAssignmentList.printList(myAssignmentList.head);
      
      myAssignmentList.head = myAssignmentList.reverse(myAssignmentList.head);
      
      System.out.println("\n----------------------------------------");
      
      System.out.println("Recursively Reversed Linked List "); 
      myAssignmentList.printList(head); 
      
      System.out.println("\n------------------------------- ");
      
   }
   
}