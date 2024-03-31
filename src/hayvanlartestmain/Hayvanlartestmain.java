
package hayvanlartestmain;


public class Hayvanlartestmain {


    public static void main(String[] args) {
     
        hayvanlar h1=new hayvanlar("gergedan"); //cons
        h1.omur=45;
        h1.seslendir();
        
        
        kedi h2=new kedi("maşuk", "van kedisi");
        h2.seslendir();
        
        scootish h3=new scootish("sarya", "blue point", "beyaz");
        h3.seslendir();
        
        american h4=new american(25, "rina", "american scootish", "sarı");
        h4.seslendir();
        
        
        kopek h5=new kopek("alvin", "pekines");
        h5.seslendir();
        
        
        cobankopekleri h6=new  cobankopekleri("karabaş", "kangal", "safkan");
        h6.seslendir();
        
        kus h7=new kus("muhabbet kuşu", "maviş");
        h7.seslendir();
        
        kanarya h8=new kanarya("sarı", "kanarya", "zeytin");
        h8.seslendir();
    }
    
}
