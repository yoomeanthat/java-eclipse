package day21.멀티스레드.실습;

import javax.swing.JOptionPane;

public class MyCafe {

	public static void main(String[] args) {
		
		//order thread
		Thread ot = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("메뉴를 확인중입니다 : " + i);
				}
			}
		});
		
		//grind thread
		Thread gt = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("원두를 가는 중: " + i);
				}
			}
		});
		
		//packing thread
		Thread pt = new Thread(new Runnable() {
			@Override
			public void run() {
				for( int i = 0; i < 10; i++) {
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println("포장 중: " + i);
				}
			}
		});
		
		String order = JOptionPane.showInputDialog("어떤 커피를 주문하시겠어요??"); 
		System.out.println("주문하신 커피는 " + order + "입니다.");
		System.out.println("잠시만 기다려주세요~");
		ot.start();
		gt.start();
		pt.start();
		

	}

}
