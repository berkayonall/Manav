import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut , elma , muz , domates, patlican , toplam,a,b,c,d,e;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kaç kilo muz aldınız :");
        muz = inp.nextDouble();

        System.out.println("Kaç kilo armut aldınız :");
        armut = inp.nextDouble();

        System.out.println("Kaç kilo elma aldınız :");
        elma = inp.nextDouble();

        System.out.println("Kaç kilo domates aldınız :");
        domates = inp.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız :");
        patlican = inp.nextDouble();

        a = muz*0.95;
        b = armut*2.14;
        c = elma*3.67;
        d = domates*1.11;
        e = patlican*5;
        toplam = a+b+c+d+e;

        System.out.println("Toplam Ödenecek Tutar :" + toplam  + "Tl");


        }

}
