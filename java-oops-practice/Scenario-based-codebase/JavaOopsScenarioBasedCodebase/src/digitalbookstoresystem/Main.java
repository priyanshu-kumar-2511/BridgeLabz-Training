package digitalbookstoresystem;

/*15. "BookBazaar – Digital Bookstore System"
Story: You’re building the backend for BookBazaar, an online bookstore. It must handle book
inventory, orders, and discounts.
Requirements:
● Book class with fields: title, author, price, stock.
● Order class that links a user to one or more books.
● Interface IDiscountable with method applyDiscount().
● Use constructors to create books with optional offers.
● Use operators to compute total cost: price × quantity – discount.
● Encapsulation: inventory count should only be updated through methods.
● Inheritance: EBook, PrintedBook extend Book.
● Polymorphism: applyDiscount() works differently for each book type.
● Access modifiers used to restrict order status updates.
*/

public class Main {
    public static void main(String[] args) {

        Book b1 = new PrintedBook("Java Mastery", "Priyanshu", 500, 10);
        Book b2 = new EBook("Spring Boot", "FinlyTech", 300);

        Order order = new Order("Priyanshu");

        order.addBook(b1, 3);
        order.addBook(b2, 2);

        order.checkout();
    }
}
