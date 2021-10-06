import java.util.ArrayList;

public class No01 {
    public static void main(String[] args) {
            ArrayList<Buku> Buku = new ArrayList<Buku>();

            Buku.add(new Buku("8760","Motivasi Hidup","2013","Bella",750000,1));
            Buku.add(new Buku("0602","Pemograman Berbasis Objek","2019","Bobi",150000,2));
            Buku.add(new Buku("0402","Lift Is Sweet","2021","dedi",120000,3));

            Buku.get(0).setjudulbuku("Motivasi Hidup");
            Buku.get(0).settahunterbit("2013");
            Buku.get(0).setPrice(750000);
            Buku.get(0).setRating(1);

            for (Buku buku:Buku){
                buku.searchisbn("8760");
            }

            Buku.remove(0);

            for (Buku buku:Buku){
                System.out.println(buku);

            }
        }
}
