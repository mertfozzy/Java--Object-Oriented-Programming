public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba() ; //referans araba1, obje new Araba

        araba1.renk = "Kırmızı"; //private olursa hata alırsın
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Ford";

        System.out.println(araba1.model);


    }

}
