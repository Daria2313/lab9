package com.company;

public class Main {

    public static void main(String[] args) {
// write your code here
        Krossofki puma = new Krossofki("Sportmaster", 7000, 34);
        pokypatel fiona = new pokypatel("krossofki", 7000, 15, "fiona", "343");
        fiona.pokkk();
        pocupatel2 debbi=new pocupatel2("detskiy mir",3000,67,"debbi","1694");
        debbi.pokkk2();
        pocupatel3 karl=new pocupatel3("magnit",99,435,"karl","5384");
        karl.pokkk3();
    }
}
interface tovar{
    void tovarName();
    void price();
    void raiting();

}

class Krossofki implements tovar{
    String puma;
    int cena;
    int rait;
    Krossofki(String puma, int cena, int rait){
        this.puma=puma;
        this.cena=cena;
        this.rait=rait;
    }

    public void tovarName(){
        System.out.println(puma);
    }

    public void price(){
        System.out.println(cena);
    }


    public void raiting(){
        System.out.println(rait);
    }
}
class igrushki implements tovar{
    String barbi;
    int cena1;
    int raiti1;
    igrushki( String barbi,int cena1,int raiti1){
        this.barbi=barbi;
        this.cena1=cena1;
        this.raiti1=raiti1;
    }
    public void tovarName(){
        System.out.println(barbi);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
}
class asia implements tovar{
    String lapsha;
    int cena2;
    int raiti2;
    asia(String lapsha,int cena2,int raiti2){
        this.lapsha=lapsha;
        this.cena2=cena2;
        this.raiti2=raiti2;
    }
    public void tovarName(){
        System.out.println(lapsha);
    }

    public void price(){
        System.out.println(cena2);
    }


    public void raiting(){
        System.out.println(raiti2);
    }
}
interface userss{
    void loginn();
    void passs();
}

class pokypatel implements userss, tovar{
    String puma1;
    int cena1;
    int rait1;
    String logg;
    String pass;

    pokypatel(String puma1, int cena1, int rait1, String logg, String pass){
        this.puma1=puma1;
        this.cena1=cena1;
        this.rait1=rait1;
        this.logg=logg;
        this.pass=pass;
    }

    public void tovarName(){
        System.out.println(puma1);
    }
    public void raiting(){
        System.out.println(rait1);
    }
    public void price(){
        System.out.println(cena1);
    }

    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk(){
        System.out.println("User name: "+logg + " pokupaet " + puma1);
    }
}
class pocupatel2 implements userss,tovar{
    String barbi;
    int cena1;
    int raiti1;
    String logg;
    String pass;
    pocupatel2(String barbi,int cena1,int raiti1,String logg,String pass){
        this.barbi=barbi;
        this.cena1=cena1;
        this.raiti1=raiti1;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(barbi);
    }

    public void price(){
        System.out.println(cena1);
    }


    public void raiting(){
        System.out.println(raiti1);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk2(){
        System.out.println("User name: "+logg + " pokupaet " + barbi);
    }
}
class pocupatel3 implements userss,tovar{
    String lapsha;
    int cena2;
    int raiti2;
    String logg;
    String pass;
    pocupatel3(String lapsha, int cena2,int raiti2,String logg,String pass){
        this.lapsha=lapsha;
        this.cena2=cena2;
        this.raiti2=raiti2;
        this.logg=logg;
        this.pass=pass;
    }
    public void tovarName(){
        System.out.println(lapsha);
    }

    public void price(){
        System.out.println(cena2);
    }
    public void raiting(){
        System.out.println(raiti2);
    }
    public void loginn(){
        System.out.println(logg);
    }
    public void passs(){
        System.out.println(pass);
    }
    public void pokkk3(){
        System.out.println("User name: "+logg + " pokupaet " + lapsha);
    }
}