public class Hesap {

    private String kullanici_Adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_Adi, String parola, int bakiye) {
        this.kullanici_Adi = kullanici_Adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_Adi() {
        return kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        this.kullanici_Adi = kullanici_Adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir (int tutar)
    {
        bakiye += tutar;
        System.out.println("Yeni bakiyeniz : " + bakiye);

    }

    public void paraCek(int tutar)
    {
        if (bakiye - tutar < 0)
        {
            System.out.println("Yeterli bakiyeniz yoktur.\nBakiyeniz : " + bakiye);
        }
        else
        {
            bakiye -= tutar;
            System.out.println("Yeni bakiyeniz : " + bakiye);
        }
    }
}
