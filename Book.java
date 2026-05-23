class Book {
    String title;
    String author;
    String isbn;
    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
    void showDetails() {
        System.out.println(title + " | " + author + " | " + isbn);
    }

    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        Book b2 = new Book("Harry Potter", "J.K. Rowling", "ISBN002");
        Book b3 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", "ISBN003");
        Book b4 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "ISBN004");
        Book b5 = new Book("Atomic Habits", "James Clear", "ISBN005");
        b1.showDetails();
        b2.showDetails();
        b3.showDetails();
        b4.showDetails();
        b5.showDetails();
    }
}