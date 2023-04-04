import java.util.Scanner;

class queue{
    Scanner inp=new Scanner(System.in);//object for scanner
    int rear=0;//initializing rear
    //queue follows FIFO (First in First out)
    void Enqueue(int[] arr)
    //the enqueue method insert the element to the end of the array
    {
        if(rear<arr.length){
            System.out.println("Enter the data to insert into queue");
            int data=inp.nextInt();
            arr[rear]=data;
            rear++;
            System.out.println("Element is inserted into the queue");
            for(int i=0;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        //if the size is exceed
        else{
            System.out.println("overflow");
        }
        
    }
    void Dequeue(int[] arr)
    //dequeue method will remove the element which comes first i.e the first element of array
    {
        if(rear>0){
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
             }
             rear--;
             System.out.println("The element is removed from array");
             for(int i=0;i<rear;i++){
                 System.out.print(arr[i]+" ");
             }
             System.out.println("");
        }
        else{
            System.out.println("underflow");
        }
    }
    
    void search(int[] arr)
    //search method finds whether the element is present in the queue or not
    {
        System.out.println("Enter the element to be searched");
        int data=inp.nextInt();
        int status=0;
        for(int i=0;i<rear;i++){
            if(arr[i]==data){
                status=1;
                break;
            }
            else{
                status=0;
            }
        }
            if(status==1){
                System.out.println("the element is found in the queue");
            }
            else{
                System.out.println("The element is not present in the queue");
            }
        
    }
    void Display(int[] arr)
    //the display method display all element in the queue
    {
        System.out.println("The element in the queue are");
        for(int i=0;i<rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
public class Queue_with_Array {
    static void Menu(){
        System.out.println("-------Stack Operations-------");
		System.out.println("1.Enqueue Element");
		System.out.println("2.Dequeue Element");
		System.out.println("3.Search  the element in  queue");
		System.out.println("4.Display  the element in  queue");
		System.out.println("5.exit");
    }

    public static void main(String[] args) {
        queue q=new queue();
        Scanner inp=new Scanner(System.in);
        int choice=0;
        System.out.println("Enter the size of queue");
        int size=inp.nextInt();
        int[] arr=new int[size];
        while(choice!=5){
            Menu();
            System.out.println("Enter the choice:");
            choice=inp.nextInt();
            switch(choice){
                case 1:
                    q.Enqueue(arr);
                    break;
                case 2:
                    q.Dequeue(arr);
                    break;
                case 3:
                    q.search(arr);
                    break;
                case 4:
                    q.Display(arr);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice");
                
            }
        }
    }
}
