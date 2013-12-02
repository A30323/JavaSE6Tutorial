package onlyfun.caterpillar;

import java.util.logging.*;

public class LoggingLevelDemo3 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("loggingLevelDemo3");
        logger.setLevel(Level.ALL);
        
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        
        logger.log(Level.SEVERE, "�Y���T��");
        logger.log(Level.WARNING, "ĵ�ܰT��");
        logger.log(Level.INFO, "�@��T��");
        logger.log(Level.CONFIG, "�]�w�譱���T��");
        logger.log(Level.FINE, "�ӷL���T��");
        logger.log(Level.FINER, "��ӷL���T��");
        logger.log(Level.FINEST, "�̲ӷL���T��");
    }
}