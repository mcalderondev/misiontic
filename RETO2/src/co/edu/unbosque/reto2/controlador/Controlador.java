
package co.edu.unbosque.reto2.controlador;
        
import co.edu.unbosque.reto2.modelo.PersonaDTO;
import co.edu.unbosque.reto2.vista.Vista;
import java.util.*;


public class Controlador {
    
    private Vista vista;
    private PersonaDTO dto;
/*
    public Controlador(){
        vista = new Vista();
        pers = new PersonaDTO();
        funcionar();
    }
    
    public void funcionar(){
        int opcion = 0;
        int c = 0, e = 0;
        
        String menu = "INSTITUTO LA FLORESTA\n"+
                      "Seleccione tarea a realizar:\n"+
                      "1. Ingresar estudiante\n" +
                      "2. Buscar estudiante\n" +
                      "3. Modificar estudiante\n" +
                      "4. Eliminar Estudiante\n" +
                      "5. Ver directorio de estudiantes\n" +
                      "6. Salir\n" + 
                      "Opción:";
        do{
            opcion = vista.leerDatoEntero(menu);
            switch(opcion){
                case 1:
                    ingresarComputador();
                    break;
                case 2:
                    buscarComputador();
                    break;
                case 3:
                    modificarComputador();
                    break;
                case 4:
                    eliminarComputador();
                    break;
                case 5:
                    mostrarDirectorio();
                    break;
                case 6:
                    vista.mostrarInformacion("\nHasta pronto");
                    break;
                default:
                    vista.mostrarInformacion("\nError: Opción no válida");
            }
        }while(opcion!=6);
    }
    }    
        /*
           //Scanner teclado = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> colegio = new ArrayList<Persona>();
    */    
    public Controlador(){
        vista = new Vista();
        dto = new PersonaDTO();
        funcionar();
    }
    
    public void funcionar(){
        
 // Scanner leer = new Scanner(System.in).useDelimiter("\n");    
    
        int op=0; 
        while(op!=6){
            System.out.println("INSTITUTO LA FLORESTA\n"+
            "Seleccione tarea a realizar:\n"+
            "1. Ingresar estudiante\n" +
            "2. Buscar estudiante\n" +
            "3. Modificar estudiante\n" +
            "4. Eliminar Estudiante\n" +
            "5. Ver directorio de estudiantes\n" +
            "6. Salir\n" + "Opción:");
            
 //           op=leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingresar estudiante");
                    System.out.println("Ingresar nombres:");
                    leer.nextLine();
                    String nombres= leer.nextLine();
                    System.out.println("Ingresar apellidos:");
                    String apellidos = leer.nextLine();
                    System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                    leer.nextLine();
                    String fnacimiento = leer.nextLine();
                    System.out.println("Ingresar correo institucional:");
                    leer.nextLine();
                    String cinstitucional = leer.nextLine();
                    
                    colegio.add(new Computador(cod,mem,marca));
                    break;
                
                case 2:
                   //Encontrar y mostrar
                    System.out.println("Digite el codigo a Encontar: ");
                    String encontrar = teclado.next();
                    for(Computador varrecorrido: listaComputadores){
                        varrecorrido.buscarDatos(encontrar);
                    }                
                                      
                    break;
               
                case 3:
                    //Update o modificar
                    System.out.println("Digite el código a Modificar: ");
                    encontrar=teclado.next();
                    
                    for(int i=0;i<listaComputadores.size();i=i+1){
                        if(listaComputadores.get(i).getCodigo().equals(encontrar)){
                            
                            System.out.println("Ingresar codigo:");
                            teclado.nextLine();
                            cod=teclado.nextLine();                               
                            System.out.println("Ingresar marca:");
                            marca = teclado.nextLine();                           
                            listaComputadores.set(i,new Computador(cod,listaComputadores.get(i).getMemoria(),marca));
                            
                        }
                    }
                    
                    break;
                
                case 4:
                   //Encontrar y eliminar
                    System.out.println("Digite el Codigo del registro a Eliminar");
                    encontrar = teclado.next();
                    for (int i = 0; i < listaComputadores.size(); i++) {
                        if(listaComputadores.get(i).getCodigo().equals(encontrar)){
                            listaComputadores.remove(i);
                            System.out.println("Computador eliminado");
                    }
                    }
                    break;
                
                case 5:                         
                    for(Computador i: listaComputadores){
                        System.out.println(i.mostrarDatos());
                    }
                    break;
                
            }
        
        }
        System.out.println("Hasta pronto");
        
    }
    

}
