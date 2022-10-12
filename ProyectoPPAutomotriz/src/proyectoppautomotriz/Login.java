package proyectoppautomotriz;
//Importacion de libreria JOptionPane para utilizar ventanas emergentes
import javax.swing.JOptionPane;
//Creacion de 2 tipos de usuario para tener delegar funciones
// tipo 1 usuario normal(empleado)
// tipo 2 usuario administrador(dueño o administrador)
//Despues lo haremos multiusuario.
public class Login {
    public static String login(){
        //creacion de variables
        String user = "user";
        String password = "1234";
        String admin = "admin";
        String admiPassword = "12345";
        String typeUser = "0";
        String inputUsuario;
        String inputContra;
        
        //utlizamos un do while para solicitar al usuario su usario y 
        //contraseña hasta que sea correcto.
        do{
            //solicitud de usuario y contraseña al usuario
            inputUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:"); 
            inputContra = JOptionPane.showInputDialog("Ingrese su contraseña:");
            
            //verificacion de credenciales para ver si es usuario tipo 1(empleado)
            if (user.equals(inputUsuario) && password.equals(inputContra)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso \n      Bienvenido " + user);
                typeUser = "1";
            //verificacion de credenciales para ver si es usuario tipo 2(admin) 
            }else if (admin.equals(inputUsuario) && admiPassword.equals(inputContra)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso \n      Bienvenido " + admin);
                typeUser = "2";
            //En caso de que ambas credenciales sean incorrectas notificarle al usuario    
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas"
                        + "\n     Por favor intente otra vez");
            }
        //no cerraremos el bucle hasta que el usuario ingrese credenciales validas
        }while (typeUser == "0");    
    //nos retorna al metodo main el tipo de usuario que esta entrando al sistema    
    return typeUser;
    }
}
