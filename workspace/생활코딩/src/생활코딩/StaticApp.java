package ��Ȱ�ڵ�;
class Accounting{
	
}


class Foo {
	public static String classVar = "I class var"; // Ŭ����
	public String instanceVar = "I instance var";// �ν��Ͻ�
	public static void classMethod() {
		System.out.println(classVar); // ok
//		System.out.println(instanceVar); // error
	}// Ŭ����
	public void instanceMethod() {
		System.out.println(classVar); // ok
		System.out.println(instanceVar); // error
	} //�ν��Ͻ�
}

public class StaticApp {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // ok
//		System.out.println(Foo.instanceVar); // error
		Foo.classMethod(); // ok
//		Foo.instanceMeth0od(); // error
		Foo f1 = new Foo(); 
		Foo f2 = new Foo();
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar);
		System.out.println(f2.classVar);
		
		f2.instanceVar = "changed by f2";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
		
		
		
	}
}


