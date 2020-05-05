/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.proyectojsfii.beans;

import java.io.Serializable;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Esta clase se encarga de realizar el calculo de salario a pagar.
 * @author Andres Gomez - Ruby Cardenas
 */
@ManagedBean(name = "Calcular")
@SessionScoped
public class Calcular implements Serializable {
    //Variables para los calulos
    private final int tecnico;
    private final int tecnologo;
    private final int profesional;
    private final int magister;
    private final int sueldoBase;
    private int sueldoFinal;
    private int incrementoEducativo;
    private int numeroIdiomas;
    private int incremetoIdiomas;
    private final int valorIdioma;

    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nivelEstudio;
    private String[] idioma;
    private int diasLaborados;
    private String infoIdioma;
    StringBuffer cadena = new StringBuffer();
//Metodo Constructor con inicializacion de variables.
    public Calcular() {
        this.tecnico = 5000;
        this.tecnologo = 15000;
        this.profesional = 30000;
        this.magister = 40000;
        this.sueldoBase = 30000;
        this.valorIdioma = 10000;
        this.infoIdioma="";

    }
//Metodo calculo de valor de acuerdo al nivel Educativo
    public void valorEstudios() {
        switch (nivelEstudio) {
            case "tecnico":
                incrementoEducativo = tecnico;
                break;

            case "tecnologo":
                incrementoEducativo = tecnologo;
                break;

            case "profesional":
                incrementoEducativo = profesional;
                break;

            case "magister":
                incrementoEducativo = magister;
                break;

        }
    }
//Metodo de calculo de acurdo al numero de idiomas que domina
    public void incrementoidiomas() {

        numeroIdiomas = idioma.length;
        switch (numeroIdiomas) {
            case 1:
                incremetoIdiomas = numeroIdiomas * valorIdioma;
                break;

            case 2:
                incremetoIdiomas = numeroIdiomas * valorIdioma;
                break;

            case 3:
                incremetoIdiomas = numeroIdiomas * valorIdioma;
                break;

            case 4:
                incremetoIdiomas = numeroIdiomas * valorIdioma;
                break;

        }
    }
//Metodo de ejecucion de los metodos de valorEstudio y Incemento de idiomas adicional el calculo del salario final
    public void calcularSueldo() {
        valorEstudios();
        incrementoidiomas();
        obtenerIdioma();
        sueldoFinal = (sueldoBase + incrementoEducativo + incremetoIdiomas) * diasLaborados;
    }
//Metodo de extraccion de idiomas en caso de haber seleccionado
    public void obtenerIdioma() {
        if (idioma == null || idioma.length == 0) {
            infoIdioma = "Ninguno";
        } else {
            for (int i = 0; i < idioma.length; i++) {
                //cadena =cadena.append(idioma[i])+"";
                infoIdioma=infoIdioma+" "+idioma[i];
            }
            //infoIdioma = cadena.toString();
        }
        System.out.println(infoIdioma);
        System.out.println(Arrays.toString(idioma));

    }

    public String getInfoIdioma() {
        return infoIdioma;
    }

    public void setInfoIdioma(String infoIdioma) {
        this.infoIdioma = infoIdioma;
    }

    public int getTecnico() {
        return tecnico;
    }

    public int getTecnologo() {
        return tecnologo;
    }

    public int getProfesional() {
        return profesional;
    }

    public int getMagister() {
        return magister;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public int getSueldoFinal() {
        return sueldoFinal;
    }

    public int getIncrementoEducativo() {
        return incrementoEducativo;
    }

    public int getNumeroIdiomas() {
        return numeroIdiomas;
    }

    public int getIncremetoIdiomas() {
        return incremetoIdiomas;
    }

    public int getValorIdioma() {
        return valorIdioma;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

}
