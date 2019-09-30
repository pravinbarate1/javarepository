class ThreadLambda{
	public static void main(String [] args){
		Runnable r = () -> {
			for(int i=1; i<=10; i++){
				System.out.println("Child Thread - "+i);
			}
		};	

		Thread t = new Thread(r);

 		r.run();

		for(int i=1; i<=10; i++){
			System.out.println("Main Thread - "+i);	
		}
	}
}
