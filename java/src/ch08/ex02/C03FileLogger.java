package ch08.ex02;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		logger = Logger.getLogger(C03FileLogger.class.getName());
	}
	
	public void log() throws Exception{
		Handler handler = new FileHandler("c:/DEV/ch08.ex02.xml");
		logger.addHandler(handler);
		
		logger.info("로깅 시작");
		logger.severe("심각 레벨");
		logger.info("로깅 끝");
		
		handler.flush();
		handler.close();
	}
	
	public static void main(String[] args) throws Exception{
		new C03FileLogger().log();
	}

}
