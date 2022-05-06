/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;
import java.util.List;
import modelo.Estudiante;
/**
 *
 * @author HP
 */
public interface IEstudianteServicio {
    public Estudiante crear(Estudiante b);
    public Estudiante modificar(int c, Estudiante b);
    public Estudiante eliminar(int c);
    public List<Estudiante> listar();
    public int buscarPosicion(int c);
    
}
