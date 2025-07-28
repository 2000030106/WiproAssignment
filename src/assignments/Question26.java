package assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question26 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {2,3,54,1,6,7,7};
		
		Set<Integer> s = new LinkedHashSet<>();
		for (int num : arr) {
           s.add(num);
        }
		
		int evensum=0;
		for (int n : s) {
			System.out.print(n + " ");
			System.out.println();
            if (n % 2 == 0) {
                evensum += n;
            }
			
		}
		System.out.println("Even Sum:"+evensum);

	}

}
