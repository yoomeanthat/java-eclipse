package day21.멀티스레드.실습;

import javax.swing.JOptionPane;

public class MyRace {
	
	public static void main(String[] args) {
		Red r = new Red();
		Green g = new Green();
		Blue b = new Blue();
		
		int result = JOptionPane.showConfirmDialog(null, "경주를 시작할까요??", "확인", JOptionPane.OK_CANCEL_OPTION);
//		String race = JOptionPane.showInputDialog("경주를 시작할까요??");
		System.out.println("==먼저 10에 도착하면 우승입니다==");
		System.out.println();
		
		r.start();
		g.start();
		b.start();
	}

}

class Red extends Thread{
	@Override
	public void run() {
		for( int i= 0; i<= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("빨간공 "+i+"칸에 도착");
			if(i==10) {
				System.out.println("**빨간공 도착**");
			}
		}
    }
}
class Green extends Thread{
	@Override
	public void run() {
		for( int i= 0; i<= 10; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("초록공 "+i+"칸에 도착");
			if(i==10) {
				System.out.println("**초록공 도착**");
			}
		}
	}
}
class Blue extends Thread{
	@Override
	public void run() {
		for( int i= 0; i<= 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("파란공 "+i+"칸에 도착");
			if(i==10) {
				System.out.println("**파란공 도착**");
			}
		}
	}
}