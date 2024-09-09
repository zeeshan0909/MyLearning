package leetcode;

class parent{
	protected void print() {
		System.out.println("this is print from parent");
	}
}

class child extends parent {
	public void print() {
		System.out.println("this is print from child");
	}
}




public class Demo {
	public static void main(String[] args) {
		parent pp = new parent();
		pp.print();
		child cc = new child();
		cc.print();
		
		
		//child pc = new parent();
		
		parent cp = new child();
		cp.print();
	
	}
}

