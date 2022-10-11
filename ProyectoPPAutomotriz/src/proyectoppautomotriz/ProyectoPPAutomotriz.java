package proyectoppautomotriz;
import static proyectoppautomotriz.Login.login;
import static proyectoppautomotriz.Menus.menu3opciones;

public class ProyectoPPAutomotriz {
    public static void main(String[] args) {
     String acceso = login();
        //Aplicacion para Usuario normal
        if (acceso == "1") {
            while(acceso == "1"){
                String seleccion = menu3opciones("                  MENU PRINCIPAL", "Gestion de clientes","Ventas y facturas","Cerrar Sesion");
                switch(seleccion){
                    case "1":
                        System.out.println("Usted entro al gestor de clientes");
                        break;
                    case "2":
                        System.out.println("Usted entro al modulo de ventas y facturacion");
                        break;
                    case "3":
                        System.out.println("Usted entro al modulo de cerrar sesion");
                        break;
                    default:
                        System.out.println("Esta fallando el modulo de menu principal");
                        break;
                }
            }
        }
        
        //Aplicacion para Administrador
        else if(acceso == "2"){
            System.out.println("Entre como administrador");
        }
    }
}
