package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String args[]){
        //debug and info will not print in console until finish configuration
        log.debug("I am debuggin!");
        log.info("log info!");

        log.error("log error!");
        log.fatal("log fatal!");
    }
}
