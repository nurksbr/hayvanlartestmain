
package hayvanlartestmain;


public class kopek extends hayvanlar{
    public String ırk;
    public kopek(String isim, String ırk) {
        super(isim);
        this.ırk=ırk;
    }
    @Override
    void seslendir(){
               System.out.println("------------------------------------------------------");

        System.out.println( isim + " adlı köpek 'hav hav' sesi çıkarır" );
               System.out.println("------------------------------------------------------");

    }
}
