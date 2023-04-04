import java.util.Scanner;
class stack//stack class 
{
    Scanner inp=new Scanner(System.in);//object for scanner
    int pointer=0;//initializing pointer
    //stack follows FILO (First in Last out)
    void Push(int[] arr)//push method to add element to stack
    
    {
        System.out.println("enter the element to push:");
        int data=inp.nextInt();//get the element from user
        if(pointer<arr.length)//check the stack is full or not
        {
           arr[pointer]=data;//pushing element to the stack
           pointer=pointer+1; //increment the pointer
           System.out.println(data+" is pushed into the stack");
           System.out.print("");
           if(pointer!=0)//display the stack element
           {
            
            for(int i=0;i<pointer;i++){
                System.out.print(arr[i]+" ");
               
            }
            System.out.println("");
            }
        }
        else if(pointer>=arr.length)//if the stack size is exceed
        {
            System.out.println("Stack Overflow");
           System.out.print("");

        }
    }
    void Pop(int[] arr)//pop method to delete the element
    {
        if(pointer!=0){
            //the last element in stack is popped
            System.out.println(arr[pointer-1]+" is popped");
           System.out.print("");

            arr[pointer-1]=0;//initial value of array is zero
            pointer=pointer-1;//decrement the pointer
            if(pointer!=0)//display the array
            {
                for(int i=0;i<pointer;i++){
                    System.out.print(arr[i]+" ");
                   
                }
                System.out.println("");
            }
        }
        else//stack is empty
        {
            System.out.println("Stack Underflow");
           System.out.print("");

        }
    }
    void Display(int[] arr)//method to display the stack element
    {
        if(pointer!=0){
            System.out.println("The Current Stack element");
            for(int i=0;i<pointer;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("");
        }
        else{
            System.out.println("Stack is empty");
        }
    }
}
public class Stack_with_Array{
    static void Menu(){
        System.out.println("-------Stack Operations-------");
		System.out.println("1.Push Element");
		System.out.println("2.Pop Element");
		System.out.println("3.Display the stack");
		System.out.println("4.exit");
    }
    public static void main(String[] args) {
        stack stk=new stack();
        Scanner inp=new Scanner(System.in);
        int choice=0;
        System.out.println("Enter the size of stack");
        int size=inp.nextInt();
        int[] arr=new int[size];
        while(choice!=4){
            Menu();
            System.out.println("Enter the choice:");
            choice=inp.nextInt();
            switch(choice){
                case 1:
                    stk.Push(arr);
                    break;
                case 2:
                    stk.Pop(arr);
                    break;
                case 3:
                    stk.Display(arr);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice");
                
            }
        }
     
    }
}