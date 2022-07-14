package Herança;

/* Pratica de Herança */

public class AnimalTeste {

    public static void main (String[] args) {

        Cachorro lulu = new Cachorro();
        lulu.comida = "ração";
        lulu.peso = 10;
        System.out.println("Cachorro:");
        System.out.println(lulu.comida);
        System.out.println(lulu.peso + "kg");

        Galinha cocorico = new Galinha();
        System.out.println("Galinha: ");
        cocorico.peso = 2.0;
        System.out.println(cocorico.peso + "kg");
        cocorico.dormir();
    }
}
