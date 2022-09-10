package CoreJavaPrep.Polymorphism;

 class Parent {
	 
	 String vv ="Parent v1";
	 
	 Parent(){
		 System.out.println("This default constructor of parent "+vv);
	 }
	void print() {
		System.out.println("This is parent");
	}
}

 class Child1 extends Parent{
	 
	 String vv = "Child v1";
	 Child1(){
		 System.out.println("This is defalut constructor of child 1 "+super.vv);
	 }
//	void print() {
//		System.out.println("This is child 1");
//	}
}
 class Child2 extends Parent{
	 Child2(){
		 System.out.println("This is default constructor of Child2");
	 }
	 void print() {
		 System.out.println("This is child 2");
	 }
 }
 
 
class Test{
	
	public static void main(String argg[]) {
		
		Parent p;
		p=new Child1();
		p.print();
		
	}
}
 