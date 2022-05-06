/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_unidad02_01_gswg_rnwe;
import controlador.EstudianteControl;
import java.time.LocalDate;
import modelo.Estudiante;
import modelo.Asignatura;

public class POO_Unidad02_01_GSWG_RNWE {
    public static void main(String[] args) {
        var estudianteControl = new EstudianteControl();
        estudianteControl.crear("Estefanía",1456,LocalDate.of(2000, 9, 22),8,"Telecomunicaciones"
                ,145,"Mate","Juan");
        estudianteControl.crear("Wilson",5612,LocalDate.of(1991, 7, 2),7,"Telecomunicaciones"
                ,123,"Quimica","Fabiola");
        estudianteControl.crear("Carlos",3267,LocalDate.of(1999, 1,30),6,"Telecomunicaciones"
                ,756,"POO","Mauricio");
        estudianteControl.crear("Sofia",9364,LocalDate.of(2002, 5, 14),5,"Telecomunicaciones"
                ,108,"Redes","Leonardo");
        
        System.out.println("Listado Inicial");
        
        for(Estudiante b: estudianteControl.listar())
            System.out.println(b.toString());
        
        estudianteControl.eliminar(1456);

        System.out.println("Listado Eliminando el código 1456");
        
        for(Estudiante b: estudianteControl.listar())
            System.out.println(b.toString());

        System.out.println("Listado Modificando el código 9364");
        
        var nuevaAsignatura = new Asignatura(145,"Filosofia","Carlos"); 
        var nuevoEstudiante = new Estudiante("Wendy",4561,LocalDate.of(2000, 1, 3),8,
                "Telecomunicaciones",nuevaAsignatura);
        
        estudianteControl.modificar(9364, nuevoEstudiante);
        
        for(Estudiante b: estudianteControl.listar())
            System.out.println(b.toString()); 
    }
    
}
