import java.util.*;
public class array{
	static Scanner inp=new Scanner(System.in);
	static int limit=0;static int pointer=0;
	static void menu(){
		System.out.println("-------Array Operations-------");
		System.out.println("1.Add Element");
		System.out.println("2.Delete Element");
		System.out.println("3.Traverse Element");
		System.out.println("4.Search Element");
		System.out.println("5.exit");
	}
	static void add(int arr[]){
		if(pointer<limit-1){
			System.out.println("Enter the index to insert value:");
			int index=inp.nextInt();
			if(index<arr.length){
			System.out.println("Enter the value");
			int value=inp.nextInt();
			for(int i=arr.length-1;i>=0;i--){
				if(i==index){
					arr[i]=value;
					pointer=pointer+1;
					break;
				}
				else{
					arr[i]=arr[i-1];
				}
			}
			System.out.println("Element is inserted");
			
		}
		}
		else{
			System.out.println("Size limit Exceed");
		}
	}
	static void Delete(int arr[]){
		if(pointer>=0){
			System.out.println("Enter the Element to be deleted");
			int value=inp.nextInt();int status=0;
			for(int i=0;i<arr.length;i++){
				if(arr[i]==value && i!=arr.length-1){
					arr[i]=arr[i+1];
			
					status=1;
				}
				if(status==1 && i!=arr.length-1){
					arr[i]=arr[i+1];
				}
				if(i==pointer){
					arr[pointer]=0;
					pointer=pointer-1;
				}
		}
			System.out.println("Element deleted");

		}
		else{
			System.out.println("empty array");
		}
	}
	static void Traverse(int[] arr){
		if(pointer>=0){
		for(int i=0;i<=pointer;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();}
		else{
			System.out.println("empty array");
		}
	}
	static void Search(int[] arr){
		System.out.println("Enter the Element to be found:");
		int value=inp.nextInt();
		int status=0;
		for (int i=0;i<arr.length ;i++ ) {
			if(arr[i]==value){
				status=1;
				System.out.println("Element "+value+" is found at "+i);
				break;
			}

		}
		if(status==0){
			System.out.println("Element not found");
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Size of Array:");
		limit=inp.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter the Elements:");
		for(int i=0;i<limit;i++){
			arr[i]=inp.nextInt();
		}
		pointer=limit-1;
		int choice=0;
		while(choice!=5){
			menu();
			System.out.println("Enter the choice:");
			choice=inp.nextInt();
			switch(choice){
				case 1:
					add(arr);
					break;
				case 2:
					Delete(arr);
					break;
				case 3:
					Traverse(arr);
					break;
				case 4:
					Search(arr);
					break;
				case 5:
					break;
				default:
					System.out.println("wrong input");
			}
		}
	}
}