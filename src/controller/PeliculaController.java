
package controller;

import java.util.List;

import dao.PeliculaDao;
import model.PeliculaModel;


public class PeliculaController {
    private final PeliculaDao dao = new PeliculaDao();
    
    //obtener todos
    public List obtenerPeliculas(){
        return dao.obtenerTodos();
    }
    
    //agregar
    public void agregarPelicula(String titulo, String director, int lanzamiento, int duracion, String genero, String idioma, String descripcion, double recaudacion,String estudiante,int stock){
        PeliculaModel pelicula = new PeliculaModel(0, titulo, director, lanzamiento, duracion, genero, idioma, descripcion, recaudacion, estudiante, stock);
        dao.guardar(pelicula);
    }
    //actualizar
    public void actualizarPelicula(int id,String titulo, String director, int lanzamiento, int duracion, String genero, String idioma, String descripcion, double recaudacion,String estudiante,int stock){
        PeliculaModel pelicula = new PeliculaModel(id, titulo, director, lanzamiento, duracion, genero, idioma, descripcion, recaudacion, estudiante, stock);
        dao.actualizar(pelicula);
    }
}
