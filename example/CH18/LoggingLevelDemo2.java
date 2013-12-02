package onlyfun.caterpillar;

import java.util.logging.*;

public class LoggingLevelDemo2 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("loggingLevelDemo2");
        // ��ܩҦ����Ū��T��
        logger.setLevel(Level.ALL);
        
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // ��ܩҦ����Ū��T��
        consoleHandler.setLevel(Level.ALL);
        // �]�w�B�z�̬�ConsoleHandler
        logger.addHandler(consoleHandler);
        
        logger.severe("�Y���T��");
        logger.warning("ĵ�ܰT��");
        logger.info("�@��T��");
        logger.config("�]�w�譱���T��");
        logger.fine("�ӷL���T��");
        logger.finer("��ӷL���T��");
        logger.finest("�̲ӷL���T��");
    }
}