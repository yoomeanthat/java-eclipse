package day13.도서관리.김유민;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	
	public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();  // 책 정보를 저장할 ArrayList
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("도서관리 프로그램");
            System.out.println("1.등록 , 2.조회, 3.변경 4.삭제 5.종료");
            int menu = sc.nextInt();
            sc.nextLine(); // 엔터를 처리하기 위한 코드

            switch (menu) {
                case 1:  // 책 등록
                    System.out.print("책 제목: ");
                    String title = sc.nextLine();
                    System.out.print("책 저자: ");
                    String author = sc.nextLine();
                    System.out.print("책 ISBN: ");
                    String isbn = sc.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    bookList.add(newBook);
                    System.out.println("책이 등록되었습니다.");
                    break;

                case 2:  // 책 조회
                    if (bookList.isEmpty()) {
                        System.out.println("등록된 책이 없습니다.");
                    } else {
                        System.out.println("등록된 책 목록:");
                        for (int i = 0; i < bookList.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            bookList.get(i).printBookInfo();
                        }
                    }
                    break;

                case 3:  // 책 정보 변경
                    System.out.print("변경할 책 번호: ");
                    int bookIndex = sc.nextInt() - 1;
                    sc.nextLine();  // 엔터 처리

                    if (bookIndex >= 0 && bookIndex < bookList.size()) {
                        Book bookToEdit = bookList.get(bookIndex);

                        System.out.print("새 책 제목: ");
                        String newTitle = sc.nextLine();
                        System.out.print("새 책 저자: ");
                        String newAuthor = sc.nextLine();
                        System.out.print("새 책 ISBN: ");
                        String newIsbn = sc.nextLine();

                        bookToEdit.setTitle(newTitle);
                        bookToEdit.setAuthor(newAuthor);
                        bookToEdit.setIsbn(newIsbn);

                        System.out.println("책 정보가 변경되었습니다.");
                    } else {
                        System.out.println("잘못된 책 번호입니다.");
                    }
                    break;

                case 4:  // 책 삭제
                    System.out.print("삭제할 책 번호: ");
                    int deleteIndex = sc.nextInt() - 1;
                    sc.nextLine();  // 엔터 처리

                    if (deleteIndex >= 0 && deleteIndex < bookList.size()) {
                        bookList.remove(deleteIndex);
                        System.out.println("책이 삭제되었습니다.");
                    } else {
                        System.out.println("잘못된 책 번호입니다.");
                    }
                    break;

                case 5:  // 종료
                    System.out.println("프로그램을 종료합니다.");
                    
                    return;

                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
    }
}
