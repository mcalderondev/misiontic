package co.edu.unbosque.reto2.modelo;

import java.io.Serializable;

public class Persona {

    protected String nombres;
    protected String apellidos;
    protected String fnacimiento;
    protected String cinstitucional;
    protected String cpersonal;
    protected long ncelular;
    protected long nfijo;
    protected String programa;

    public Persona (String nombres,String apellidos,String fnacimiento, 
            String cinstitucional, String cpersonal, long ncelular, long nfijo, String programa) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fnacimiento = fnacimiento;
        this.cinstitucional = cinstitucional;
        this.cpersonal = cpersonal;
        this.ncelular = ncelular;
        this.nfijo = nfijo;
        this.programa = programa;
    } 

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getCinstitucional() {
        return cinstitucional;
    }

    public void setCinstitucional(String cinstitucional) {
        this.cinstitucional = cinstitucional;
    }

    public String getCpersonal() {
        return cpersonal;
    }

    public void setCpersonal(String cpersonal) {
        this.cpersonal = cpersonal;
    }

    public long getNcelular() {
        return ncelular;
    }

    public void setNcelular(long ncelular) {
        this.ncelular = ncelular;
    }

    public long getNfijo() {
        return nfijo;
    }

    public void setNfijo(long nfijo) {
        this.nfijo = nfijo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
    
        @Override
    public String toString() {
        return "Nombre: " + nombres + " -> edad: " ;
    }
    
}
