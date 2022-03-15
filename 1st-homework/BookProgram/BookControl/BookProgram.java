package BookControl;

import java.util.Scanner;

public class BookProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookInput bookinput = new BookInput();
        BookOutput bookoutput = new BookOutput();
        BookSearch booksearch = new BookSearch();

        boolean run = true;
        while (run) {
            System.out.println("수행할 업무에 대한 메뉴의 번호를 입력해주세요.");
            System.out.println("");
            System.out.println("1. 도서 입고");
            System.out.println("2. 도서 출고");
            System.out.println("3. 도서 검색");
            System.out.println("4. 당일 판매 현황 조회");
            System.out.println("---------------------------------------");
            System.out.print("번호 입력 : ");

            int num = scanner.nextInt();

            if (num == 1) {
                bookinput.BookInput_input();

            } else if (num == 2) {
                bookoutput.BookOutput_output();
//                System.out.println(bookinput.bookinput_list);
//                if (bookinput.bookinput_list.contains("철근")) {
//                    System.out.println("책이 재고에 있습니다!");}
//                bookoutput.BookOutput_output();
////                bookoutput.BookOutput_check();
            } else if (num == 3) {
                booksearch.BookSearch_search();
            }
        }
    }
}
