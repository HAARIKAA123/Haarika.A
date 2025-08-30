import java.util.*;
class Arrow
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==n/2){
				System.out.print("*");
			  }
			else if((j==n/2+i) && i<n/2){
		   		System.out.print("*");
		    }
			else if(i>n/2 && j==n-(i-(n/2)+1)){
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
