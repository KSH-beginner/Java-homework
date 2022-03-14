package BookControl;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    static List<String> book_list = new ArrayList<String>();
    static List<String> total_book_list = new ArrayList<String>();

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

        total_book_list.add(String.valueOf(book_list));
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

    public List<String> getTotal_book_list() { return total_book_list; }
}
