package co.edu.unbosque.reto2.modelo;
        
import co.edu.unbosque.reto2.modelo.persistencia.PersonaDAO;
import co.edu.unbosque.reto2.modelo.persistencia.Archivo;
import java.io.File;  
import javax.swing.JFileChooser;
import java.util.ArrayList;

public class PersonaDTO {
    
    private ArrayList<Persona> colegio;
    private PersonaDAO persona_dao;
    private File file = new File("data/informacion.dat");
    private Archivo archivo;
    
    public PersonaDTO(){
        colegio = new ArrayList<Persona>();
        archivo = new Archivo(file);
        persona_dao = new PersonaDAO(archivo);
        colegio = archivo.leerArchivo(file);
    }

    public ArrayList<Persona> getPersona() {
        return colegio;
    }

    public void setPersona(ArrayList<Persona> colegio) {
        this.colegio = colegio;
    }

    public PersonaDAO getPersona_dao() {
        return persona_dao;
    }

    public void setPersona_dao(PersonaDAO persona_dao) {
        this.persona_dao = persona_dao;
    }
    
} 

