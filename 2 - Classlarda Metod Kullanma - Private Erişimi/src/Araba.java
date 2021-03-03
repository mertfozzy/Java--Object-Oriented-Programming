public class Araba {

    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;
    //araba nesnesi oluştu ama private


    //erişmek için :


    public void setModel (String model)
    {
        this.model = model ; // isimler aynı ise ekstaradan this koymak gerekiyor
        //String modelasd de olabilirdi, this'e gerek kalmazdı
    }

    public String getModel ()
    {
        return this.model;
    }


    /*  bunu otomatik de üretebilirsin,
        IntelliJ'de sağ tık >> generate >> getter ve setter
     */

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar < 0)
        {
            System.out.println("\nKapı sayısı 0'dan küçük olamaz..");
        }
        else
        {
            this.kapilar = kapilar ;
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

}
