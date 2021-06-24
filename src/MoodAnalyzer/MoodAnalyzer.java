package MoodAnalyzer;

/**
 * 
 * @author sanyukta display return type
 */
import junit_prob.practiceProb.MoodAnalyserException.Code;

public class MoodAnalyzer {
	public static String msg;
	
	public MoodAnalyzer() {
	
	}

	public MoodAnalyzer(String msg) throws MoodAnalyzerException {
		super();
		this.msg = msg;
		
	}
	
	public String analyseMood() throws Exception {
		try {
			if(msg == null)
				throw new MoodAnalyserException(Code.NULL, "Null Mood");
			else if(msg.trim().isEmpty())
				throw new MoodAnalyzerException(Code.EMPTY, "Empty Mood");
			else if(msg.toLowerCase().contains("sad")) {
				System.out.println("SAD");
				return "SAD";
			}
			else if(msg.toLowerCase().contains("happy")) {
				System.out.println("HAPPY");
				return "HAPPY";
			}
			
		}catch(NullPointerException e) {
			throw new MoodAnalyzerException(Code.INVALID, "Empty mood.... Please enter a mood");
		}
		
		return null;
		
	}

	

}
