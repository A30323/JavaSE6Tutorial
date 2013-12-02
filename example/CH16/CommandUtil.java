package onlyfun.caterpillar;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

public class CommandUtil {
    // ���wMap����έn���ͪ�Bean���O�W��
    // �i�H���^�w�g�]�w����������
    public static Object getCommand(Map requestMap, 
                                    String commandClass) 
                                      throws Exception {
        Class c = Class.forName(commandClass);
        Object o = c.newInstance();
    
        return updateCommand(requestMap, o);
    }

    // �ϥ�reflection�۰ʧ�X�n��s���ݩ�
    public static Object updateCommand(
                           Map requestMap, 
                           Object command) 
                              throws Exception {
        Method[] methods = 
                   command.getClass().getDeclaredMethods();
    
        for(int i = 0; i < methods.length; i++) {
            // ���Lprivate�Bprotected����
            // �B��X�����Oset�}�Y����k�W��
            if(!Modifier.isPrivate(methods[i].getModifiers()) &&
               !Modifier.isProtected(methods[i].getModifiers()) &&  
               methods[i].getName().startsWith("set")) {
                // ���o���]�Aset���W��
                String name = methods[i].getName()
                                        .substring(3)
                                        .toLowerCase();
                // �p�Gsetter�W�ٻP��ȬۦP
                // �I�s������setter�ó]�w��
                if(requestMap.containsKey(name)) {
                    String param = (String) requestMap.get(name);
                    Object[] values = findOutParamValues(
                                        param, methods[i]);
                    methods[i].invoke(command, values);
                }
            }
        }
        return command;  
    }
  
    // �ഫ���������A����
    private static Object[] findOutParamValues(
                     String param, Method method) {
        Class[] params = method.getParameterTypes();
        Object[] objs = new Object[params.length];
    
        for(int i = 0; i < params.length; i++) {
            if(params[i] == String.class) {
                objs[i] = param;
            }
            else if(params[i] == Short.TYPE) {
                short number = Short.parseShort(param);
                objs[i] = new Short(number);
            }
            else if(params[i] == Integer.TYPE) {
                int number = Integer.parseInt(param);
                objs[i] = new Integer(number);
            }
            else if(params[i] == Long.TYPE) {
                long number = Long.parseLong(param);
                objs[i] = new Long(number);
            }
            else if(params[i] == Float.TYPE) {
                float number = Float.parseFloat(param);
                objs[i] = new Float(number);
            }
            else if(params[i] == Double.TYPE) {
                double number = Double.parseDouble(param);
                objs[i] = new Double(number);
            }
            else if(params[i] == Boolean.TYPE) {
                boolean bool = Boolean.parseBoolean(param);
                objs[i] = new Boolean(bool);
            }
        }    
        return objs;
    }
}