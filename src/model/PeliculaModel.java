
package model;

/**
 *
 * @author UMG
 */
public class PeliculaModel {
    private int id;
    private String titulo;
    private String director;
    private int lanzamiento;
    private int duracion;
    private String genero;
    private String idioma;
    private String descripcion;
    private double recaudacion;
    private String estudiante;
    private int stock;

    public PeliculaModel(int id, String titulo, String director, int lanzamiento, int duracion, String genero, String idioma, String descripcion, double recaudacion, String estudiante, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.lanzamiento = lanzamiento;
        this.duracion = duracion;
        this.genero = genero;
        this.idioma = idioma;
        this.descripcion = descripcion;
        this.recaudacion = recaudacion;
        this.estudiante = estudiante;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(int lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
}
