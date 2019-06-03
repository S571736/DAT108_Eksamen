import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Oppg4 {

    public static void main(String[] args) {


        List<Ansatt> ansatte = Arrays.asList(
                new Ansatt("Anne", "Bø", 'K', "Salg", 150000),
                new Ansatt("Petter", "Bø", 'M', "IT", 150000),
                new Ansatt("Kari", "Mø", 'K', "Tele", 460000),
                new Ansatt("Are", "Lie", 'M', "Salg", 350000),
                new Ansatt("Lars", "Moe", 'M', "Sjef", 1000000),
                new Ansatt("Trine", "Lie", 'K', "Tele", 450000),
                new Ansatt("Knut", "Jonsen", 'M', "Salg", 410000),
                new Ansatt("Siri", "Sjur", 'K', "Sjef", 450000)
        );
        //a
        List<String> aList = ansatte.stream()
                .map(e -> e.getEtternavn())
                .collect(Collectors.toList());

        System.out.println("Oppgave a: " + aList);


        //b

        int kvinner = (int) ansatte.stream()
                .filter(k -> k.getKjonn() == 'K')
                .count();
        System.out.println("\nAntall kvinner: " + kvinner);

        //c
        double gjennomsnittsLonn = ansatte.stream()
                .filter(k -> k.getKjonn() == 'K')
                .mapToDouble(k -> k.getAarslonn())
                .average()
                .getAsDouble();

        System.out.println("\nGjennomsnittslønn for kvinner: " + gjennomsnittsLonn);

        //d
        System.out.println("\n");
        ansatte.stream()
                .filter(x -> x.getStilling().equals("Sjef"))
                .forEach(sjef -> System.out.println(sjef.getEtternavn() + " tjener " + sjef.getAarslonn()));


        ansatte.stream()
                .filter(x -> x.getStilling().equals("Sjef"))
                .forEach(Sjef -> Sjef.endreLoenn(Oppg3.okMedProsent(7)));

        ansatte.stream()
                .filter(x -> x.getStilling().equals("Sjef"))
                .forEach(sjef -> System.out.println(sjef.getEtternavn() + " tjener " + sjef.getAarslonn()));

        //e
        boolean warhammer80k = ansatte.stream()
                .anyMatch(a -> a.getAarslonn() > 800000);
        System.out.println(warhammer80k);

        //f
        ansatte.stream()
                .forEach(p -> System.out.println(p.toString()));

        //g
        int minlonn = (int) ansatte.stream()
                .min(Comparator.comparing(Ansatt::getAarslonn))
                .get().getAarslonn();
        List<Ansatt> minstelønn = ansatte.stream()
                .filter(p -> p.getAarslonn() == minlonn)
                .collect(Collectors.toList());


        //h

        int sum = IntStream.range(1,1000).
                filter(x -> x % 3 == 0 || x % 5 == 0)
                .sum();
        System.out.println("\n" + sum);
    }
}
