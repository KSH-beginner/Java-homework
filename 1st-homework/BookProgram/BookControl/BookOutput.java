package BookControl;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BookControl.BookList.total_book_list;

public class BookOutput {

    Scanner scanner = new Scanner(System.in);

    public void BookOutput_output() {
        System.out.println("<< 도서 출고 >>");
        System.out.println();
        System.out.println("출고 처리할 도서에 대한 정보를 입력해주세요.");
        System.out.println("-----------------------------------------");

        System.out.print("도서명 입력 : ");
        String book_name = scanner.nextLine();

        System.out.print("수량 입력 : ");
        int book_quantity = scanner.nextInt();

        System.out.println(total_book_list);



    }
}
