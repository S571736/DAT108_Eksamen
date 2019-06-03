import java.util.function.Function;

public class Oppg3 {


    public static void main(String[] args) {
        Ansatt a = new Ansatt("Hans", "Nordmann", 'm', "Leder", 1000000);
        Ansatt b = new Ansatt("Birgitte", "Kjuus", 'k', "Gruppeleder", 800000);
        Ansatt c = new Ansatt("Sondre", "Gjesdal", 'm', "Utvikler", 100000);

        Function<Double, Double> fastKroneTilleggLavLonn = x -> {
            if (x < 400000) {
                x += 400000;
            } else {
                System.out.println("\nDen ansatte har høg nok lønn og trenger ikkje lønnsøkning");
            }
            return x;
        };

        Function<Double, Double> fastKrone = x -> {
            return x += 500000;
        };

        Function<Double, Double> prosentTillegg = (x) -> x *= 1.5;

        System.out.println("Før endringer:");
        System.out.println("Ansatt a: " + a.toString());
        System.out.println("Ansatt b: " + b.toString());
        System.out.println("Ansatt c: " + c.toString());

        a.endreLoenn(fastKroneTilleggLavLonn);
        b.endreLoenn(fastKrone);
        c.endreLoenn(prosentTillegg);

        System.out.println("\nEtter endringer:");
        System.out.println("Ansatt a: " + a.toString());
        System.out.println("Ansatt b: " + b.toString());
        System.out.println("Ansatt c: " + c.toString());
    }

    public static Function<Double, Double> okMedProsent(int prosent) {
        return x -> ((x * prosent / 100) + x);

    }

}
