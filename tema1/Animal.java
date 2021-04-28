package ierarhie;

public abstract class Animal {
    protected int picioare;

    protected Animal(int picioare) {
        this.picioare = picioare;
    }

    public void merge() {
        System.out.println("animalul cu: " + this.picioare + " picioare merge acum");
    }
}
