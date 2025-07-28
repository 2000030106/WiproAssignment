package assignments;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array:");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		boolean visited[]= new boolean[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			visited[i]=false;
		}
		System.out.println("Array of Elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(visited[i]==true) {
				continue;
				
			}
			int count=1;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
				
			}
			System.out.println("Array Element:"+arr[i]+" ,"+"count:"+count);
			
		}

	}

}

/*
 * output:
 * Enter Size of Array:
10
1 2 3 4 8 5 1 2 4 6
Array of Elements:
1
2
3
4
8
5
1
2
4
6
Array Element:1 ,count:2
Array Element:2 ,count:2
Array Element:3 ,count:1
Array Element:4 ,count:2
Array Element:8 ,count:1
Array Element:5 ,count:1
Array Element:6 ,count:1
*/
 
