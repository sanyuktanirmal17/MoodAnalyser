package MoodAnalyzer;
/************************************************************
 * Purpose : Create a mood analyser program 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 22-06-2021
 *
 ************************************************************/


public class CheckMood {
	
	/**
	 * check message and print sad else happy 
	 * @param message contain sad
	 * @return sad or happy
	 */
	public String Mood(String message) {
		if(message.contains("Sad") || message.contains("Sad" ))
			return "Sad";
		else
			return "Happy";		
	}

}
