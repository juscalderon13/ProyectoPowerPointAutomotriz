package proyectoppautomotriz;

import java.io.BufferedReader;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Productos {
    
    public void VerServicios(){
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena,nombre = "", tipo = "", precio = "";
        int registros = 1;
        archivo = new File("Servicios.txt");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            cadena = "";
            while(cadena != null){
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    tipo = cadena;
                    cadena = almacenamiento.readLine();
                    precio = cadena;
             
                    if(cadena != null){
                    
                    JOptionPane.showMessageDialog(null,
                            "Nombre: " + nombre +"\nClasificacion: " + tipo + "\nPrecio: ₡" + precio,
                            "Servicio #" +registros,1);
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
    
    public void AgregarServicio(){
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes datos para registrar \nun nuevo servicio", "Registro de Servicios",3);
        String nombre = JOptionPane.showInputDialog(null, "Nombre del Servicio: ", "Registro de Servicios",3);
        String tipo = JOptionPane.showInputDialog(null, "Tipo de servicio: ", "Registro de Servicios",3);
        String precio = JOptionPane.showInputDialog(null, "Precio: ", "Registro de Servicios",3);
        
        File archivo; // Para manipular archivo
        FileWriter escribir; // Para escribir en el archivo
        PrintWriter linea; //Para escribir en el archivo
        archivo = new File("Servicios.txt");// Preparando al archivo
        if(!archivo.exists()){
            
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //Escribimos en el archivo
                linea.println(nombre);
                linea.println(tipo);
                linea.println(precio);
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
                linea.println(tipo);
                linea.println(precio);
                linea.close();
                escribir.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                
    }
}
