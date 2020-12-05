package logAlpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Demo {

	public static Logger log =LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		
		log.debug("i am bugging");
			log.info("object is present");
		log.error("object is not present");
		
		log.fatal("this is fatal");
	}

}
