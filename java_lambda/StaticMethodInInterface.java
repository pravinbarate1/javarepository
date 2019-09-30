
interface Interf{
	public static void m1(){
		System.out.println("Static method of Interf interfaces.");
	}
}

class StaticMethodInterface implements Interf{
	
	public static void main(String [] args){
		Interf.m1();

		//m1();  // Invalid 
		//StaticMethodInterface.m1(); // Invalid

		StaticMethodInterface smi = new StaticMethodInterface();
		
		//smi.m1(); //Invalid
	}
}
