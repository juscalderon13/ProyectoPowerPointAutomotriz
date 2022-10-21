package proyectoppautomotriz;
import javax.swing.JOptionPane;
/* Creamos la clase menu para los tipos de menu que iba a necesitar nuestro sistema
 con menus de 2 hasta 7 opciones con titulo intercambiable.
 todos poseen el mismo formato solo cambia la cantidad de variables tipo String
 que solicita y nos retorna la decision que tomo el usuario en forma de String*/
public class Menus {
  // Menu de 2 opciones  
  public String menu2opciones(String titulo, String opcion1, String opcion2){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
    } 
    //Menu de 3 opciones
  public String menu3opciones(String titulo, String opcion1, String opcion2, String opcion3){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
    }
  //Menu de 4 opciones
  public String menu4opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3
            + "\n[4] - " + opcion4);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              case "4" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
    }
  //Menu de 5 opciones
  public String menu5opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3
            + "\n[4] - " + opcion4
            + "\n[5] - " + opcion5);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              case "4" -> salida = true;
              case "5" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
  }
  //Menu de 6 opciones
  public String menu6opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5, String opcion6){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3
            + "\n[4] - " + opcion4
            + "\n[5] - " + opcion5
            + "\n[6] - " + opcion6);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              case "4" -> salida = true;
              case "5" -> salida = true;
              case "6" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
  }
  //Menu de 7 opciones
  public String menu7opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5, String opcion6, String opcion7){
      boolean salida = false;
      String inputEleccion = "";
      do{
          inputEleccion = JOptionPane.showInputDialog(null,
              "-------------------------------------------------------"
            + "\n" + titulo
            + "\n-------------------------------------------------------"
            + "\nSeleccione el modulo al que desea ir"
            + "\n[1] - " + opcion1
            + "\n[2] - " + opcion2
            + "\n[3] - " + opcion3
            + "\n[4] - " + opcion4
            + "\n[5] - " + opcion5
            + "\n[5] - " + opcion6
            + "\n[5] - " + opcion7);
          switch(inputEleccion){
              case "1" -> salida = true;
              case "2" -> salida = true;
              case "3" -> salida = true;
              case "4" -> salida = true;
              case "5" -> salida = true;
              case "6" -> salida = true;
              case "7" -> salida = true;
              default -> salida = false;
          }
      }while(salida == false);
      return inputEleccion;
  }
  
}
