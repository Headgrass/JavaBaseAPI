package Lections.Lec2;

import java.io.IOException;
import java.util.logging.*;

public class Ex5_Logger {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Ex5_Logger.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);

        //SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        //ch.setFormatter(sFormat);
        fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
