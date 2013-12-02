package onlyfun.caterpillar;

import java.util.logging.*; 
import java.lang.reflect.*; 

public class LogHandler implements InvocationHandler { 
    private Logger logger = 
               Logger.getLogger(this.getClass().getName()); 
    private Object delegate; 

    // �j�w�n�N�z������
    public Object bind(Object delegate) { 
        this.delegate = delegate;
        // �إߨöǦ^�N�z����
        return Proxy.newProxyInstance(
                 delegate.getClass().getClassLoader(),
                 // �n�Q�N�z������
                 delegate.getClass().getInterfaces(), 
                 this); 
    }

    // �N�z�n�I�s����k�A�æb��e��W�[�欰
    public Object invoke(Object proxy, 
                         Method method, 
                         Object[] args) throws Throwable {
        Object result = null; 
        try { 
            logger.log(Level.INFO, 
                         "method starts..." + method.getName()); 
            result = method.invoke(delegate, args); 
            logger.log(Level.INFO, 
                         "method ends..." + method.getName()); 
        } catch (Exception e){ 
            logger.log(Level.INFO, e.toString()); 
        } 
        return result; 
    } 
}