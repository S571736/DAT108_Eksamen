public class Student {
    private String fornavn;
    private String etternavn;
    private String studentnr;
    private String klasseid;

    public Student(String fornavn, String etternavn, String studentnr, String klasseid){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.studentnr = studentnr;
        this.klasseid = klasseid;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(String studentnr) {
        this.studentnr = studentnr;
    }

    public String getKlasseid() {
        return klasseid;
    }

    public void setKlasseid(String klasseid) {
        this.klasseid = klasseid;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", studentnr='" + studentnr + '\'' +
                ", klasseid='" + klasseid + '\'' +
                '}';
    }
}
