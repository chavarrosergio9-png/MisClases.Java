
public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(){
        this("", "", true);
    }

    public Libro(String titulo, String autor){
        this(titulo, autor, true);
    }

    public Libro(String titulo, String autor, boolean disponible){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public void mostrarInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
    }

    public void prestar(){
        if (disponible) {
            disponible = false;
        }
    }

    public void devolver(){
        disponible = true;
    }
}