import java.util.Scanner;

public class PlakaTanıma {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Plakanızın Tamamını Arada Hiç Boşluk Bırakmadan Giriniz:");
        String plaka = klavye.next();
        int alankodu = Integer.parseInt(plaka.substring(0, 2));
        if (plaka.length() == 7) {
            if (alankodu == 1) {
                System.out.println(plaka + "--->Adana İline Ait Plakadır.");
            } else if (alankodu == 2) {
                System.out.println(plaka + "--->Adıyaman İline Ait Plakadır.");
            } else if (alankodu == 3) {
                System.out.println(plaka + "--->Afyonkarahisar İline Ait Plakadır.");
            } else if (alankodu == 4) {
                System.out.println(plaka + "--->Ağrı İline Ait Plakadır.");
            } else if (alankodu == 5) {
                System.out.println(plaka + "--->Amasya İline Ait Plakadır.");
            } else if (alankodu == 6) {
                System.out.println(plaka + "--->Ankara İline Ait Plakadır.");
            } else if (alankodu == 7) {
                System.out.println(plaka + "--->Antalya İline Ait Plakadır.");
            } else if (alankodu == 8) {
                System.out.println(plaka + "--->Artvin İline Ait Plakadır.");
            } else if (alankodu == 9) {
                System.out.println(plaka + "--->Aydın İline Ait Plakadır.");
            } else if (alankodu == 10) {
                System.out.println(plaka + "--->Balıkesir İline Ait Plakadır.");
            } else if (alankodu == 11) {
                System.out.println(plaka + "--->Bilecik İline Ait Plakadır.");
            } else if (alankodu == 12) {
                System.out.println(plaka + "--->Bingöl İline Ait Plakadır.");
            } else if (alankodu == 13) {
                System.out.println(plaka + "--->Bitlis İline Ait Plakadır.");
            } else if (alankodu == 14) {
                System.out.println(plaka + "--->Bolu İline Ait Plakadır.");
            } else if (alankodu == 15) {
                System.out.println(plaka + "--->Burdur İline Ait Plakadır.");
            } else if (alankodu == 16) {
                System.out.println(plaka + "--->Bursa İline Ait Plakadır.");
            } else if (alankodu == 17) {
                System.out.println(plaka + "--->Çanakkale İline Ait Plakadır.");
            } else if (alankodu == 18) {
                System.out.println(plaka + "--->Çankırı İline Ait Plakadır.");
            } else if (alankodu == 19) {
                System.out.println(plaka + "--->Çorum İline Ait Plakadır.");
            } else if (alankodu == 20) {
                System.out.println(plaka + "--->Denizli İline Ait Plakadır.");
            } else if (alankodu == 21) {
                System.out.println(plaka + "--->Diyarbakır İline Ait Plakadır.");
            } else if (alankodu == 22) {
                System.out.println(plaka + "--->Edirne İline Ait Plakadır.");
            } else if (alankodu == 23) {
                System.out.println(plaka + "--->Elazığ İline Ait Plakadır.");
            } else if (alankodu == 24) {
                System.out.println(plaka + "--->Erzincan İline Ait Plakadır.");
            } else if (alankodu == 25) {
                System.out.println(plaka + "--->Erzurum İline Ait Plakadır.");
            } else if (alankodu == 26) {
                System.out.println(plaka + "--->Eskişehir İline Ait Plakadır.");
            } else if (alankodu == 27) {
                System.out.println(plaka + "--->Gaziantep İline Ait Plakadır.");
            } else if (alankodu == 28) {
                System.out.println(plaka + "--->Giresun İline Ait Plakadır.");
            } else if (alankodu == 29) {
                System.out.println(plaka + "--->Gümüşhane İline Ait Plakadır.");
            } else if (alankodu == 30) {
                System.out.println(plaka + "--->Hakkari İline Ait Plakadır.");
            } else if (alankodu == 31) {
                System.out.println(plaka + "--->Hatay İline Ait Plakadır.");
            } else if (alankodu == 32) {
                System.out.println(plaka + "--->Isparta İline Ait Plakadır.");
            } else if (alankodu == 33) {
                System.out.println(plaka + "--->Mersin İline Ait Plakadır.");
            } else if (alankodu == 34) {
                System.out.println(plaka + "--->İstanbul İline Ait Plakadır.");
            } else if (alankodu == 35) {
                System.out.println(plaka + "--->İzmir İline Ait Plakadır.");
            } else if (alankodu == 36) {
                System.out.println(plaka + "--->Kars İline Ait Plakadır.");
            } else if (alankodu == 37) {
                System.out.println(plaka + "--->Kastamonu İline Ait Plakadır.");
            } else if (alankodu == 38) {
                System.out.println(plaka + "--->Kayseri İline Ait Plakadır.");
            } else if (alankodu == 39) {
                System.out.println(plaka + "--->Kırklareli İline Ait Plakadır.");
            } else if (alankodu == 40) {
                System.out.println(plaka + "--->Kırşehir İline Ait Plakadır.");
            } else if (alankodu == 41) {
                System.out.println(plaka + "--->Kocaeli İline Ait Plakadır.");
            } else if (alankodu == 42) {
                System.out.println(plaka + "--->Konya İline Ait Plakadır.");
            } else if (alankodu == 43) {
                System.out.println(plaka + "--->Kütahya İline Ait Plakadır.");
            } else if (alankodu == 44) {
                System.out.println(plaka + "--->Malatya İline Ait Plakadır.");
            } else if (alankodu == 45) {
                System.out.println(plaka + "--->Manisa İline Ait Plakadır.");
            } else if (alankodu == 46) {
                System.out.println(plaka + "--->Kahramanmaraş İline Ait Plakadır.");
            } else if (alankodu == 47) {
                System.out.println(plaka + "--->Mardin İline Ait Plakadır.");
            } else if (alankodu == 48) {
                System.out.println(plaka + "--->Muğla İline Ait Plakadır.");
            } else if (alankodu == 49) {
                System.out.println(plaka + "--->Muş İline Ait Plakadır.");
            } else if (alankodu == 50) {
                System.out.println(plaka + "--->Nevşehir İline Ait Plakadır.");
            } else if (alankodu == 51) {
                System.out.println(plaka + "--->Niğde İline Ait Plakadır.");
            } else if (alankodu == 52) {
                System.out.println(plaka + "--->Ordu İline Ait Plakadır.");
            } else if (alankodu == 53) {
                System.out.println(plaka + "--->Rize İline Ait Plakadır.");
            } else if (alankodu == 54) {
                System.out.println(plaka + "--->Sakarya İline Ait Plakadır.");
            } else if (alankodu == 55) {
                System.out.println(plaka + "--->Samsun İline Ait Plakadır.");
            } else if (alankodu == 56) {
                System.out.println(plaka + "--->Siirt İline Ait Plakadır.");
            } else if (alankodu == 57) {
                System.out.println(plaka + "--->Sinop İline Ait Plakadır.");
            } else if (alankodu == 58) {
                System.out.println(plaka + "--->Sivas İline Ait Plakadır.");
            } else if (alankodu == 59) {
                System.out.println(plaka + "--->Tekirdağ İline Ait Plakadır.");
            } else if (alankodu == 60) {
                System.out.println(plaka + "--->Tokat İline Ait Plakadır.");
            } else if (alankodu == 61) {
                System.out.println(plaka + "--->Trabzon İline Ait Plakadır.");
            } else if (alankodu == 62) {
                System.out.println(plaka + "--->Tunceli İline Ait Plakadır.");
            } else if (alankodu == 63) {
                System.out.println(plaka + "--->Şanlıurfa İline Ait Plakadır.");
            } else if (alankodu == 64) {
                System.out.println(plaka + "--->Uşak İline Ait Plakadır.");
            } else if (alankodu == 65) {
                System.out.println(plaka + "--->Van İline Ait Plakadır.");
            } else if (alankodu == 66) {
                System.out.println(plaka + "--->Yozgat İline Ait Plakadır.");
            } else if (alankodu == 67) {
                System.out.println(plaka + "--->Zonguldak İline Ait Plakadır.");
            } else if (alankodu == 68) {
                System.out.println(plaka + "--->Aksaray İline Ait Plakadır.");
            } else if (alankodu == 69) {
                System.out.println(plaka + "--->Bayburt İline Ait Plakadır.");
            } else if (alankodu == 70) {
                System.out.println(plaka + "--->Karaman İline Ait Plakadır.");
            } else if (alankodu == 71) {
                System.out.println(plaka + "--->Kırıkkale İline Ait Plakadır.");
            } else if (alankodu == 72) {
                System.out.println(plaka + "--->Batman İline Ait Plakadır.");
            } else if (alankodu == 73) {
                System.out.println(plaka + "--->Şırnak İline Ait Plakadır.");
            } else if (alankodu == 74) {
                System.out.println(plaka + "--->Bartın İline Ait Plakadır.");
            } else if (alankodu == 75) {
                System.out.println(plaka + "--->Ardahan İline Ait Plakadır.");
            } else if (alankodu == 76) {
                System.out.println(plaka + "--->Iğdır İline Ait Plakadır.");
            } else if (alankodu == 77) {
                System.out.println(plaka + "--->Yalova İline Ait Plakadır.");
            } else if (alankodu == 78) {
                System.out.println(plaka + "--->Karabük İline Ait Plakadır.");
            } else if (alankodu == 79) {
                System.out.println(plaka + "--->Hatay İline Ait Plakadır.");
            } else if (alankodu == 80) {
                System.out.println(plaka + "--->Osmaniye İline Ait Plakadır.");
            } else if (alankodu == 81) {
                System.out.println(plaka + "--->Düzce İline Ait Plakadır.");
            }
        } else if (plaka.length() == 8) {
            if (alankodu == 1) {
                System.out.println(plaka + "--->Adana İline Ait Plakadır.");
            } else if (alankodu == 2) {
                System.out.println(plaka + "--->Adıyaman İline Ait Plakadır.");
            } else if (alankodu == 3) {
                System.out.println(plaka + "--->Afyonkarahisar İline Ait Plakadır.");
            } else if (alankodu == 4) {
                System.out.println(plaka + "--->Ağrı İline Ait Plakadır.");
            } else if (alankodu == 5) {
                System.out.println(plaka + "--->Amasya İline Ait Plakadır.");
            } else if (alankodu == 6) {
                System.out.println(plaka + "--->Ankara İline Ait Plakadır.");
            } else if (alankodu == 7) {
                System.out.println(plaka + "--->Antalya İline Ait Plakadır.");
            } else if (alankodu == 8) {
                System.out.println(plaka + "--->Artvin İline Ait Plakadır.");
            } else if (alankodu == 9) {
                System.out.println(plaka + "--->Aydın İline Ait Plakadır.");
            } else if (alankodu == 10) {
                System.out.println(plaka + "--->Balıkesir İline Ait Plakadır.");
            } else if (alankodu == 11) {
                System.out.println(plaka + "--->Bilecik İline Ait Plakadır.");
            } else if (alankodu == 12) {
                System.out.println(plaka + "--->Bingöl İline Ait Plakadır.");
            } else if (alankodu == 13) {
                System.out.println(plaka + "--->Bitlis İline Ait Plakadır.");
            } else if (alankodu == 14) {
                System.out.println(plaka + "--->Bolu İline Ait Plakadır.");
            } else if (alankodu == 15) {
                System.out.println(plaka + "--->Burdur İline Ait Plakadır.");
            } else if (alankodu == 16) {
                System.out.println(plaka + "--->Bursa İline Ait Plakadır.");
            } else if (alankodu == 17) {
                System.out.println(plaka + "--->Çanakkale İline Ait Plakadır.");
            } else if (alankodu == 18) {
                System.out.println(plaka + "--->Çankırı İline Ait Plakadır.");
            } else if (alankodu == 19) {
                System.out.println(plaka + "--->Çorum İline Ait Plakadır.");
            } else if (alankodu == 20) {
                System.out.println(plaka + "--->Denizli İline Ait Plakadır.");
            } else if (alankodu == 21) {
                System.out.println(plaka + "--->Diyarbakır İline Ait Plakadır.");
            } else if (alankodu == 22) {
                System.out.println(plaka + "--->Edirne İline Ait Plakadır.");
            } else if (alankodu == 23) {
                System.out.println(plaka + "--->Elazığ İline Ait Plakadır.");
            } else if (alankodu == 24) {
                System.out.println(plaka + "--->Erzincan İline Ait Plakadır.");
            } else if (alankodu == 25) {
                System.out.println(plaka + "--->Erzurum İline Ait Plakadır.");
            } else if (alankodu == 26) {
                System.out.println(plaka + "--->Eskişehir İline Ait Plakadır.");
            } else if (alankodu == 27) {
                System.out.println(plaka + "--->Gaziantep İline Ait Plakadır.");
            } else if (alankodu == 28) {
                System.out.println(plaka + "--->Giresun İline Ait Plakadır.");
            } else if (alankodu == 29) {
                System.out.println(plaka + "--->Gümüşhane İline Ait Plakadır.");
            } else if (alankodu == 30) {
                System.out.println(plaka + "--->Hakkari İline Ait Plakadır.");
            } else if (alankodu == 31) {
                System.out.println(plaka + "--->Hatay İline Ait Plakadır.");
            } else if (alankodu == 32) {
                System.out.println(plaka + "--->Isparta İline Ait Plakadır.");
            } else if (alankodu == 33) {
                System.out.println(plaka + "--->Mersin İline Ait Plakadır.");
            } else if (alankodu == 34) {
                System.out.println(plaka + "--->İstanbul İline Ait Plakadır.");
            } else if (alankodu == 35) {
                System.out.println(plaka + "--->İzmir İline Ait Plakadır.");
            } else if (alankodu == 36) {
                System.out.println(plaka + "--->Kars İline Ait Plakadır.");
            } else if (alankodu == 37) {
                System.out.println(plaka + "--->Kastamonu İline Ait Plakadır.");
            } else if (alankodu == 38) {
                System.out.println(plaka + "--->Kayseri İline Ait Plakadır.");
            } else if (alankodu == 39) {
                System.out.println(plaka + "--->Kırklareli İline Ait Plakadır.");
            } else if (alankodu == 40) {
                System.out.println(plaka + "--->Kırşehir İline Ait Plakadır.");
            } else if (alankodu == 41) {
                System.out.println(plaka + "--->Kocaeli İline Ait Plakadır.");
            } else if (alankodu == 42) {
                System.out.println(plaka + "--->Konya İline Ait Plakadır.");
            } else if (alankodu == 43) {
                System.out.println(plaka + "--->Kütahya İline Ait Plakadır.");
            } else if (alankodu == 44) {
                System.out.println(plaka + "--->Malatya İline Ait Plakadır.");
            } else if (alankodu == 45) {
                System.out.println(plaka + "--->Manisa İline Ait Plakadır.");
            } else if (alankodu == 46) {
                System.out.println(plaka + "--->Kahramanmaraş İline Ait Plakadır.");
            } else if (alankodu == 47) {
                System.out.println(plaka + "--->Mardin İline Ait Plakadır.");
            } else if (alankodu == 48) {
                System.out.println(plaka + "--->Muğla İline Ait Plakadır.");
            } else if (alankodu == 49) {
                System.out.println(plaka + "--->Muş İline Ait Plakadır.");
            } else if (alankodu == 50) {
                System.out.println(plaka + "--->Nevşehir İline Ait Plakadır.");
            } else if (alankodu == 51) {
                System.out.println(plaka + "--->Niğde İline Ait Plakadır.");
            } else if (alankodu == 52) {
                System.out.println(plaka + "--->Ordu İline Ait Plakadır.");
            } else if (alankodu == 53) {
                System.out.println(plaka + "--->Rize İline Ait Plakadır.");
            } else if (alankodu == 54) {
                System.out.println(plaka + "--->Sakarya İline Ait Plakadır.");
            } else if (alankodu == 55) {
                System.out.println(plaka + "--->Samsun İline Ait Plakadır.");
            } else if (alankodu == 56) {
                System.out.println(plaka + "--->Siirt İline Ait Plakadır.");
            } else if (alankodu == 57) {
                System.out.println(plaka + "--->Sinop İline Ait Plakadır.");
            } else if (alankodu == 58) {
                System.out.println(plaka + "--->Sivas İline Ait Plakadır.");
            } else if (alankodu == 59) {
                System.out.println(plaka + "--->Tekirdağ İline Ait Plakadır.");
            } else if (alankodu == 60) {
                System.out.println(plaka + "--->Tokat İline Ait Plakadır.");
            } else if (alankodu == 61) {
                System.out.println(plaka + "--->Trabzon İline Ait Plakadır.");
            } else if (alankodu == 62) {
                System.out.println(plaka + "--->Tunceli İline Ait Plakadır.");
            } else if (alankodu == 63) {
                System.out.println(plaka + "--->Şanlıurfa İline Ait Plakadır.");
            } else if (alankodu == 64) {
                System.out.println(plaka + "--->Uşak İline Ait Plakadır.");
            } else if (alankodu == 65) {
                System.out.println(plaka + "--->Van İline Ait Plakadır.");
            } else if (alankodu == 66) {
                System.out.println(plaka + "--->Yozgat İline Ait Plakadır.");
            } else if (alankodu == 67) {
                System.out.println(plaka + "--->Zonguldak İline Ait Plakadır.");
            } else if (alankodu == 68) {
                System.out.println(plaka + "--->Aksaray İline Ait Plakadır.");
            } else if (alankodu == 69) {
                System.out.println(plaka + "--->Bayburt İline Ait Plakadır.");
            } else if (alankodu == 70) {
                System.out.println(plaka + "--->Karaman İline Ait Plakadır.");
            } else if (alankodu == 71) {
                System.out.println(plaka + "--->Kırıkkale İline Ait Plakadır.");
            } else if (alankodu == 72) {
                System.out.println(plaka + "--->Batman İline Ait Plakadır.");
            } else if (alankodu == 73) {
                System.out.println(plaka + "--->Şırnak İline Ait Plakadır.");
            } else if (alankodu == 74) {
                System.out.println(plaka + "--->Bartın İline Ait Plakadır.");
            } else if (alankodu == 75) {
                System.out.println(plaka + "--->Ardahan İline Ait Plakadır.");
            } else if (alankodu == 76) {
                System.out.println(plaka + "--->Iğdır İline Ait Plakadır.");
            } else if (alankodu == 77) {
                System.out.println(plaka + "--->Yalova İline Ait Plakadır.");
            } else if (alankodu == 78) {
                System.out.println(plaka + "--->Karabük İline Ait Plakadır.");
            } else if (alankodu == 79) {
                System.out.println(plaka + "--->Hatay İline Ait Plakadır.");
            } else if (alankodu == 80) {
                System.out.println(plaka + "--->Osmaniye İline Ait Plakadır.");
            } else if (alankodu == 81) {
                System.out.println(plaka + "--->Düzce İline Ait Plakadır.");
            }

        } else {
            System.out.println("Yanlış Bir Plaka Tuşladınız Kontrol Edip Tekrar Deneyiniz.");
        }
    }
}
