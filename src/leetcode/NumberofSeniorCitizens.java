package leetcode;
class Citizen {
    public int countSeniors(String[] details) {
    	int ans = 0;
    	int count =0;
    	for(int i=0; i<details.length; i++) {
    		String current = details[i];
    		int length = current.length();
    		int correctInxd = length-2;
    		ans = current.charAt(correctInxd);
    		int correctInxd2 = length-3;
    		ans = ans + correctInxd2 * 10;
    	}
        if(ans >= 60) {
        	count ++;
        }
        return count;
    }
}
public class NumberofSeniorCitizens {

	public static void main(String[] args) {
		Citizen sc = new Citizen();
		
		String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
				//Output: 2
		int ans = sc.countSeniors(details);
		System.out.println(ans);

	}

}
