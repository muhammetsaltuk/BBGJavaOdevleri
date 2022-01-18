import java.util.Scanner;

public class EmailTanıma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Email Hesabınızı Giriniz:");
        String email = klavye.nextLine();
        if (email.indexOf("@") > -1) {
            System.out.println(email.substring(email.indexOf("@")) + " Sağlayıcılı Mail Hesabıdır.");
        } else {
            System.out.print("Email Hesabınızı Kontrol Edip Tekrar Deneyiniz.");
        }
    }
}
