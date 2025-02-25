package day08_2025_02_25;

public class PSK {

	public static int[] work( String name, int fee) {
	    
		   int[]money={50000,10000,5000,1000,500,100, 50,10,5,1};
		   int[]result = new int[10];
		   
		   System.out.println("사원명과 출장비를 입력하세요.");
		      
		   //입력한 사원명, 출장비 출력
		   System.out.println();
		   System.out.println("사원명 : "+name);
		   System.out.println("출장비 : "+fee+"원");
		   System.out.println();
		      
		      
		   for(int i=0; i<money.length; i++) {
			   int cnt = fee/money[i];
			   result[i]=cnt;
			   fee=fee%money[i];
			   System.out.print(money[i]+"원 : "+cnt+(i<4?"장 / ":"개 / "));
		   }
		   
		   return result;
	   }
	   
	   
	   
	   
	   public static int[] work2( String name, int fee) {
		    
		   int[] money={50000,10000,5000,1000,500,100, 50,10,5,1};
		   int[] result  = new int[10];
		   
		   System.out.println("사원명과 출장비를 입력하세요.");
		      
		   //입력한 사원명, 출장비 출력
		   System.out.println();
		   System.out.println("사원명 : "+name);
		   System.out.println("출장비 : "+fee+"원");
		   System.out.println();
		      
		      
		   for(int i=0; i<money.length; i++) {
			   int cnt = fee/money[i];
			   result[i]=cnt;
			   fee=fee%money[i];
			   System.out.print(money[i]+"원 : "+cnt+(i<4?"장 / ":"개 / "));
		   }
		   
		   
		   return result;
	   }
	
}
