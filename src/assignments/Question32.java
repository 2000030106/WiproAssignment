package assignments;

public class Question32 
{
	public static void main(String[] args) {

        System.out.println(" order of catch block execution.");

        try {

         //    1.  NegativeArraySizeException
             //int[] negativeArray = new int[-5];

            // 2.  ArithmeticException (Division by zero)
            //int result = 10 / 0;

            // 3.  NullPointerException
//             String str = null;
//             System.out.println(str.length());

            // 4.  ArrayIndexOutOfBoundsException
//             int[] arr = {1, 2, 3};
//             System.out.println(arr[5]);

            // 5.  StringIndexOutOfBoundsException
//             String st = "Hello";
//             System.out.println(st.charAt(10));

            System.out.println("No specific exception triggered. This line will execute if no other exception occurs.");

        } 
        catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException:");
            e.printStackTrace(); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException:");
            e.printStackTrace(); 
        } 
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException:");
            e.printStackTrace(); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException:");
            e.printStackTrace(); 
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException:");
            e.printStackTrace(); 
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException:");
            e.printStackTrace(); 
        } 
        catch (Exception e) {
            System.out.println("Caught a general Exception:");
            e.printStackTrace(); 
        }
        finally {
            System.out.println("Finally block executed. ");
        }
    }

}

/*output:
 *  order of catch block execution.
Caught NegativeArraySizeException:
java.lang.NegativeArraySizeException: -5
	at assignments.Question32.main(Question32.java:13)
Finally block executed. 
 * 
 */

/*
 *  order of catch block execution.
Caught ArithmeticException:
java.lang.ArithmeticException: / by zero
	at assignments.Question32.main(Question32.java:15)
Finally block executed. 
 * 
 */


/*
* order of catch block execution.
Caught NullPointerException:
java.lang.NullPointerException
	at assignments.Question32.main(Question32.java:19)
Finally block executed. 

*/


/*
 *  order of catch block execution.
Caught ArrayIndexOutOfBoundsException:
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	at assignments.Question32.main(Question32.java:23)
Finally block executed. 
 */

/*
* order of catch block execution.
Caught StringIndexOutOfBoundsException:
java.lang.StringIndexOutOfBoundsException: String index out of range: 10
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
	at java.base/java.lang.String.charAt(String.java:693)
	at assignments.Question32.main(Question32.java:27)
Finally block executed. 
*/


/*
 order of catch block execution.
No specific exception triggered. This line will execute if no other exception occurs.
Finally block executed. 
*/
