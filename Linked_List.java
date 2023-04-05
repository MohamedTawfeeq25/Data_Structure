
import java.util.Scanner;//importing scanne class
class list{
    Scanner inp=new Scanner(System.in);

    class node
    //node class contain two field data and pointer to next node
    {
        int data;
        node next;
        //node constructor
        node(int a){
            data=a;//data field
            next=null;//next node address
        }
    }
    node head=null;//initializing head of the list to null
    void InsertAtEnd()
    //insert at the end of the list
    {
        System.out.println("Enter the data to be inserted:");
        int data=inp.nextInt();
        if(head==null)
        //if the list is empty insert the node as head node
        {
            head=new node(data);
            System.out.println("Node is inserted");
        }
        else if(head!=null)
        //else insert the node at the end of  the list
        {
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new node(data);
            System.out.println("Node is inserted");
        }
    }
    void InsertAtHead()
    //insert the node at head of the list and connect the older head node to new header node pointer
    {
        System.out.println("Enter the data to be inserted:");
        int data=inp.nextInt();
        if(head==null){
            head=new node(data);
            System.out.println("Node is inserted");
        }
        else if(head!=null){
            node temp=new node(data);
            temp.next=head;
            head=temp;
            System.out.println("Node is inserted at head");
        }
    }
    void InsertAtPos()
    //insert the node at specified position by connecting the previous node pointer to this node and the pointer of new node to next node of previos node
    {
        System.out.println("Enter the data to be inserted:");
        int data=inp.nextInt();
        System.out.println("Enter the Position:");
        int pos=inp.nextInt();
        try{
            var temp=head;
        if(head==null){
            head=new node(data);
        }
        else{
            int count=1;
            if(pos==1){
                node dum=new node(data);
                dum.next=head;
                head=dum;
                System.out.println("The node is inserted at positon 1");

            }
            else{
                while(count!=pos-1){
                    temp=temp.next;
                    count=count+1;
                }
                var newNode=new node(data);
                newNode.next=temp.next;
                temp.next=newNode;
                System.out.println("Node is inserted at "+pos   );
                count=1;
            }
            
        }
         
        }
        catch(Exception e)
        //if the postion is invalid error raise
        {
            System.out.println("Invalid position");
        }
        
    }
    void DeleteAtEnd()
    //delete the node which is at the last of the list by connecting the last previous node pointer to null
    {
        node temp=head;
        if(head==null){
            System.out.println("linked list is empty ");

        }
        else if(head.next==null){
            head=null;
            System.out.println("Node is Deleted");
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            System.out.println("Node is Deleted");
        }
        
    }
    void DeleteAtHead()
    //delete the first node of the list by declaring the next node of the head as head
    {
        if(head==null){
            System.out.println("linked list is empty ");

        }
        else{
            var temp=head;
            head=temp.next;
            System.out.println("Node is Deleted");
        }
       

    }
    void Delete()
    //delete the specified node by connecting the previous node of current node to next node of current node
    {
        if(head==null){
            System.out.println("Empty list");
        }
       
        else{
            System.out.println("Enter the data to be deleted:");
            int data=inp.nextInt();
            node temp=head; 
            if(head.next==null){
                if(head.data==data){
                    head=null;
                }
                else{
                    System.out.println("Element not present");

                }
            } 
            else{
                int flag=0;
                while(temp.next!=null){
                    if(temp.next.data==data){
                        var dum=temp.next;
                        temp.next=dum.next;
                        System.out.println("Node is Deleted"); 
                        flag=1;
                        break;
                    }
                    else{
                        flag=0;
                        temp=temp.next;
                    }
                }  
                if(flag==0){
                    System.out.println("element not present in list");
                }  
            }  
           
            
           
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
    void display()
    //display the all node of the list
    {
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("");
    }
}
public class Linked_List{
    static void menu(){
        System.out.println("-------Linked List Operation-------");
		System.out.println("1.Insert Element at head");
		System.out.println("2.Insert Element at specified position");
		System.out.println("3.Insert Element at end");
		System.out.println("4.Traverse Element");
		System.out.println("5.Search Element");
        System.out.println("6.Delete Element at head");
		System.out.println("7.Delete Element at specified data");
		System.out.println("8.Delete Element at end");
		System.out.println("9.exit");
    }
    public static void main(String[] args) {
        list li=new list();
        Scanner inp=new Scanner(System.in);
        int choice=0;
        while(choice!=9){
            menu();
            System.out.println("Enter the Choice:");
            choice=inp.nextInt();
            switch(choice){
                case 1:
                    li.InsertAtHead();
                    break;
                case 2:
                    li.InsertAtPos();
                    break;
                case 3:
                    li.InsertAtEnd();
                    break;
                case 4:
                    li.display();
                    break;
                case 5:
                    li.Find();
                    break;
                case 6:
                    li.DeleteAtHead();
                    break;
                case 7:
                    li.Delete();
                    break;
                case 8:
                    li.DeleteAtEnd();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }


    }
}
