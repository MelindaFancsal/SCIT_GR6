package ierarhie;

public class TestAnimal {
    public static void main(String[] args) {
        AnimalNoAbs a = new AnimalNoAbs();

        Peste peste = new Peste();
        peste.setNume("Fish");

        //upcast
        Animal peste1 = new Peste();
        // peste1.setNume("Fish");
        peste1.merge();
        peste1.mananca();

        AnimalCompanie peste3 = new Peste();
        peste3.setNume("Fish3");

        //upcast
        //Peste peste4 = new Animal();
        Peste peste4 = (Peste) peste1;

        //Un client doreste sa cumpere 5 animale de companie. Mai exact doreste 2 pesti si 3 pisici. Afisati numele anumalelor de companie
        Pisica pisica1 = new Pisica();
        pisica1.setNume("a");

        Pisica pisica2 = new Pisica();
        pisica2.setNume("B");

        Pisica pisica3 = new Pisica();
        pisica3.setNume("C");

        AnimalCompanie[] animaleDeCompanie = new AnimalCompanie[]{
                peste,
                peste3,
                pisica1,
                pisica2,
                pisica3
        };

        for (AnimalCompanie animalCompanie : animaleDeCompanie) {
            System.out.println(animalCompanie.getNume());
        }

        //Vreau sa afisati numarul de obiecte de tip Pisica create
        //  Pisica.nrObiecte

        //ambele variante sunt corecte
//        Pisica.nrObiecte++;
//        pisica1.nrObiecte++;

        System.out.println("Numarul de obiecte de tip Pisica este egal cu:" + Pisica.nrObiecte);
    }

}
