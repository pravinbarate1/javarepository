
interface Left{
	default void m1(){
		System.out.println("Left interface m1() ");	
	}
}

interface Right{
	default void m1(){
		System.out.println("Right interface m1()");
	}
}

class MultipleInheritanceWithInterfaces implements Left, Right{

	public void m1(){
		System.out.println("Own implementation.");

		//Left.super.m1();   // calling Left super interface method
		//Right.super.m1();  // calling Right super interface method
	}

	public static void main(String [] args){
		
		MultipleInheritanceWithInterfaces m = new MultipleInheritanceWithInterfaces();

		m.m1();		
	}
}  
