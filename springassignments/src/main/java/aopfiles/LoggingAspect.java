package aopfiles;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect 
{
	public void logBefore() {
        System.out.println("[Before] Method execution started.");
    }

    public void logAfterReturning() {
        System.out.println("[AfterReturning] Method executed successfully.");
    }

    public void logAfterThrowing() {
        System.out.println("[AfterThrowing] Exception occurred in method.");
    }
    public Object logExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = pjp.proceed(); 
        long end = System.currentTimeMillis();
        System.out.println("[Around] Method " + pjp.getSignature().getName() + " took " + (end - start) + "ms");
        return result;
}

}
