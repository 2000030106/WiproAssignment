package assignments;

class Tank {
    private boolean filled = false;
    private boolean released = false;
    private String name;

    public Tank(String name) {
        this.name = name;
        System.out.println(name + " Tank created.");
    }

    public void fill() {
        filled = true;
        released = false;
        System.out.println(name + " Tank filled.");
    }

    public void empty() {
        if (filled) {
            filled = false;
            released = true;
            System.out.println(name + " Tank emptied (released).");
        } else {
            System.out.println(name + " Tank is already empty.");
        }
    }

    public void releaseTank() {
        empty();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            if (!released) {
                System.out.println("*** ERROR: " + name + " Tank not released before finalization! ***");
            } else {
                System.out.println(name + " Tank was properly released before finalization.");
            }
        } finally {
            super.finalize();
        }
    }
}

public class Question36 
{
	
	    public static void main(String[] args) {
	        System.out.println("Test 1: Properly releasing tank");
	        Tank t1 = new Tank("T1");
	        t1.fill();
	        t1.releaseTank();

	        System.out.println("\nTest 2: Not releasing tank!");
	        Tank t2 = new Tank("T2");
	        t2.fill();
	        // t2.releaseTank(); // NOT called

	        t1 = null;
	        t2 = null;

	        System.gc();

	        try { Thread.sleep(2000); } catch (InterruptedException e) {}
	    }
	}

/*
 * output:
 * Test 1: Properly releasing tank
T1 Tank created.
T1 Tank filled.
T1 Tank emptied (released).

Test 2: Not releasing tank!
T2 Tank created.
T2 Tank filled.
*** ERROR: T2 Tank not released before finalization! ***
T1 Tank was properly released before finalization.
*/
