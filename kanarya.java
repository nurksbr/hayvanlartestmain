
package hayvanlartestmain;

public class kanarya extends kus{
    public String renk;

    public kanarya(String renk, String family, String isim) {
        super(family, isim);
        this.renk = renk;
    }
    
    void seslendir(){
               System.out.println("------------------------------------------------------");

    System.out.println( isim + "adlı kuş 'ince cik cik' sesi çıkarır" );
           System.out.println("------------------------------------------------------");

    
    }

}
