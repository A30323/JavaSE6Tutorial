package onlyfun.caterpillar;
 
import java.util.*;
 
public class StringStack {
    private LinkedList<String> linkedList;
    
    public StringStack() {
        linkedList = new LinkedList<String>();
    }
    
    public void push(String name) { 
        // �N�����[�J��C�e��
        linkedList.addFirst(name);
    }
    
    public String top() {
        // ���o��C�Ĥ@�Ӥ���
        return linkedList.getFirst();
    }
    
    public String pop() {
        // ���X�Ĥ@�Ӥ���
        return linkedList.removeFirst();
    }
 
    public boolean isEmpty() {
        // ��C�O�_����
        return linkedList.isEmpty();
    }
}