import java.util.Scanner;
class Que{
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
    void Enqueue(){
        System.out.println("Enter the data to be Enqueue:");
        int data=inp.nextInt();
        if(head==null)
        //if the list is empty insert the node as head node
        {
            head=new node(data);
            System.out.println("Node is Queued");
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
            System.out.println("Node is Queued");
            display();
        }
        }
        void Dequeue()
        //delete the first node of the list by declaring the next node of the head as head
        {
            if(head==null){
                System.out.println("linked list is empty ");
    
            }
            else{
                var temp=head;
                head=temp.next;
                System.out.println("Node is Dequeued");
            }
        }
        void Find()
    //find the node if exist in the list
    {
        if(head==null){
            System.out.println("The list is empty");

        }
        else{
            System.out.println("Enter the data to be find:");
        int data=inp.nextInt();
        node temp=head;
        int status=0;
        while(temp!=null){
            if(temp.data==data){
                status=1;
            }
            temp=temp.next;
        }
       if(status==1){
        System.out.println(data+" is founded in the list");

       }
       else if(status==0){
           System.out.println("Element not found in linked list");
       }
        
        }
        
    }

}
public class Queue_with_Linkedlist {
    static void Menu(){
        System.out.println("-------Stack Operations-------");
		System.out.println("1.Enqueue Element");
		System.out.println("2.Dequeue Element");
		System.out.println("3.Search  the element in  queue");
		System.out.println("4.Display  the element in  queue");
		System.out.println("5.exit");
    }
    public static void main(String[] args) {
        Que q=new Que();
        int choice=0;
        System.out.println("Enter the size of queue");
        Scanner inp=new Scanner(System.in);
        while(choice!=5){
            Menu();
            System.out.println("Enter the choice:");
            choice=inp.nextInt();
            switch(choice){
                case 1:
                    q.Enqueue();
                    break;
                case 2:
                    q.Dequeue();
                    break;
                case 3:
                    q.Find();;
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
                
            }
        }
    }
}
