package co.edu.unbosque.reto2.modelo.persistencia;

import co.edu.unbosque.reto2.modelo.Persona;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PersonaDAO {

    private Archivo archivo;

    public PersonaDAO (Archivo archivo) {
        this.archivo = archivo;
    }

    public boolean agregarPersona(String nombres,String apellidos,String fnacimiento, 
            String cinstitucional, String cpersonal, long ncelular, long nfijo, String programa, 
                    ArrayList <Persona> colegio, File file) {
        
        Persona nueva = new Persona (nombres, apellidos, fnacimiento,cinstitucional, cpersonal,
            ncelular, nfijo, programa);
        
        if (buscarPersona(cinstitucional, colegio) == null) {
            colegio.add(nueva);
            archivo.escribirArchivo(colegio, file);
            return true;
        } else {
            return false;
        }
    }

    public Persona buscarPersona (String cinstitucional, ArrayList<Persona> colegio) {
        Persona encontrada = null;

        if (!colegio.isEmpty()) {
            for (Persona persona : colegio) {
                if (cinstitucional.equals(persona.getCinstitucional())) {
                    encontrada = persona;
                }
            }
        }

        return encontrada;
    }

    public boolean eliminarPersona (String cinstitucional, ArrayList<Persona> colegio, File file) {
        try {
            Persona m = buscarPersona(cinstitucional, colegio);
            if (m == null) {
                return false;
            } else {
                colegio.remove(m);
                file.delete();
                file.createNewFile();
                archivo.escribirArchivo(colegio, file);
                return true;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
/*
    public boolean modificarMascota(String nombre, String nombre2,int edad, ArrayList<Mascota> veterinaria, File file) {
        Mascota encontrada = buscarMascota(nombre, veterinaria);
        try {
            if (encontrada != null) {
                eliminarMascota(nombre, veterinaria, file);
                encontrada.setNombre(nombre2);
                encontrada.setEdad(edad);
                veterinaria.add(encontrada);
                file.delete();
                file.createNewFile();
                archivo.escribirArchivo(veterinaria, file);
                return true;
            } else {
                return false;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    */
    public String mostrarListado(File file) {
        ArrayList<Persona> colegio = archivo.leerArchivo(file);
        String listado = "";
        for (Persona persona : colegio) {
            listado = listado.concat(persona.toString() + "\n");
        }
        return listado;
    }

}
