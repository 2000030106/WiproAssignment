package assignments;

public class Question42 {



    public static void someMethod2() throws Exception {
        System.out.println("Inside someMethod2: about to throw Exception");
        throw new Exception("Exception thrown from someMethod2");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Inside someMethod: caught exception, rethrowing it");
            throw e;  
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Inside main: caught rethrown exception");
            e.printStackTrace();  
        }
    }
}


/*
Inside someMethod2: about to throw Exception
Inside someMethod: caught exception, rethrowing it
Inside main: caught rethrown exception
java.lang.Exception: Exception thrown from someMethod2
	at assignments.Question42.someMethod2(Question42.java:9)
	at assignments.Question42.someMethod(Question42.java:14)
	at assignments.Question42.main(Question42.java:23)
*/