import java.util.Scanner;
public class TestArray1 {
	
	public static void main(String[] args) {
	
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
	 	for(int i=0;i<arr.length;i++){
	 		arr[i]=sc.nextInt();
	 	}
	 	System.out.println("Using For loop//");
	 	for(int i=0;i<arr.length;i++){
	 		System.out.println(arr[i]);
	 	}
	 	System.out.println("Using For each loop");
	 	for(int i:arr){
	 		System.out.println(i);
	 	}
	 	System.out.println("Reverse of elements is ");
	 	for(int i=arr.length-1;i>=0;i--){
	 		System.out.println(arr[i]);
	 	}
	}
}
