public class Yonetici extends Calisan
// Subclass, "extends Calisan" dersek Calisan inherit oluyor
{
    private int sorumlu_kisi;

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
        super(isim, maas, departman); // const. gerekiyordu, ekledik.
        // "super" dememizin sebebi private özelliğe erişmek.
        this.sorumlu_kisi = sorumlu_kisi;


    }

    public void zam_yap(int zam_miktar)
    {
        System.out.println("Çalışanlara " + zam_miktar + " TL zam yapıldı.");
    }

    public void bilgileriGoster() // aynı isimle class yazdık. Overriding.
            // overriding ettiğimizde son yazdığımız class çalışır.
            // iki classı da aynı anda kullanmak için : super.bilgileriGoster();
    {
        System.out.println("İsim : " + getIsim());
        System.out.println("Maaşı : " + getMaas());
        System.out.println("Departmanı : " + getDepartman());
        System.out.println("Sorumlu kişi sayısı :  " + this.sorumlu_kisi);
    }

}
