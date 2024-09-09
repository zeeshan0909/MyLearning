package learnstring;

import java.nio.charset.Charset;
import java.util.Random;

public class String_Basics {
	
	
	public void givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect() {
	    byte[] array = new byte[7]; // length is bounded by 7
	    new Random().nextBytes(array);
	    String generatedString = new String(array, Charset.forName("UTF-8"));

	    System.out.println(generatedString);
	}
	

	    String fieldString;

	    void printDeclaredOnlyString() {
	        String localVarString;
	        
	        // System.out.println(localVarString); -> compilation error
	        System.out.println(fieldString);
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_Basics ref = new String_Basics();
		ref.givenUsingPlainJava_whenGeneratingRandomStringUnbounded_thenCorrect();
		 ref.printDeclaredOnlyString();

	}

}
