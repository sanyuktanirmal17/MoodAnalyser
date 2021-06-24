package MoodAnalyzer;

/**
 * 
 * @author sanyukta 
 * display return type
 */
public class MoodAnalyzer {
	public class MoodAnaylizer {

		public String getMood(String matter) {
			if (matter.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		}

	}
}
