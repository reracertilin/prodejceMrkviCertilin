import java.time.LocalDate;

void main() {

    //Seznam prodejců
    Prodejce prodejce1 = new Prodejce();
    Prodejce prodejce2 = new Prodejce();
    Prodejce prodejce3 = new Prodejce();

    //výpis dat prodejce1
    prodejce1.setJmeno("Karel"); //Jméno prodejce
    prodejce1.setDatumNarozeni(LocalDate.of(2000,5,25)); //Datum narození prodejce
    prodejce1.setSmlouvy(2); //Počet dosud sjednaných smluv
    prodejce1.setMrkve(10.58); //Celkové množství prodané mrkve v tunách
    prodejce1.setSenior(false); // jestli je to senior

    //výpis dat prodejce2
    prodejce2.setJmeno("Anička"); //Jméno prodejce
    prodejce2.setDatumNarozeni(LocalDate.of(1890,12,9)); //Datum narození prodejce
    prodejce2.setSmlouvy(10); //Počet dosud sjednaných smluv
    prodejce2.setMrkve(45.1); //Celkové množství prodané mrkve v tunách
    prodejce2.setSenior(false); // jestli je to senior

    //výpis dat prodejce3
    prodejce3.setJmeno("Roman"); //Jméno prodejce
    prodejce3.setDatumNarozeni(LocalDate.of(1950,9,11)); //Datum narození prodejce
    prodejce3.setSmlouvy(54); //Počet dosud sjednaných smluv
    prodejce3.setMrkve(500.45); //Celkové množství prodané mrkve v tunách
    prodejce3.setSenior(true); // jestli je to senior


    //výpis dat na obrazovku prodejce1
    System.out.println("Prodejce " + prodejce1.getJmeno() + " narozený " + prodejce1.getDatumNarozeni()); //výpis jména a roku narození
    System.out.println("prodal " + prodejce1.getMrkve() + " tuny mrkve, a by zapojen do " + prodejce1.getSmlouvy() + " smluv"); //výpis množství prodané mrkve a počet podepsaných smluv
    System.out.println("a při tom " + (prodejce1.getSenior() ? "je senior" : "není senior")); //výpis jestli je nebo není senior
    System.out.println(" ");//odstavec

    //výpis dat na obrazovku prodejce2
    System.out.println("Prodejce " + prodejce2.getJmeno() + " narozený " + prodejce2.getDatumNarozeni()); //výpis jména a roku narození
    System.out.println("prodal " + prodejce2.getMrkve() + " tuny mrkve, a by zapojen do " + prodejce2.getSmlouvy() + " smluv"); //výpis množství prodané mrkve a počet podepsaných smluv
    System.out.println("a při tom " + (prodejce2.getSenior() ? "je senior" : "není senior")); //výpis jestli je nebo není senior
    System.out.println(" ");//odstavec

    //výpis dat na obrazovku prodejce3
    System.out.println("Prodejce " + prodejce3.getJmeno() + " narozený " + prodejce3.getDatumNarozeni()); //výpis jména a roku narození
    System.out.println("prodal " + prodejce3.getMrkve() + " tuny mrkve, a by zapojen do " + prodejce3.getSmlouvy() + " smluv"); //výpis množství prodané mrkve a počet podepsaných smluv
    System.out.println("a při tom " + (prodejce3.getSenior() ? "je senior" : "není senior")); //výpis jestli je nebo není senior
    System.out.println(" ");//odstavec
}

