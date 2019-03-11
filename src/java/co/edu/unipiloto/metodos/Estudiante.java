/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.metodos;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jeffe
 */
public class Estudiante 
{
   /*  
    private String fecha;
    private String ingreso;
    private String semestre;
    private String programa;
    private String correo;*/
    
    private String name;
    private String apellido;
    private String programa;
    private int ingreso;
    private int semestre;
    private int dia; 
    private int mes; 
    private int anyo; 
    private int resultado; 
    private int anyoActual; 
    private int semestreActual; 
    Calendar cal;
    
    public Estudiante () {
       /* name = null;
        fecha = null;
        ingreso = null;
        semestre = null;
        programa = null;
        correo = null;*/
        
          name = null; 
          programa = null;
        ingreso = 0; 
        semestre = 0; 
        dia = 0;
        mes = 0; 
        anyo = 0;  
        semestreActual=0; 
        cal = new GregorianCalendar();
        anyoActual = cal.get(Calendar.YEAR);
        resultado = 0;
    }

    public int semestresCursados(){
        int resultado2 = Math.abs(ingreso-anyoActual);
        int suma = 0;
        int r = 0; 
        if(semestre == 1){
            suma = 2; 
        }else {
            suma = 1; 
        }
        for(int i=0; i<resultado2*2; i++){
            r = suma++;
        }
        return r;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   /* public String getFecha() {
        return fecha;
    }*/

   /* public void setFecha(String fecha) {
        this.fecha = fecha;
    }*/

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
/*
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }*/
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public int getResultado() {
        return resultado = Math.abs(anyo - anyoActual);
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getAnyoActual() {
        return anyoActual;
    }

    public void setAnyoActual(int anyoActual) {
        this.anyoActual = anyoActual;
    }

    public int getSemestreActual() {
        return semestresCursados();
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }
    
}


