package day07_2025_02_24실습;

public class 심화문제4_김유민 {

    public static void main(String[] args) {
        
     
        String[] 메뉴 = new String[] {"김치찌개", "비빔밥", "떡볶이", "라면", "불고기", "된장찌개", "삼겹살"};
        오늘의메뉴추천(메뉴);
    }

    
    public static void 오늘의메뉴추천(String[] 메뉴) {
       
        int random = (int) (Math.random() * 메뉴.length);
        System.out.println("오늘의 메뉴는: " + 메뉴[random]);
        
    }
}
