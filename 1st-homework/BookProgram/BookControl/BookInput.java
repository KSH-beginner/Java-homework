package BookControl;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookInput {

    Scanner scanner = new Scanner(System.in);


    public void BookInput_input() {
        BookList.book_list.clear();
        System.out.println("<< 도서 입고 >>");
        System.out.println("");
        System.out.println("입고 처리할 도서에 대한 정보를 입력해주세요.");
        System.out.println("--------------------------------");

        System.out.print("도서명 입력 : ");
        String book_name = scanner.nextLine();

        System.out.print("카테고리 입력 : ");
        String book_category = scanner.nextLine();

        switch (book_category) {
            case "A100":
                book_category = "A100(인문)";
                break;
            case "A200":
                book_category = "A200(역사)";
                break;
            case "A300":
                book_category = "A300(예술)";
                break;
            case "A400":
                book_category = "A400(유아)";
                break;
            case "A500":
                book_category = "A500(여행)";
                break;
        }

        System.out.print("입고일 입력 : ");
        String input_date = scanner.nextLine();

        System.out.print("수량 입력 : ");
        int book_quantity = scanner.nextInt();

        System.out.print("금액 입력 : ");
        int book_price = scanner.nextInt();
        scanner.nextLine();

        System.out.print("저자명 입력 : ");
        String book_author = scanner.nextLine();

        System.out.print("출판사 입력 : ");
        String book_publisher = scanner.nextLine();

        BookList.booklist_add(book_name, book_category, input_date, book_quantity, book_price, book_author, book_publisher);

        BookInput_check();
    }

    public void BookInput_check() {
        System.out.println("<< 도서 입고 - 입력 정보 확인 >>");
        System.out.println();

        System.out.println("입력한 도서 정보의 항목들을 확인해주세요.");

        System.out.println("- 도서명 : " + BookList.getBook_name());
        System.out.println("- 카테고리 : " + BookList.getBook_category());
        System.out.println("- 입고일 : " + BookList.getInput_date());
        System.out.println("- 수량 : " + BookList.getBook_quantity());
        System.out.println("- 금액 : " + BookList.getBook_price());
        System.out.println("- 저자명 : " + BookList.getBook_author());
        System.out.println("- 출판사 : " + BookList.getBook_publisher());

        System.out.println("-----------------------");
        System.out.println("1. 입력한 정보로 도서 입고 처리");
        System.out.println("2. 특정 항목 수정하기");
        System.out.println("c. 취소");
        System.out.print("번호 입력 : ");

        String mod_str = scanner.nextLine();
        System.out.println(mod_str);

        if (mod_str.equals("1")) {
            System.out.println(BookList.book_list);
            System.out.println(BookList.total_book_list);

            return;
        } else if (mod_str.equals("2")) {
            BookInput_modify();
            BookInput_check();
        } else {
            BookList.book_list.clear();
            return;
        }


    }

    public void BookInput_modify() {
        System.out.println("<< 도서 입고 - 입력 정보 확인 - 특정 항목 수정하기 >>");
        System.out.println();
        System.out.println("수정할 항목에 대한 번호를 입력해주세요.");
        System.out.println("----------------------------------");
        System.out.println("1. 도서명");
        System.out.println("2. 카테고리");
        System.out.println("3. 입고일");
        System.out.println("4. 수량");
        System.out.println("5. 금액");
        System.out.println("6. 저자명");
        System.out.println("7. 출판사");
        System.out.println("c. 취소");

        System.out.print("번호 입력 : ");
        String modify_str = scanner.nextLine();

        switch (modify_str) {
            case "1":
                System.out.print("수정할 도서명 입력 : ");
                String modify_book_name = scanner.nextLine();
                BookList.SetBook_name(modify_book_name);
                break;
            case "2":
                System.out.print("수정할 카테고리 입력 : ");
                String modify_book_category = scanner.nextLine();
                switch (modify_book_category) {
                    case "A100":
                        modify_book_category = "A100(인문)";
                        break;
                    case "A200":
                        modify_book_category = "A200(역사)";
                        break;
                    case "A300":
                        modify_book_category = "A300(예술)";
                        break;
                    case "A400":
                        modify_book_category = "A400(유아)";
                        break;
                    case "A500":
                        modify_book_category = "A500(여행)";
                        break;
                }
                BookList.SetBook_category(modify_book_category);
                break;
            case "3":
                System.out.print("수정할 입고일 입력 : ");
                String modify_input_date = scanner.nextLine();
                BookList.SetInput_date(modify_input_date);
                break;
            case "4":
                System.out.print("수정할 수량 입력 : ");
                String modify_book_quantity = scanner.nextLine();
                BookList.SetBook_quantity(modify_book_quantity);
                break;
            case "5":
                System.out.print("수정할 금액 입력 : ");
                String modify_book_price = scanner.nextLine();
                BookList.SetBook_price(modify_book_price);
                break;
            case "6":
                System.out.print("수정할 저자명 입력 : ");
                String modify_book_author = scanner.nextLine();
                BookList.SetBook_author(modify_book_author);
                break;
            case "7":
                System.out.print("수정할 출판사명 입력 : ");
                String modify_book_publisher = scanner.nextLine();
                BookList.SetBook_publisher(modify_book_publisher);
                break;
            case "c":
                return;
        }

    }
}

//
//            }
//
//        }
//
//        public void aaa() {
//            int aa = new BookInput.book_price
//        }
//








