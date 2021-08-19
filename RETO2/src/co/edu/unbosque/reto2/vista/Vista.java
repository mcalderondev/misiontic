
package co.edu.unbosque.reto2.vista;
import java.util.*;

  public class Vista {

    /**
     * Atributo que permite la lectura por consola
     */
    private Scanner leer;

    /**
     * Método constructor que inicializa el atributo de lectura por consola
     */
    public Vista() {
        leer = new Scanner(System.in);
    }

    /**    
    protected String nombres;
    protected String apellidos;
    protected String fnacimiento;
    protected String cinstitucional;
    protected String cpersonal;
    protected long ncelular;
    protected long nfijo;
    protected String programa;
     * Método para leer un dato String
     *
     * @param mensaje Mensaje para mostrar por consola
     * @return Dato String leido
     */
    public String leerDatoNombresString(String mensaje) {
        System.out.println(mensaje);
        String nombres = leer.nextLine();
        return nombres;
    }
    
    public String leerDatoApellidosString(String mensaje) {
        System.out.println(mensaje);
        String apellidos = leer.nextLine();
        return apellidos;
    }
    
    public String leerDatoFnacimientoString(String mensaje) {
        System.out.println(mensaje);
        String fnacimiento = leer.nextLine();
        return fnacimiento;
    }
    
    public String leerDatoCinstitucionalString(String mensaje) {
        System.out.println(mensaje);
        String cinstitucional = leer.nextLine();
        return cinstitucional;
    }
    
       public String leerDatoCpersonalString(String mensaje) {
        System.out.println(mensaje);
        String cpersonal = leer.nextLine();
        return cpersonal;
    }
       
    public String leerDatoProgramaString(String mensaje) {
        System.out.println(mensaje);
        String programa = leer.nextLine();
        return programa;
    }
    /**
     * Leer dato de tipo long
     *
     * @param mensaje Mensaje para mostrar por consola
     * @return Datos long leido
     */
    public long leerDatoNcelular(String mensaje) {
        System.out.println(mensaje);
        long ncelular = leer.nextLong();
        leer.nextLine();
        return ncelular;
    }

    public long leerDatoNfijo(String mensaje) {
        System.out.println(mensaje);
        long nfijo = leer.nextLong();
        leer.nextLine();
        return nfijo;
    }
    
     public String leerDatoString(String mensaje){
        System.out.println(mensaje);
        String dato = leer.nextLine();
        return dato;
    }
     
    public long leerDatoLong(String mensaje){
        System.out.println(mensaje);
        long dato = leer.nextLong();
        leer.nextLine();
        return dato;
    }
        
    public double leerDatoDouble(String mensaje){
        System.out.println(mensaje);
        double dato = leer.nextDouble();
        leer.nextLine();
        return dato;
    }
        
    public int leerDatoEntero(String mensaje){
        int dato = 0;
        boolean salida = false;
        do{
            System.out.println(mensaje);
            try{
                dato = leer.nextInt();
                salida = true;
            }catch(InputMismatchException ex){
                System.out.println("Específica: Ingresó un dato no válido... :(");
                dato = 0;
            }finally{
                leer.nextLine();
            }
        }while(!salida);
        return dato;
    }
    

  }