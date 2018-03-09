/**
 * 
 */
package tech.hongjian.aop_for_thirdjar.aop;

import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * 
 * @author xiahongjian
 * @time   2018:03:08 16:42:06
 */
@Aspect
public class JSONAspect {
	public static JSONAspect ajc$perSingletonInstance;  
	private static Throwable ajc$initFailureCause;  
	  
    static {  
        try {  
            ajc$postClinit();  
        } catch (Throwable localThrowable) {  
            ajc$initFailureCause = localThrowable;  
        }  
    }  
  
    private static void ajc$postClinit() {  
        ajc$perSingletonInstance = new JSONAspect();  
    }  
  
    public static JSONAspect aspectOf() {  
        if (ajc$perSingletonInstance == null)  
            throw new NoAspectBoundException("tech.hongjian.aop_for_thirdjar.JSONAspect", ajc$initFailureCause);  
        return ajc$perSingletonInstance;  
    }
    
    @Around("execution(* com.alibaba.fastjson.JSON.toJSONString(java.lang.Object)) && args(obj)")  
    public String parse2String(ProceedingJoinPoint join, Object obj){  
        System.out.println("parse to String before");  
        String str = "";  
        try {  
            str = (String) join.proceed(new Object[]{obj});  
            System.out.println("result:"+str);  
        } catch (Throwable e) {  
            e.printStackTrace();  
        }  
        System.out.println("parse to String after");  
        return str;  
    }  
}
