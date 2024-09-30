import java.util.ArrayList;
import java.util.List;

public class Main  {
    public static void main(String[] args) {

        List<Libro_impreso> lstLibroI = new ArrayList<>();
        Libro_impreso lbi1 = new Libro_impreso("Narnia", "Federico", 13000, 1.4);
        Libro_impreso lbi2 = new Libro_impreso("El diario del fin del mundo", "Mario", 50000, 2.9);
        Libro_impreso lbi3 = new Libro_impreso("Lady masacres", "Mario", 89000, 9.0);

        List<Libro_digital> lstLibrod = new ArrayList<>();
        Libro_digital lbd1 = new Libro_digital("Navidad", "El grinch", 90000, 1.3);
        Libro_digital lbd2 = new Libro_digital("Hello", "Yo", 12000, 9.0);
        Libro_digital lbd3 = new Libro_digital("Hallowen", "Roberto", 46000, 4.7);

        lstLibroI.add(lbi1);
        lstLibroI.add(lbi2);
        lstLibroI.add(lbi3);

        lstLibrod.add(lbd1);
        lstLibrod.add(lbd2);
        lstLibrod.add(lbd3);

        for (Libro_impreso es : lstLibroI) {
            System.out.println(es);
        }

        System.out.println("\n");

        for (Libro_digital es : lstLibrod) {
            System.out.println(es);
        }


    }

}
