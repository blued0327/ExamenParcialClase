
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
                PeliculaModel pelicula = new PeliculaModel(
                        rs.getInt("id"),
                        rs.getString("titulo"), 
                        rs.getString("director"),
                        rs.getInt("lanzamiento"), 
                        rs.getInt("duracion"), 
                        rs.getString("genero"), 
                        rs.getString("idioma"), 
                        rs.getString("descripcion"), 
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
        String query = "INSERT INTO pelicula(titulo,director,lanzamiento,duracion,genero,idioma,descripcion,recaudacion,estudiante,stock) values(?,?,?,?,?,?,?,?,?,?)";
        
        //try
        try(Connection conn = connf.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)){
            
            ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setInt(3, pelicula.getLanzamiento());
            ps.setInt(4, pelicula.getDuracion());
            ps.setString(5, pelicula.getGenero());
            ps.setString(6, pelicula.getIdioma());
            ps.setString(7, pelicula.getDescripcion());
            ps.setDouble(8, pelicula.getRecaudacion());
            ps.setString(9, pelicula.getEstudiante());
            ps.setInt(10, pelicula.getStock());
            
            ps.executeUpdate();
            return true;
                   
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    //actualizar
    public boolean actualizar(PeliculaModel pelicula){
        //query
        String query = "UPDATE pelicula set titulo=?,director=?,lanzamiento=?,duracion=?,genero=?,idioma=?,descripcion=?,recaudacion=?,estudiante=?,sotck? where id=?";
        //try
       try(Connection conn = connf.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)){
    ps.setString(1, pelicula.getTitulo());
            ps.setString(2, pelicula.getDirector());
            ps.setInt(3, pelicula.getLanzamiento());
            ps.setInt(4, pelicula.getDuracion());
            ps.setString(5, pelicula.getGenero());
            ps.setString(6, pelicula.getIdioma());
            ps.setString(7, pelicula.getDescripcion());
            ps.setDouble(8, pelicula.getRecaudacion());
            ps.setString(9, pelicula.getEstudiante());
            ps.setInt(10, pelicula.getStock());
            ps.setInt(11, pelicula.getId());
            
            ps.executeUpdate();
            return true;
                   
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    //eliminar
    public boolean eliminar(int id){
        
        //query
        String query ="DELETE FROM pelicula where id=?";
        try(Connection conn = connf.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)){
            ps.setInt(1, id);
            
            ps.executeUpdate();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
