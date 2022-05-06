/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author HP
 */
public class Estudiante {
    private String nombre;
    private int idEstudiante;
    private LocalDate añoNacimiento;
    private int calificacion;
    private String carrera;
    private Asignatura unaAsignatura;
    
    public Estudiante(String nombre,int idEstudiante,
            int calificacion,String carrera, LocalDate añoNacimiento){
        this.nombre= nombre;
        this.idEstudiante= idEstudiante;
        this.añoNacimiento = añoNacimiento;
        this.calificacion= calificacion;
        this.carrera= carrera;
    }
    public Estudiante(String nombre,int idEstudiante,LocalDate añoNacimiento,
            int calificacion,String carrera, Asignatura unaAsignatura){
        this.nombre= nombre;
        this.idEstudiante= idEstudiante;
        this.calificacion= calificacion;
        this.añoNacimiento= añoNacimiento;
        this.carrera= carrera;
        this.unaAsignatura= unaAsignatura;
    }


    public boolean pasaAño(){
        var retorno=false;
        if(this.calificacion<7){
            retorno=true;
        }
        else
            if(this.calificacion>=7){
                retorno=true;
            }
        return retorno;
    }
    public int calcularEdad(int yearActual){
        return yearActual - this.añoNacimiento.getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public LocalDate getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(LocalDate añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Asignatura getUnaAsignatura() {
        return unaAsignatura;
    }

    public void setUnaAsignatura(Asignatura unaAsignatura) {
        this.unaAsignatura = unaAsignatura;
    }

    @Override
    public String toString() {
        return "Datos del Estudiante{" + "nombre=" + nombre + ", idEstudiante=" 
                + idEstudiante + ", a\u00f1oNacimiento=" + añoNacimiento 
                + ", calificacion=" + calificacion + ", carrera=" + carrera 
                +"\n"+ ", Datos de la asignatura=" + unaAsignatura + '}';
    }

    
    
}
