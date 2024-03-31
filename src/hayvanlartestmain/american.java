
package hayvanlartestmain;


public class american extends scootish{
    public int boyut;

    public american(int boyut, String isim, String turu, String renk) {
        super(isim, turu, renk);
        this.boyut = boyut;
    }
    
    @Override
    void seslendir(){
               System.out.println("------------------------------------------------------");

        System.out.println( isim + " adlı kedi 'ince ince miyav' sesi çıkarır" );
               System.out.println("------------------------------------------------------");

    }
}


        