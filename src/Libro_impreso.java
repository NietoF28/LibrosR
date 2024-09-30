public class Libro_impreso extends Libro {

private double peso;

    public Libro_impreso() {

    }

    public Libro_impreso(String titulo, String autor, double precio, double peso) {
        super(titulo, autor, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Libro_impreso{" +
                "peso=" + peso +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }
    public void mostrarInfo(String titulo, String autor, double precio, double peso) {

        super.mostrarInfo();
    }
}
