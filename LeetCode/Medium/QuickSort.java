import java.util.*;
class QuickSortHelper{
	public int partition(int a[],int lb,int ub){
		int pivot=a[lb];
		int start=lb;
		int end=ub;
		while(start<end){
			while(a[start]<=pivot){
				start++;
			}
			while(a[end]>pivot){
				end--;
			}
			if(start<end){
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
		}
		int temp=a[lb];
		a[lb]=a[end];
		a[end]=temp;
		return end;
	}
		public void Quicksort(int a[],int lb,int ub){
			if(lb<ub){
				int loc=partition(a,lb,ub);
				Quicksort(a,lb,loc-1);
				Quicksort(a,loc+1,ub);
			}
		}
}
class QuickSort{
	public static void main(String args[]){
		QuickSortHelper qs=new QuickSortHelper();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			}
			qs.Quicksort(a,0,n-1);
			System.out.println("Sorted array:"+Arrays.toString(a));
		}
}

			
			
			
			
