import java.util.*;
public class Linkedlist{
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int val){
            data = val;
            next = null;
            
        }
    }
    Linkedlist(){
        head = null;
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
    public void insertbegin(int k){
        Node newnode = new Node(k);
        
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void insertposition(int pos,int d){
        Node newnode = new Node(d);
        Node temp = head;
        
        for(int i =1;i<pos;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next= newnode;
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        System.out.print("Enter the elements:");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.println("Insert at end");
        list.display();
        System.out.print("Enter the elements to begin:");
        int k = sc.nextInt();
        list.insertbegin(k);
        System.out.println("Insert at begin");
        list.display();
        System.out.print("Enter the position element:");
        int pos=sc.nextInt();
        System.out.print("Enter the elements to insert at position:");
        int d=sc.nextInt();
        list.insertposition(pos,d);
        System.out.println("Insert at position");
        list.display();
        sc.close();
    }
}