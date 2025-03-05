package day12_상속실습;

public class SchoolMain {

	public static void main(String[] args) {
		
		Class c= new Class();
		c.학교();
//		c.교실();
		
		Student s = new Student();
		s.학교();
//		s.공부하기();
		
		//업캐스팅
		School s1;
		s1 = c;
		
		//다운캐스팅
		Class cc = (Class) s1;
//		cc.교실();
		
		
		
		//객체배열
		
		School s2 = new Class();
		School s3 = new Student();
		
		School list[] = new School[2];
		list[0] = s2;
		list[1] = s3;
		
		for (int i=0; i<list.length; i++) {
			list[i].학교();
		}

	}

}
