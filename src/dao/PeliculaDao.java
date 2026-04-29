
package dao;

import connection.CreateConnection;
import java.sql.*;
import model.PeliculaModel;
import java.util.List;
import java.util.ArrayList;


public class PeliculaDao {
    
    private final CreateConnection connf = new CreateConnection();
    
    //obtener todos
    public List<PeliculaModel> obtenerTodos(){
        List<PeliculaModel> lista = new ArrayList<>();
        //query
        String query = "SELECT *FROM pelicula";
        
        //try
        try(Connection conn = connf.getConnection();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery()){
            while(rs.next()){
                PeliculaModel pelicula = new PeliculaModel(rs.getInt("id"),
                        rs.getString("titulo"), 
                        rs.getString("director"),
                        rs.getInt("lanzamiento"), 
                        rs.getInt("duracion"), 
                        rs.getString("genero"), 
                        rs.getString("idioma"), 
                        rs.getString("descrpcion"), 
                        rs.getDouble("recaudacion"), 
                        rs.getString("estudiante"),
                        rs.getInt("stock")
                );
                lista.add(pelicula);
                
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
        return lista;
    }
    
    //guardar
    public boolean guardar(PeliculaModel pelicula){
        //query
        String query = "INSERT INTO pelicula(id,titulo,director,lanzamiento,duracion,genero,idioma,descripcion,recuadacion,estudiante,sotck) values(?,?,?,?,?,?,?,?,?,?,?)";
        
        //try
        try(Connection conn = connf.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setString(3, pelicula.getDirector());
            ps.setInt(4, pelicula.getLanzamiento());
            ps.setInt(5, pelicula.getDuracion());
            ps.setString(6, pelicula.getGenero());
            ps.setString(7, pelicula.getIdioma());
            ps.setString(8, pelicula.getDescripcion());
            ps.setDouble(9, pelicula.getRecaudacion());
            ps.setString(10, pelicula.getEstudiante());
            ps.setInt(11, pelicula.getStock());
            
            return true;
                   
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    //actualizar
    
}
