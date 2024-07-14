import java.util.Scanner;
public class sort {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
        }
    }
    sort(){
        head = null;
    }

public void sorting() {
	Node crt,in;
	int temp;
	for(crt=head;crt.next!=null;crt=crt.next) {
		for(in=crt.next;in!=null;in=in.next) {
			if(crt.data>in.data) {
				temp=crt.data;
				crt.data=in.data;
				in.data=temp;
			}
				
		}
	}
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
public void search(int k)
{
	Node temp=head;
	int i=0;
	while(temp!=null)
	{
		if(temp.data==k)
		{
			System.out.print("Element found "+temp.data);
			i=1;
			break;
		}
		else
			temp=temp.next;
	}
	if(i==0)
		System.out.print("Element not found");
}


public void dupli(){
    Node current = head;
    
    while(current != null && current.next != null){
        if (current.data == current.next.data){
            current.next = current.next.next;
        }
        else{
            current= current.next;
        }
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    sort list = new sort();
    System.out.println("Enter no.of.elements : ");
    int n = sc.nextInt(); 
    System.out.println("Enter Elements : ");
    for(int i =0;i<n;i++){
        int val = sc.nextInt();
        list.insertend(val);
    }
   
    System.out.println("");
    System.out.println("Before sorting : ");
    list.display();
    list.sorting();
    System.out.println("");
    System.out.println("After sorting : ");
    list.display();
    System.out.println("");
    System.out.println("After Removing Duplicates : ");
    list.dupli();
    list.display();
    System.out.println("");
    System.out.println("Enter element to search : ");
    int z=sc.nextInt();
    list.search(z);
    sc.close();    
}}