import java.lang.reflect.Array;
import java.util.Scanner;

public class WebAdresTanıma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        String[] uzanti = {"com", "gov", "net", "edu", "org", "info"};
        String[] uzantiaciklama = {"Ticari", "Kurumsal", "Ağ Uzantısı", "Eğitim", "Organisazyon", "Bilgi"};
        System.out.print("Web Adresini Giriniz:");
        String webadres = klavye.next();
        if (webadres.indexOf("www.") == 0) {
            String ext = webadres.substring(webadres.lastIndexOf(".")+1);
            int index =0;
            for (String x:uzanti) {
                if(ext.equals(x)||ext.equals(x+".tr")){
                    System.out.println(uzantiaciklama[index]+" uzantısıdır.");
                }
                index++;
            }
        }
        else {
            System.out.println("Yanlıştır");
        }
    }
}
