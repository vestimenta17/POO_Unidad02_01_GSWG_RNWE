/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.util.List;
import modelo.Estudiante;
import modelo.Asignatura;
import servicio.EstudianteServicio;
import java.time.LocalDate;
/**
 *
 * @author HP
 */
public class EstudianteControl {
    public EstudianteServicio estudianteServicio = new EstudianteServicio();
    
    public Estudiante crear(String n , int iE, LocalDate aN, int c, String cR, int cA, String nA, String pA){
        var asignatura = new Asignatura(cA,nA, pA);
        var estudiante = new Estudiante(n,iE,aN,c,cR,asignatura);
        this.estudianteServicio.crear(estudiante);
        return estudiante;
    }
    
    public Estudiante eliminar(int c) {
        return this.estudianteServicio.eliminar(c);
    }
    
    public Estudiante modificar(int c, Estudiante b) {
        return this.estudianteServicio.modificar(c,b);
    }
    
    
    
    public List<Estudiante> listar()
    {
        return this.estudianteServicio.listar();
    }
    
}
