package proyectoppautomotriz;
import javax.swing.JOptionPane;
import static proyectoppautomotriz.Login.login;
import static proyectoppautomotriz.Menus.menu3opciones;
import static proyectoppautomotriz.Menus.menu4opciones;
import static proyectoppautomotriz.Menus.menu5opciones;
import static proyectoppautomotriz.Menus.menu2opciones;
import static proyectoppautomotriz.Menus.menu6opciones;

public class ProyectoPPAutomotriz {
    public static void main(String[] args) {
     String acceso = login();
        //Aplicacion para Usuario normal
        if (acceso == "1") {
            while(acceso == "1"){
                String seleccion = menu3opciones("                      MENU PRINCIPAL", "Gestion de clientes","Ventas y facturacion","Cerrar Sesion");
                switch(seleccion){
                    case "1" -> {
                        boolean modClientes = true;
                        do{
                            String selecModClientes = menu4opciones("               GESTION DE CLIENTES", "Ver lista de clientes", "Actualizar cliente", "Agregar nuevo cliente", "Volver al menu principal");
                            switch(selecModClientes){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de clientes");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar cliente");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de agregar nuevo cliente");
                                case "4" -> modClientes = false;
                                
                                    }
                        }while(modClientes == true);
                    }
                    case "2" ->{
                        boolean modVentas = true;
                        do{
                        String selecModVentas = menu5opciones("            VENTAS Y FACTURACION", "Facturar Compra", "Ventas registradas", "Modificar registro", "Eliminar factura", "Volver al menu principal");
                        switch(selecModVentas){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de facturar compra");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ventas registradas");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar registro");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar factura");
                                case "5" -> modVentas = false;
                            }
                        }while(modVentas == true);
                    }
                    case "3" ->{
                        boolean modSalir = true;
                        do{
                        String selecModSalir = menu2opciones("                      CERRAR SESION", "Volver al menu principal" ,"Cerrar Sesion");
                        switch(selecModSalir){
                            case "1" -> modSalir = false;
                            case "2" -> {acceso = "0";
                                         modSalir = false;}
                        }
                        }while(modSalir == true);    
                    }
                    default -> System.out.println("Esta fallando el modulo de menu principal");
                }
            }
        }
        
        //Aplicacion para Administrador en caso de logueo tipo 2
        else if(acceso == "2"){
            while(acceso == "2"){
                String seleccion = menu6opciones("    MENU PRINCIPAL ADMINISTRADOR", "Empleados","Clientes", "Proveedores", "Productos","Ventas y facturacion","Cerrar Sesion");
                switch(seleccion){
                    case "1" -> {
                        boolean modEmpleados = true;
                        do{
                            String selecModEmpleados = menu5opciones("              GESTION DE EMPLEADOS", "Lista de empleados", "Actualizar empleado", "Registrar empleado", "Eliminar empleado", "Volver al menu principal");
                            switch(selecModEmpleados){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de empleados");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar empleados");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de registrar empleados");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar empleados");
                                case "5" -> modEmpleados = false;
                            }
                        }while(modEmpleados == true);
                    }
                    case "2" -> {
                        boolean modClientes = true;
                        do{
                            String selecModClientes = menu4opciones("               GESTION DE CLIENTES", "Ver lista de clientes", "Actualizar cliente", "Agregar nuevo cliente", "Volver al menu principal");
                            switch(selecModClientes){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de clientes");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar cliente");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de agregar nuevo cliente");
                                case "4" -> modClientes = false;
                                
                                    }
                        }while(modClientes == true);
                    }
                    case "3" -> {
                        boolean modProveedores = true;
                        do{
                            String selecModProveedores = menu5opciones("            GESTION DE PROVEEDORES", "Lista de proveedores", "Actualizar proveedor", "Registrar proveedor", "Eliminar proveedor", "Volver al menu principal");
                            switch(selecModProveedores){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de Proveedores");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar informacion de Proveedores");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de registrar Proveedores");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar Proveedores");
                                case "5" -> modProveedores = false;
                            }
                        }while(modProveedores == true);
                    }
                    case "5" ->{
                        boolean modVentas = true;
                        do{
                        String selecModVentas = menu5opciones("            VENTAS Y FACTURACION", "Facturar Compra", "Ventas registradas", "Modificar registro", "Eliminar factura", "Volver al menu principal");
                        switch(selecModVentas){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de facturar compra");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ventas registradas");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar registro");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar factura");
                                case "5" -> modVentas = false;
                            }
                        }while(modVentas == true);
                    }
                    case "6" ->{
                        boolean modSalir = true;
                        do{
                        String selecModSalir = menu2opciones("                      CERRAR SESION", "Volver al menu principal" ,"Cerrar Sesion");
                        switch(selecModSalir){
                            case "1" -> modSalir = false;
                            case "2" -> {acceso = "0";
                                         modSalir = false;}
                        }
                        }while(modSalir == true);    
                    }
                    default -> System.out.println("Esta fallando el modulo de menu principal");
                }
            }
        }
    }
}
