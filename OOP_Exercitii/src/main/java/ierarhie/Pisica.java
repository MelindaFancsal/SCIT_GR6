package ierarhie;

public class Pisica extends Animal implements AnimalCompanie {
    public static int nrObiecte;
    private String nume;

    protected Pisica() {
        super(4);

        nume = "";
        nrObiecte++;
    }

    public void mananca() {
        System.out.println("pisica mananca");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void joaca() {
        System.out.println("pisica se joaca");
    }

    public static int returnareNumarObiecteDeTipPisica() {
      //  this.nume -> static apeleaza doar static
        return nrObiecte;
    }
}
