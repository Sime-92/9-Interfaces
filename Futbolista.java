import java.util.Comparator;

public class Futbolista implements Comparable<Futbolista> {
    private String dni;
    private String nombre;
    private int edad;
    private int numeroDeGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroDeGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeGoles = numeroDeGoles;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroDeGoles() {
        return numeroDeGoles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numeroDeGoles=" + numeroDeGoles +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Futbolista futbolista = (Futbolista) obj;
        return dni.equals(futbolista.dni);
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return dni.compareTo(otroFutbolista.dni);
    }

    public static Comparator<Futbolista> comparadorNombre = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista futbolista1, Futbolista futbolista2) {
            return futbolista1.nombre.compareTo(futbolista2.nombre);
        }
    };

    public static Comparator<Futbolista> comparadorEdad = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista futbolista1, Futbolista futbolista2) {
            int resultado = Integer.compare(futbolista1.edad, futbolista2.edad);
            if (resultado == 0) {
                resultado = futbolista1.nombre.compareTo(futbolista2.nombre);
            }
            return resultado;
        }
    };
}
