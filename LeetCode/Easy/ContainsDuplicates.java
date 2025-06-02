import java.util.*;
import java.util.Arrays;
class ContainsDuplicates{
	public static boolean ContainDuplicate(int [] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.print(ContainDuplicate(arr));
	}
}
				
				
