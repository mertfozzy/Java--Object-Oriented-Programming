public class Test {

    public static void main(String[] args) {

        Araba araba1 = new Araba() ; //referans araba1, obje new Araba

        //private modele erişim :
        araba1.setModel("Renault");
        System.out.println("Araba modeli : " + araba1.getModel());

        //kapı sayısı artık -4 olamıyor :
        araba1.setKapilar(-4);
        System.out.println("\nKapı sayısı : " + araba1.getKapilar());

        araba1.setKapilar(4);
        System.out.println("\nKapı sayısı : " + araba1.getKapilar());

        //================================================================================

        /*Araba araba2; --> bu kullanılamaz

        araba2.setKapilar(10);*/

        //================================================================================

        /*Araba araba3 = null; --> referans bir obejyi göstermediğinden hatalı

        araba3.setModel("Renault");*/

    }

}
