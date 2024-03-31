
package hayvanlartestmain;

public class kedi extends hayvanlar{
    public String turu;
    
    public kedi(String isim, String turu) {
        super(isim);
        this.turu=turu;
    }
    @Override
    void seslendir(){
               System.out.println("------------------------------------------------------");

        System.out.println( isim + " adlı kedi 'miyav' sesi çıkarır" );
               System.out.println("------------------------------------------------------");

    }
    
}
