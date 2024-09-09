package core_java;

public class NonPrimitivesUnitTest {
	 
    public void whenModifyingObjects_thenOriginalObjectChanged() {
        Foo a = new Foo(1);
        Foo b = new Foo(1);

        // Before Modification
       System.out.println("a before modity " + a.num);
       System.out.println("b before modity " + b.num);

        modify(a, b);
        
        // After Modification
        System.out.println("a after modity " + a.num);
        System.out.println("b after modity " + b.num);
      
    }
 
    public static void modify(Foo a1, Foo b1) {
        a1.num++;
       
        b1 = new Foo(1);
        b1.num++;
    }
    public static void main(String[] args) {
    	NonPrimitivesUnitTest obj = new NonPrimitivesUnitTest();
    	obj.whenModifyingObjects_thenOriginalObjectChanged();
		
	}
}
 
class Foo {
    public int num;
   
    public Foo(int num) {
        this.num = num;
    }
}