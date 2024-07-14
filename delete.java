import java.util.Scanner;
public class delete {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }
    delete(){
        head = null;
    }
public void deletebegin() {
	head=head.next;
}
public void deleteposition(int h) {
	Node temp=head;
	Node prev=null;
	for(int i=1;i<h;i++) {
		prev=temp;
		temp=temp.next;
	}
	prev.next=temp.next;
}
public void deleteend() {
	Node temp=head;
	Node  prev=null;
	while(temp.next!=null) {
		prev=temp;
		temp=temp.next;
	}
	prev.next=null;
}
public void insertend(int val){
    Node newnode = new Node(val);
    
    if (head ==null){
        head = newnode;
    }
    else{
        Node temp = head;
        while(temp.next != null){
            temp= temp.next;
        }
        temp.next = newnode;
    }
}
public void display(){
    Node temp = head;
    
    while(temp!= null){
        System.out.print(temp.data + "-->");
        temp = temp.next;
    }
    System.out.println("Null");
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    delete list = new delete();
    System.out.println("Enter no.of.elements : ");
    int n = sc.nextInt(); 
    System.out.println("Enter Elements : ");
    for(int i =0;i<n;i++){
        int val = sc.nextInt();
        list.insertend(val);
    }
   System.out.println("");
   System.out.println("Original LinkedList : ");
   list.display();
   System.out.println("");
   System.out.println("Delete at Beginning : ");
   list.deletebegin();
   list.display();
   System.out.println("");
   System.out.println("Delete at end : ");
   list.deleteend();
   list.display();
   System.out.println("");
   System.out.println("Enter the position to delete : ");
   int m=sc.nextInt();
   list.deleteposition(m);
   System.out.println("");
   System.out.printf("The element at position %d was deleted\n",m);
   list.display();
 sc.close();  
 }}