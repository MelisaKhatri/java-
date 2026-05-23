class BookInfo {
    String title;
    String author;
    BookInfo(String t, String a) {
        title = t;
        author = a ;
    }
    void showBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        BookInfo b1 = new BookInfo("The Alchemist", "Paulo Coelho");
        b1.showBook();
    }
}