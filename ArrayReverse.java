import java.util.Scanner;
import java.lang.*;
class ArrayReverse{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter How many element you want to take in the array: ");			
		int n=scan.nextInt();

		Integer []arr=new Integer[n];

		System.out.println("Please Enter the array elements: ");

		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}

		arr=getSort(arr);
		for(int i=0;i<n;i++)
		System.out.println(arr[i]);

	}

	static Integer[] getSort(Integer [] arr){
		for(int i=0;i<arr.length;i++){
				StringBuilder s= new StringBuilder(arr[i].toString());
				s.reverse();
				arr[i]=Integer.parseInt(new String(s));
			}
			int temp,flag=0;
			for(int i=0 ;i<arr.length;i++){
			flag=0;
			for(int j=i+1 ;j<arr.length;j++){
				if(arr[i]>arr[j]){			//swapping if ith element > jth element
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
						flag=1;
						}
			

			}
			if(flag==0)
				break;			
			
		}
		return arr;
			


		}


	}




