package ch08.ex02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		logger = Logger.getLogger("ch08.ex02");
	}
	
	public void log() {
		logger.info("로깅 시작");
		try {
			throw new Exception("고의적인 Exception");
		}catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		logger.log(Level.INFO, "로깅 완료.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}