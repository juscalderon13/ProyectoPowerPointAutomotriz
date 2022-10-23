package proyectoppautomotriz;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientes {
    
    public void VerClientes(){
        
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena,nombre = "", ID = "", email = "", telefono = "", residencia = "";
        int registros = 1;
        archivo = new File("Clientes.txt");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            cadena = "";
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    ID = cadena;
                    cadena = almacenamiento.readLine();
                    email = cadena;
                    cadena = almacenamiento.readLine();
                    telefono = cadena;
                    cadena = almacenamiento.readLine();
                    residencia = cadena;
                    if(cadena != null){
                    
                    JOptionPane.showMessageDialog(null,
                            "Nombre: " + nombre +"\nIdentificacion: " + ID + "\nEmail: " + email + "\nTelefono: " + telefono + "\nResidencia: " + residencia,
                            "Datos del Cliente #" +registros,1);
                    registros++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void CrearCliente(){
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes datos para registrar \nun nuevo Cliente", "Registro Nuevo Cliente",3);
        String nombre = JOptionPane.showInputDialog(null, "Nombre del Cliente: ", "Registro Nuevo Cliente",3);
        String ID = JOptionPane.showInputDialog(null, "Identificacion: ", "Registro Nuevo Cliente",3);
        String email = JOptionPane.showInputDialog(null, "Correo Electronico: ", "Registro Nuevo Cliente",3);
        String telefono = JOptionPane.showInputDialog(null, "Numero de Telefono: ", "Registro Nuevo Cliente",3);
        String residencia = JOptionPane.showInputDialog(null, "Residencia: ", "Registro Nuevo Cliente",3);
        
        //Esto lo tengo que aprender a hacer que funcione con este metodo...
        //String Datos = nombre + "," + ID + "," + email + "," + telefono + "," + residencia;
        File archivo; // Para manipular archivo
        FileWriter escribir; // Para escribir en el archivo
        PrintWriter linea; //Para escribir en el archivo
        archivo = new File("Clientes.txt");// Preparando al archivo
        if(!archivo.exists()){
            
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(ID);
                linea.println(email);
                linea.println(telefono);
                linea.println(residencia);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            
             try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(ID);
                linea.println(email);
                linea.println(telefono);
                linea.println(residencia);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
    
}
