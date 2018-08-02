class ThreadDemo implements Runnable{
	public static void main(String[] args) {
		
	try{
		Thread obj1 = new Thread(new ThreadDemo());
		Thread obj2 = new Thread(new ThreadDemo());
		
		obj1.start();
		obj2.start();
		
	}catch(Exception e){
		System.out.println(e);
	}
	}

	@Override
	public void run() {
System.out.println(Thread.currentThread().getState());		
System.out.println(Thread.currentThread().isAlive());		

	}
}
	
