public class Buku {
    private String ISBN;
    private String JudulBuku;
    private String TahunTerbit;
    private String Pengarang;
    private int price;
    private float rating;

    public Buku(String ISBN, String JudulBuku, String TahunTerbit, String Pengarang, int price, float rating) {
        this.ISBN = ISBN;
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.Pengarang = Pengarang;
        this.price = price;
        this.rating = rating;
    }

    public String getisbn(){
        return ISBN;
    }

    public String getjudulbuku(){
        return JudulBuku;
    }

    public void setjudulbuku(String JudulBuku){
        this.JudulBuku = JudulBuku;
    }

    public String getPengarang(){
        return Pengarang;
    }

    public void setPengarang(){
        this.Pengarang = Pengarang;
    }

    public String gettahunterbit(){
        return TahunTerbit;
    }

    public void settahunterbit(String TahunTerbit){
        this.TahunTerbit = TahunTerbit;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int harga){
        this.price = harga;
    }

    public float getRating(){
        return rating;
    }

    public void setRating(float rating){
        this.rating = rating;
    }

    public void searchisbn(String ISBN){
        if (this.ISBN.equalsIgnoreCase(ISBN)){
            System.out.println(ISBN+" "+JudulBuku+" "+TahunTerbit+" "+price+" "+rating);
        }
    }

    @Override
    public String toString(){
        return ISBN+" "+JudulBuku+" "+TahunTerbit+" "+price+" "+rating;
    }
}
