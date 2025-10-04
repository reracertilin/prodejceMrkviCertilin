import java.time.LocalDate;

/**
 * Atributy o prodejcích biomrkve
 */
public class atributyProdejcu {

    private String jmeno = "Jméno"; //Jméno prodejce
    private LocalDate datumNarozeni = LocalDate.now(); //Datum narození prodejce
    private int smlouvy = 0; //Počet dosud sjednaných smluv
    private double mrkve = 0; //Celkové množství prodané mrkve v tunách
    private Boolean senior; //jestli je to seniorní prodejce

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getSmlouvy() {
        return smlouvy;
    }

    public void setSmlouvy(int smlouvy) {
        this.smlouvy = smlouvy;
    }

    public double getMrkve() {
        return mrkve;
    }

    public void setMrkve(double mrkve) {
        this.mrkve = mrkve;
    }

    public Boolean getSenior() {
        return senior;
    }

    public void setSenior(Boolean senior) {
        this.senior = senior;
    }
}
