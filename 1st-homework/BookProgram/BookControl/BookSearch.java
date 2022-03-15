package BookControl;

import java.util.Scanner;

public class BookSearch {

    Scanner scanner = new Scanner(System.in);

    public void BookSearch_search() {
        System.out.println("<< 도서 검색 >> ");
        System.out.println("-----------------------------");
        System.out.println("1. 제목으로 검색하기");
        System.out.println("2. 카테고리로 검색하기");
        System.out.println("c. 취소");
        System.out.println("번호 입력 : ");

        String search_num = scanner.nextLine();

        switch (search_num) {
            case "1":
                BookSearch_byTitle();
                break;
            case "2":
                BookSearch_byCategory();
                break;
            case "c":
                break;
        }

    }

    public void BookSearch_byTitle() {
        System.out.println("<< 도서 검색 - 제목으로 검색하기 >>");
        System.out.println();
        System.out.println("입력한 키워드를 포함하는 제목에 해당되는 도서를 검색합니다.");
        System.out.println("-----------------------------");
        System.out.println("검색 키워드를 입력해주세요. (c. 취소) : ");

        String search_keyword = scanner.nextLine();

    }

    public void BookSearch_byCategory() {
        System.out.println("<< 도서 검색 - 카테고리로 검색하기 >>");
        System.out.println();
        System.out.println("검색할 카테고리를 선택해주세요.");
        System.out.println("-----------------------------");
        System.out.println("1. A100(인문)");
        System.out.println("2. A200(역사)");
        System.out.println("3. A300(예술)");
        System.out.println("4. A400(문화)");
        System.out.println("5. A500(여행)");
        System.out.println("c. 취소");

        System.out.println("검색 카테고리를 입력해주세요. (c. 취소) : ");

        String search_category = scanner.nextLine();


    }

}
