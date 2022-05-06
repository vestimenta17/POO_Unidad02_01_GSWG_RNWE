/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import java.util.ArrayList;
import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author HP
 */
public class EstudianteServicio implements IEstudianteServicio {
    public final List<Estudiante> estudianteList = new ArrayList<>();
    @Override
    public Estudiante crear(Estudiante b) {
        this.estudianteList.add(b);
        return b;
    }

    @Override
    public Estudiante modificar(int c, Estudiante b) {
        this.estudianteList.set(this.buscarPosicion(c), b);
        return b;
    }

    @Override
    public Estudiante eliminar(int c) {
        var estudiante=this.estudianteList.get(this.buscarPosicion(c));
        this.estudianteList.remove(this.buscarPosicion(c));
        return estudiante;
    }

    @Override
    public List<Estudiante> listar() {
        return this.estudianteList;
    }

    @Override
    public int buscarPosicion(int c) {  
        var posicion=-1;
        var i=0;
        for(var auxEstudiante:this.estudianteList){
            if(auxEstudiante.getIdEstudiante()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
}
     

