import java.util.Scanner;
public class traverse {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }
    traverse(){
        head = null;
    }
public void rev() {
	Node prev=null;
	Node current=head;
	while(current!=null) {
		Node nex=current.next;
		current.next=prev;
		prev=current;
		current=nex;
	}
	head=prev;
}
public void max() {
	Node temp=head;
	int b=0;
	while(temp!=null) {
		if(b<temp.data) 
			b=temp.data;
	temp=temp.next;}System.out.println("Greater node is -->"+b);
}
public void min() {
	Node temp=head;
	int m=99;
	while(temp!=null) 
	{
		if(m>temp.data) 
			m=temp.data;
	temp=temp.next;
	}
	System.out.println("Smaller node is -->"+m);
}
public void search(int u) {
	Node temp=head;
	int j=0;
	while(temp!=null) {
		if(temp.data==u) {
			j=1;
		break;}
			
	temp=temp.next;}
	if(j==0)
	System.out.println("Not found ");
	else
		System.out.println("element found "+temp.data);
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
    traverse list = new traverse();
    System.out.println("Enter no.of.elements : ");
    int n = sc.nextInt(); 
    System.out.println("Enter Elements : ");
    for(int i =0;i<n;i++){
        int val = sc.nextInt();
        list.insertend(val);
    }
    sc.close();
    System.out.println("");
    System.out.println("Before reversal : ");
    list.display();
    System.out.println("");
    list.rev();
    System.out.println("After reversal : ");
    list.display();
    System.out.println("");
    list.min();
    list.max();
    }
}