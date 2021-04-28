package ierarhie;

public class Peste extends Animal implements AnimalCompanie {
    private String nume;

    protected Peste() {
        super(0);

        this.nume = "";
    }

    @Override
    public void merge() {
        System.out.println("Pestele inoata");
    }

    public void mananca() {
        System.out.println("Pestele mananca");
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;

    }

    public void joaca() {
        System.out.println("pestele se joaca");
    }
}
