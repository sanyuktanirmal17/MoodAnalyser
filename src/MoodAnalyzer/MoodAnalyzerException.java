package MoodAnalyzer;
/**
 * 
 * @author sanyukta 
 *
 */

public class MoodAnalyzerException {

	public class MoodAnalyserException extends Exception {

		enum Code {
			INVALID, NULL, EMPTY;
		}
		private Code code;
		
		public MoodAnalyserException(Code code, String message) {
			super(message);
			this.code = code;
		}

	}
}
