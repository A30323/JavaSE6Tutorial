package onlyfun.caterpillar;

import java.util.logging.*;

public class LoggingLevelDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("loggingLevelDemo");
        
        logger.severe("�Y���T��");
        logger.warning("ĵ�ܰT��");
        logger.info("�@��T��");
        logger.config("�]�w�譱���T��");
        logger.fine("�ӷL���T��");
        logger.finer("��ӷL���T��");
        logger.finest("�̲ӷL���T��");
    }
}