import java.util.EnumSet;
public enum Book{ // declared constants of enum type
    MH("Gece Yarısı  Kütüphanesi","İndigo","Matt Haig","01.01.2013","232","50.0","59.0"),
    HP("Felsefe Taşı","Ykm","J.K. Rowling","04.05.2010","1200","250","295"),
    KP("Kırmızı Pelerin","Dk","Gülseren Budayıcıoğlu","12.04.2016","424","105","123,99"),
    GB("Gör Beni","SS","Azra Kohen","24.07.2018","592","82","96,7"),
    S("Satranç","İş Bank.","Stephan Zweig","08.10.2012","117","17,5","20,65"),
    SP("Şeker Portakalı","Jose Mauro","02.10.2009","200","40","47.2"),

    private final String title;
    private final String Publisher;
    private final String Author;
    private final String DateOfPublisher;
    private final Integer Numberofpages;
    private final Float Cost;
    private final Float Price;
    
    Book(String title,String Publisher,String Author,String DateOfPublisher,Integer Numberofpages,Float Cost,Float Price){
        this.title = title;
        this.Publisher = Publisher;
        this.Author = Author;
        this.DateOfPublisher = DateOfPublisher;
        this.Numberofpages = Numberofpages;
        this.Cost = Cost;
        this.Price = Price; //enum constructor
    }

    public String getTitle(){
        return title;
    }
    public String getPublisher(){
        return Publisher; 
    }
    public String getAuthor(){
        return Author;
    }
    public String getDateofPublisher(){
        return DateOfPublisher; 
    }
    public String getNumberofpages(){
        return Numberofpages; 
    }
    public String getCost(){
        return Cost;
    }
    public String getPrice(){
        return Price; 
    }
}   
    public class EnumTest{
        public static void main(String[] args) {
            System.out.println("All books: ");
        
        
        for(Book book : Book.values()){
            System.out.printf("-10s%-45%s%s%s%s%d%f%f%n",book,book.getTitle(),book.getPublisher(),book.getAuthor(),book.DateOfPublisher(),book.Numberofpages(),book.getCost,book.getPrice());
        }
        System.out.printf("%n display a range of enum constants: %n");
   
    //print all books
    for(Book book : EnumSet.range(Book.MH,Book.HP,Book.KP,Book.GB,Book.S,Book.SP)){
       System.out.printf("&-10s%-45%s%s%s%s%d%f%f%n",book,book.getTitle(),book.getPublisher(),book.getAuthor(),book.DateOfPublisher(),book.Numberofpages(),book.getCost,book.getPrice()); 
        }
    }
 }
    
    
    
    
