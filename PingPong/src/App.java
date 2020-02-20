import dictionary.PlayerType;

public class App {

	public static void main(String[] args) throws InterruptedException{
		Ball ball=new Ball();
		Player left=new Player(PlayerType.L);
		Player right=new Player(PlayerType.R);
		
		Regulator reg=new Regulator(true);
		
		Thread myThready = new Thread(new Runnable()
		{
			public void run()
			{
				for (int i=0;i<100;i++) {
					
					while (!reg.isOne()) {}
					
					left.beat(ball);
					ball.update();
					System.out.println("T1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					reg.setOne(false);
				}				
			}
		});
		myThready.start();
		
		Thread myThready2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0;i<100;i++) {
					
					while (reg.isOne()) {}
						
					right.beat(ball);
					ball.update();
					System.out.println("T2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					reg.setOne(true);
					
				}
				
			}
		});
		myThready2.start();
		
		myThready.join();
		myThready2.join();
		
		
		/*
		for (int i=0;i<1000;i++) {
			left.beat(ball);
			ball.update();
			right.beat(ball);
			ball.update();
		}
		*/
		System.out.println("Draw");

	}
	

}

