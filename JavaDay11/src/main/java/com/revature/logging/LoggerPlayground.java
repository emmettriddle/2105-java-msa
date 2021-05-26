package com.revature.logging;

public class LoggerPlayground {
	
	
//	AppLogger logger = LogManager.getLogger(AppLogger.class);
	
	public static void main(String[] args) {
		
		
		AppLogger.logger.info("Program Started.");
		
		int num;
		AppLogger.logger.warn("The variable 'num is not used.");
		
		logInfo("Info level");
		
		
		
	}
	
	public static void logInfo(String message) {
		AppLogger.logger.info(message);
	}

}
