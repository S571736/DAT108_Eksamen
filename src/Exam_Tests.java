import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exam_Tests {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Sondre", "Gjesdal", "363636", "108"),
                new Student("Raida", "Talukdar", "9696969", "108"),
                new Student("Heine", "Fjeldberg", "545454", "110"),
                new Student("Helene", "Nordahl", "212121", "110"),
                new Student("Kristian", "Sjurdal", "434343", "109")
                );

    }

    public final static Comparator<Student> paaEtternavn =
            (s1, s2) -> s1.getEtternavn().compareTo(s2.getEtternavn());
    }
}
