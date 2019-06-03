import java.util.function.Function;

public class Ansatt {
    private String fornavn;
    private String etternavn;
    private char kjonn;
    private String stilling;
    private double aarslonn;


    public Ansatt(String fornavn, String etternavn, char kjonn, String stilling, double aarslonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.kjonn = kjonn;
        this.stilling = stilling;
        this.aarslonn = aarslonn;
    }

    public Double endreLoenn(Function<Double, Double> nyverdi) {
        return this.aarslonn = nyverdi.apply(aarslonn);
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public char getKjonn() {
        return kjonn;
    }

    public String getStilling() {
        return stilling;
    }

    public double getAarslonn() {
        return aarslonn;
    }

    @Override
    public String toString() {
        return fornavn + " Tjener " + aarslonn;
    }
}
