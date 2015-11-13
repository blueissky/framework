package util;

import org.apache.log4j.Logger;

public class Log {
	private static Logger log;
	public static void setContext(Object obj,String message) {
		log = Logger.getLogger(obj.getClass());
		log.info(message);
	}
}
