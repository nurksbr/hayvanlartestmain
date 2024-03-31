
package hayvanlartestmain;


public class kus extends hayvanlar{
    public String family;

    public kus(String family, String isim) {
        super(isim);
        this.family = family;
    }
    void seslendir(){
               System.out.println("------------------------------------------------------");

        System.out.println( isim + "adlı kuş 'cik cik' sesi çıkarır" );
               System.out.println("------------------------------------------------------");

    }
    
}
