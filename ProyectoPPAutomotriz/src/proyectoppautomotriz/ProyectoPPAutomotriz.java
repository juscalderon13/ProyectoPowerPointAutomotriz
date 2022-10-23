package proyectoppautomotriz;
//Importacion de librerias
import javax.swing.JOptionPane;

//Clase Principal donde esta nuestro metodo main()
public class ProyectoPPAutomotriz {
    public static void main(String[] args) {
        
        Productos producto = new Productos();
        Menus menu = new Menus();
        User usuario = new User();
        Empleados empleado = new Empleados();
        Clientes cliente = new Clientes();
        
     String acceso = usuario.login();
     
        //Aplicacion para Usuario normal se activara en caso de 
        //que el acceso nos retorne un "1" que es para usuario tipo 1(normal)
        if (acceso == "1") {
            //mantenemos el menu abierto hasta que deseemos cerrar la aplicacion
            while(acceso == "1"){
                //aplicamos el metodo menu3opciones para incorporar nuestro menu
                // y guardamos su retorno en variable seleccion.
                String seleccion = menu.menu3opciones("                      MENU PRINCIPAL", "Gestion de clientes","Ventas y facturacion","Cerrar Sesion");
                //utilizamos un switch para los casos posibles que retorne seleccion
                switch(seleccion){
                    //entrada al gestor de clientes seria la opcion 1
                    case "1" -> {
                        //creamos un boolean para mantener activo el gestor de 
                        //clientes el tiempo que deseamos
                        boolean modClientes = true;
                        //utilizamos un do while para mantener el menu de
                        // clientes el tiempo deseado
                        do{
                            //creamos un menu de seleccion
                            String selecModClientes = menu.menu4opciones("               GESTION DE CLIENTES", "Ver lista de clientes", "Actualizar cliente", "Agregar nuevo cliente", "Volver al menu principal");
                            //en este switch agregaremos las diferentes funciones de este modulo
                            switch(selecModClientes){
                                case "1" -> cliente.VerClientes();
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar cliente");
                                case "3" -> cliente.CrearCliente();
                                case "4" -> modClientes = false;
                                
                                    }    
                        }while(modClientes == true);
                    }
                    //Entrada al modulo de Ventas y Facturacion
                    case "2" ->{
                        boolean modVentas = true;
                        do{
                        String selecModVentas = menu.menu5opciones("            VENTAS Y FACTURACION", "Facturar Compra", "Ventas registradas", "Modificar registro", "Eliminar factura", "Volver al menu principal");
                        switch(selecModVentas){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de facturar compra");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ventas registradas");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar registro");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar factura");
                                case "5" -> modVentas = false;
                            }
                        }while(modVentas == true);
                    }
                    //Entrada al modulo de cerrar sesion
                    case "3" ->{
                        boolean modSalir = true;
                        do{
                        String selecModSalir = menu.menu2opciones("                      CERRAR SESION", "Volver al menu principal" ,"Cerrar Sesion");
                        switch(selecModSalir){
                            case "1" -> modSalir = false;
                            //en caso de cerrar sesion, acceso es igual a "0 para convertir el while en false"
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
                String seleccion = menu.menu6opciones("    MENU PRINCIPAL ADMINISTRADOR", "Empleados","Clientes", "Proveedores", "Productos","Ventas y facturacion","Cerrar Sesion");
                switch(seleccion){
                    //Entrada a la gestion de empleados
                    case "1" -> {
                        boolean modEmpleados = true;
                        do{
                            String selecModEmpleados = menu.menu5opciones("              GESTION DE EMPLEADOS", "Lista de empleados", "Actualizar empleado", "Registrar empleado", "Eliminar empleado", "Volver al menu principal");
                            switch(selecModEmpleados){
                                case "1" -> empleado.verEmpleados();
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar empleados");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de registrar empleados");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar empleados");
                                case "5" -> modEmpleados = false;
                            }
                        }while(modEmpleados == true);
                    }
                    //Entrada al gestor de Clientes
                    case "2" -> {
                        boolean modClientes = true;
                        do{
                            String selecModClientes = menu.menu4opciones("               GESTION DE CLIENTES", "Ver lista de clientes", "Actualizar cliente", "Agregar nuevo cliente", "Volver al menu principal");
                            switch(selecModClientes){
                                case "1" -> cliente.VerClientes();
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de actualizar cliente");
                                case "3" -> cliente.CrearCliente();
                                case "4" -> modClientes = false;
                                
                                    }
                        }while(modClientes == true);
                    }
                    //Entrada al gestor de Proveedores
                    case "3" -> {
                        boolean modProveedores = true;
                        do{
                            String selecModProveedores = menu.menu5opciones("           GESTION DE PROVEEDORES", "Lista de proveedores", "Actualizar proveedor", "Registrar proveedor", "Eliminar proveedor", "Volver al menu principal");
                            switch(selecModProveedores){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de Proveedores");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar informacion de Proveedores");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de registrar Proveedores");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar Proveedores");
                                case "5" -> modProveedores = false;
                            }
                        }while(modProveedores == true);
                    }
                    //Entrada al gestor de Productos
                     case "4" -> {
                        boolean modProductos = true;
                        do{
                            String selecModProductos = menu.menu7opciones("               GESTION DE PRODUCTOS", "Ver inventario", "Ver servicios", "Agregar Producto", "Agregar servicio", "Eliminar Producto", "Eliminar servicio", "Volver al menu principal");
                            switch(selecModProductos){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ver lista de Productos");
                                case "2" -> producto.VerServicios();
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de agregar Producto");
                                case "4" -> producto.AgregarServicio();
                                case "5" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar Producto");
                                case "6" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar Servicio");
                                case "7" -> modProductos = false;
                            }
                        }while(modProductos == true);
                    }
                    //Entrada al gestor de Ventas
                    case "5" ->{
                        boolean modVentas = true;
                        do{
                        String selecModVentas = menu.menu5opciones("            VENTAS Y FACTURACION", "Facturar Compra", "Ventas registradas", "Modificar registro", "Eliminar factura", "Volver al menu principal");
                        switch(selecModVentas){
                                case "1" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de facturar compra");
                                case "2" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de ventas registradas");
                                case "3" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de modificar registro");
                                case "4" -> JOptionPane.showMessageDialog(null,"Aqui ira el proceso de eliminar factura");
                                case "5" -> modVentas = false;
                            }
                        }while(modVentas == true);
                    }
                    //Entrada al modulo de Cerrar sesion
                    case "6" ->{
                        boolean modSalir = true;
                        do{
                        String selecModSalir = menu.menu2opciones("                      CERRAR SESION", "Volver al menu principal" ,"Cerrar Sesion");
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
