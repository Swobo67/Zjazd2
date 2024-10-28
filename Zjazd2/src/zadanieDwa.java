import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class zadanieDwa {
    public static void main(String[] args) {
        Random random = new Random();
        int losowanie = random.nextInt(100) + 1;
        System.out.println("Liczba wylosowana " + losowanie);

        if (losowanie % 2 == 0) {
            System.out.println("Wylosowana liczba jest parzysta");
        }
        else {
            System.out.println("Wylosowana liczba jest nieparzysta");
        }

        double produktNetto = 9.99;
        System.out.println("Cena netto " + produktNetto);
        double vat = 0.23;

        double produktBrutto = produktNetto + (produktNetto * vat);
        System.out.println("Cena brutto " + produktBrutto);
        double produktPomnozona = produktBrutto * 10000;
        System.out.println("Cena sprzedazy 10 000 sztuk  " + produktPomnozona);
        double produktSztuk = produktPomnozona - (produktPomnozona * vat);
        System.out.println("Cena sprzedazy 10 000 sztuk bez VAT  " + produktSztuk);

        BigDecimal cennaNetto = new BigDecimal("9.99");
        BigDecimal cennaVat = new BigDecimal("0.23");

        System.out.println("wykorzystując BigDecimal");
        System.out.println("Cena netto " + cennaNetto);
        BigDecimal cenaBrutto = cennaNetto.multiply(BigDecimal.ONE.add(cennaVat));
        cenaBrutto = cenaBrutto.setScale(2, RoundingMode.HALF_UP); // Zaokrąglenie do 2 miejsc po przecinku
        System.out.println("Cena brutto " + cenaBrutto);


    }
}
