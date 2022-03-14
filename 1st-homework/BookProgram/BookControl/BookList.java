package BookControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    List<String> book_list = new ArrayList<String>();
    List<List<String>> total_book_list = new ArrayList<List<String>>();


    public void booklist_add(String book_name,
                             String book_category,
                             String input_date,
                             int book_quantity,
                             int book_price,
                             String book_author,
                             String book_publisher) {



        book_list.add(book_name);
        book_list.add(book_category);
        book_list.add(input_date);
        book_list.add(String.valueOf(book_quantity));
        book_list.add(String.valueOf(book_price));
        book_list.add(book_author);
        book_list.add(book_publisher);

        total_book_list.add(book_list);
    }

    public int booklist_find(String book_name) {
        for (int i = 0; i < total_book_list.size(); i++) {
            List<String> book_list = total_book_list.get(i);
            System.out.println(book_list);
            if (book_list.contains(book_name)) {
                return i;
            }
        }
        System.out.println("책이 목록에 없습니다!");
        return -1;
    }

        public void booklist_release(int index, int book_quantity) {
            List<String> book_list = total_book_list.get(index);
            int new_quantity = Integer.parseInt(book_list.get(3)) - book_quantity;
            if (new_quantity > 0) {
                book_list.set(3, String.valueOf(new_quantity));
            } else if (new_quantity == 0) {
                book_list.clear();
            } else {
                System.out.println("현재 재고보다 수량이 많습니다!");
            }
        }


    public String getBook_name() { return book_list.get(0); }
    public void SetBook_name(String book_name) { book_list.set(0, book_name); }

    public String getBook_category() { return book_list.get(1); }
    public void SetBook_category(String book_category) { book_list.set(1, book_category); }

    public String getInput_date() { return book_list.get(2); }
    public void SetInput_date(String input_date) { book_list.set(2, input_date); }

    public String getBook_quantity() { return book_list.get(3); }
    public void SetBook_quantity(String book_quantity) { book_list.set(3, book_quantity); }

    public String getBook_price() { return book_list.get(4); }
    public void SetBook_price(String book_price) { book_list.set(4, book_price); }

    public String getBook_author() { return book_list.get(5); }
    public void SetBook_author(String book_author) { book_list.set(5, book_author); }

    public String getBook_publisher() { return book_list.get(6); }
    public void SetBook_publisher(String book_publisher) { book_list.set(6, book_publisher); }


}
