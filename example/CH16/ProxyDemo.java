package onlyfun.caterpillar;

public class ProxyDemo {
    public static void main(String[] args) {
        LogHandler handler  = new LogHandler(); 
        IHello speaker = new HelloSpeaker();

        // �N�zspeaker������
        IHello speakerProxy = 
                 (IHello) handler.bind(speaker);

        speakerProxy.hello("Justin");        
    }
}