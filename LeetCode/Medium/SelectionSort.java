import java.util.*;
class SelectionSort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp;
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
				}
		    }
			if(min!=i){
				temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		System.out.println("SelectionSorted Array:");
		System.out.println(Arrays.toString(a));
	}
}
