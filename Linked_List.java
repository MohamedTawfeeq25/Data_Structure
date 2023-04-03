class list{
    class node{
        int data;
        node next;
        node(int a){
            data=a;
            next=null;
        }
    }
    node head=null;
    void Insert(int data){
        if(head==null){
            head=new node(data);
        }
        else if(head!=null){
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new node(data);
            
        }
    }
    void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class Linked_List{
    public static void main(String[] args) {
        list li=new list();
        li.Insert(10);
        li.Insert(20);
        li.Insert(30);
        li.display();


    }
}