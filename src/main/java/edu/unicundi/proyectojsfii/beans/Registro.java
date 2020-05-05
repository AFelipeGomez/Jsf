/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.proyectojsfii.beans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *Clase para recibir os datos ingresados
 * @author Andres Gomez - Ruby Cardenas
 */
@ManagedBean(name = "Registro")
@SessionScoped
public class Registro implements Serializable {
//Propiedad para acceder a el Managed Bean donde se clacula el sueldo
    @ManagedProperty(value = "#{Calcular}")
    private Calcular calcular;
//Variables donde se almacenan los datos ingresados por el usuario
    private String cedula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String nivelEstudio;
    private String[] idioma;
    private int diasLaborados;
//Metodo para asignar los datos a las variables de MAnaged Bean calcular y a redirreccion al mismo
    public String enviarDatos() {

        calcular.setCedula(cedula);
        calcular.setNombre(nombre);
        calcular.setApellido(apellido);
        calcular.setFechaNacimiento(fechaNacimiento);
        calcular.setNivelEstudio(nivelEstudio);
        calcular.setIdioma(idioma);
        calcular.setDiasLaborados(diasLaborados);

        return "Calcular";

    }

    public Calcular getCalcular() {
        return calcular;
    }

    public void setCalcular(Calcular calcular) {
        this.calcular = calcular;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String[] getIdioma() {
        return idioma;
    }

    public void setIdioma(String[] idioma) {
        this.idioma = idioma;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

}
