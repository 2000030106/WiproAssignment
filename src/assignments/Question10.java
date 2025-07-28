package assignments;

public class Question10 
{
	public static void main(String []args)
	{
		System.out.println("Command  Line Length:: "+args.length);
		if(args.length==0)
		{
			System.out.println("No Inputs passed!");
			
		}
		else {
			for(int i=0;i<args.length;i++)
			{
				int total=Integer.parseInt(args[i]);
				
			int gross=total/144;
			int remainingaftergross=total%144;
			int dozen=remainingaftergross/12;
			int leftovereggs= remainingaftergross%12;
			
			
				System.out.println("Gross: "+gross+", Dozen: "+dozen+",Remaining eggs: "+leftovereggs);
			}
		}		
		

	}

}


/*output:
 * Command  Line Length:: 1
Gross: 9, Dozen: 3,Remaining eggs: 10

 * 
 * 
 */
