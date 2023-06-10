import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolista1 = new Futbolista("84340786Q", "Karamoko Cissé", 31, 500);
        Futbolista futbolista2 = new Futbolista("Y4277432K", "Simone Vergassola", 19, 100);
        Futbolista futbolista3 = new Futbolista("43041487T", "Elano Blumer", 20, 230);
        Futbolista futbolista4 = new Futbolista("10780158N", "Antonio Inutile", 22, 270);
        Futbolista futbolista5 = new Futbolista("57042371W", "Ciprian Marica", 18, 580);

        List<Futbolista> futbolistas = Arrays.asList(futbolista1, futbolista2, futbolista3, futbolista4, futbolista5);

        // Ordenar por DNI
        Collections.sort(futbolistas);

        System.out.println("Ordenados por DNI:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }

        // Ordenar por nombre
        Collections.sort(futbolistas, Futbolista.comparadorNombre);

        System.out.println("Ordenados por nombre:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }

        // Ordenar por edad y nombre
        Collections.sort(futbolistas, Futbolista.comparadorEdad);

        System.out.println("Ordenados por edad y nombre:");
        for (Futbolista futbolista : futbolistas) {
            System.out.println(futbolista);
        }
    }
}
