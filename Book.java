public class Book {
    private String ISBN;
    private String title;
    private String author;
    private double price;
    public Book(String ISBN,String title, String author, double price){
           this.ISBN = ISBN;
           this.title = title;
           this.author=author;
           this.price= price;

    }
    public String getIsbn(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double price(){
        return price;
    }
    public void setIsbn(String ISBN){
        this.ISBN= ISBN;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void DisplayBookDetails(){
        System.out.println("ISBN   : "+ ISBN);
        System.out.println("Title  : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price  : $"+ price);
    }
    public void UpdateBookDetails(String ISBN , String title , String author, double price ){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String args[]){
        Book book1 = new Book("AXS42&J","wings of fire","APJ Abdul kalam",18);
        System.out.println("------Book Details------");
        book1.DisplayBookDetails();
        System.out.println("------Book Details------");
        book1.UpdateBookDetails("SLHO$T","Think like monk","xyz",15);
        book1.DisplayBookDetails();
    }
}
