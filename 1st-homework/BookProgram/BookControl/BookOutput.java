package BookControl;

import java.util.Scanner;

public class BookOutput {

    Scanner scanner = new Scanner(System.in);
    BookList book_list = new BookList();

    public void BookOutput_output() {
        System.out.println("<< 도서 출고 >>");
        System.out.println();
        System.out.println("출고 처리할 도서에 대한 정보를 입력해주세요.");
        System.out.println("-----------------------------------------");

        System.out.print("도서명 입력 : ");
        String book_name = scanner.nextLine();


        System.out.print("수량 입력 : ");
        int book_quantity = scanner.nextInt();
        scanner.nextLine();

        if (book_list.booklist_find(book_name) != -1) {
            BookOutput_check(book_name, book_quantity);
        }
    }

    public void BookOutput_check(String book_name, int book_quantity) {
        System.out.println("<< 도서 출고 - 입력 정보 확인 >>");
        System.out.println();
        System.out.println("입력한 도서의 출고 정보를 확인해주세요.");
        System.out.println("- 도서명 : " + book_name);
        System.out.println("- 수량 : " + book_quantity);
        System.out.println("------------------------------");
        System.out.println("1. 입력한 정보로 도서 출고 처리");
        System.out.println("c. 취소");
        System.out.print("번호 입력 : ");

        String select_num = scanner.nextLine();

        if (select_num.equals("1")) {
            int index = book_list.booklist_find(book_name);
            book_list.booklist_release(index, book_quantity);
            System.out.println(book_list.total_book_list);
        }
    }
}

