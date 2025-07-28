package house;

import static java.lang.System.out;

import java.util.Arrays;
public class Hall
{
	 public void display() {
	        out.println("This is the first room while entering the house");
	    }

}

class Kitchen{
	public void showAppliances() {
		
        String[] appliances = {"Stove", "Oven", "Microwave", "Toaster"};
        System.out.println("Kitchen Appliances:");
        for (String item : appliances) {
            System.out.println(item);
        }

        String[] copiedAppliances = Arrays.copyOf(appliances, appliances.length);

        System.out.println("\nCopied Appliances Array:");
        for (String item : copiedAppliances) {
            System.out.println(item);
        }
    }
}


