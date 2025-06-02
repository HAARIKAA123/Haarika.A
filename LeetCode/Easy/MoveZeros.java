import java.util.*;
class MoveZeros{
	public static void main(String args[]){
		int arr[]={1,0,0,0,4};
		int arr1[]={0,0,0,0,0};
		int i=0;
		int j=0;
		while(i<arr.length){
				if(arr[i]!=arr1[j]){
					arr1[j]=arr[i];
					i++;
					j++;
				}
				i++;
			}			
			System.out.println("M0ved array:");
			for(i=0;i<arr1.length;i++){
				System.out.println(arr1[i]);
	}
}
}
		