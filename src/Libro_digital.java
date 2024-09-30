public class Libro_digital extends Libro{

private double tamanioArchivo;

    public Libro_digital(String titulo, String autor, double precio, double tamanioArchivo) {
        super(titulo, autor, precio);
        this.tamanioArchivo = tamanioArchivo;
    }
    public Libro_digital() {

    }

    public double getTamanioArchivo() {
        return tamanioArchivo;
    }

    public void setTamanioArchivo(double tamanioArchivo) {
        this.tamanioArchivo = tamanioArchivo;
    }

    @Override
    public String toString() {
        return "Libro_digital{" +
                "tamanioArchivo=" + tamanioArchivo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void mostrarInfo(String titulo, String autor, double precio, double tamanioArchivo) {

        super.mostrarInfo();
    }
}
