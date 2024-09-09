package core_java;

public class PassByInJava {

	public void whenModifyingPrimitive_thenOriginalValueNotModified() {
		int x =1;
		int y =2;
        System.out.println("Before modification: x = " + x + ", y = " + y);
        modify(x, y);
        System.out.println("After modification: x = " + x + ", y = " + y);
        
	}
	
	public static void modify(int x1, int y1) {
		 x1 = 5;
		 y1 = 10;
	     System.out.println("Inside modify method: x1 = " + x1 + ", y1 = " + y1);
	     
	     
	}
	public static void main(String[] args) {
		PassByInJava obj = new PassByInJava();
		obj.whenModifyingPrimitive_thenOriginalValueNotModified();
	}
}
