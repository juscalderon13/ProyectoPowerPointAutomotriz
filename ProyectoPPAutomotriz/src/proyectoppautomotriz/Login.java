package proyectoppautomotriz;

import javax.swing.JOptionPane;

public class Login {
    public static String login(){
        String user = "user";
        String password = "1234";
        String admin = "admin";
        String admiPassword = "12345";
        String typeUser = "0";
        String inputUsuario;
        String inputContra;
        do{
            inputUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:"); 
            inputContra = JOptionPane.showInputDialog("Ingrese su contraseña:");
            if (user.equals(inputUsuario) && password.equals(inputContra)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso \n      Bienvenido " + user);
                typeUser = "1";
            }else if (admin.equals(inputUsuario) && admiPassword.equals(inputContra)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso \n      Bienvenido " + admin);
                typeUser = "2";
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas"
                        + "\n     Por favor intente otra vez");
            }
        }while (typeUser == "0");    
        
    return typeUser;
    }
}
