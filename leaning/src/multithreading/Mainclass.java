package multithreading;

class Demo1 implements Runnable{
	@Override
	public void run() {
		for(int i = 1;i<100;i++) {
			System.out.println(i + "demo1");
			if(i == 50) {
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Demo2 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			System.out.println(i + "demo2");
		}
	}
}

public class Mainclass {
	public static void main(String[] args)  {
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		
		Thread t1 = new Thread(d1);
		//Thread t2 = new Thread(d2);
		t1.start();
		
		//t2.start();
		
	}
}



