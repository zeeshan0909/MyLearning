package start;

public class AAAAAA {
	
	public static void main(String[] args) {
		int n = args.length;
		System.out.println(n);
	    if (args.length > 0) {
	        if (args[0].equals("test")) {
	            // load test parameters
	    		System.out.println("load test parameters");

	        } else if (args[0].equals("production")) {
	            // load production parameters
	    		System.out.println("load production parameters");

	        }
	    }
	}

}
