public class Test {

    public static void main(String[] args) {

        Account account1 = new Account("Mert Altuntaş", "mertfozzy@gmail.com", "543542630");

        Account account2 = account1; // yeni referans vermedik, eşitledik

        Account account3 = new Account();

        if (account1==account2)
        {
            System.out.println("Aynı objeyi gösteriyor..");
        }

        else
        {
            System.out.println("Farklı objeler..");
        }


        new Account("Mercan Gamze", "example@gmail.com", "55465325").bilgiGoster();

    }



}
