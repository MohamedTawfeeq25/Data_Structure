import java.util.Scanner;
class stck{
    Scanner inp=new Scanner(System.in);
    class node{
        int data;
        node next;
        node(int a){
            data=a;
            next=null;
        }
    }
    node head=null;
    void display(){
        node temp=head;
         while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println("");
    }
    void push(){
        System.out.println("Enter the data to be push:");
        int data=inp.nextInt();
        if(head==null)
        //if the list is empty insert the node as head node
        {
            head=new node(data);
            System.out.println("Node is pushed");
            display();
        }
        else if(head!=null)
        //else insert the node at the end of  the list
        {
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new node(data);
            System.out.println("Node is pushed");
            display();
        }
        }
        void pop(){
            if(head==null){
                System.out.println("The stack is empty");

            }
            else{
                node temp=head;
                if(head.next==null){
                    head=null;
                    System.out.println("Node is popped");
                }
                else{
                    while(temp.next.next!=null){
                        temp=temp.next;
                    }
                    temp.next=null;
                    System.out.println("Node is popped");
                }
                 
            }
            display();
            
        }
     
}
public class Stack_with_LinkedList {

    static void Menu(){
        System.out.println("-------Stack Operations-------");
		System.out.println("1.Push Element");
		System.out.println("2.Pop Element");
		System.out.println("3.Display the stack");
		System.out.println("4.exit");
    }
    public static void main(String[] args) {
        stck stk=new stck();int choice=0;
        Scanner inp=new Scanner(System.in);
        while(choice!=4){
            Menu();
            System.out.println("Enter the choice:");
            choice=inp.nextInt();
            switch(choice){
                case 1:
                    stk.push();
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");
                
            }
        }
     
    }
}
