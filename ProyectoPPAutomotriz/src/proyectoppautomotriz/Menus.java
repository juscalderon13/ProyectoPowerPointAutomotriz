package proyectoppautomotriz;
import javax.swing.JOptionPane;

public class Menus {
    
  public static String menu2opciones(String titulo, String opcion1, String opcion2){
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
    
  public static String menu3opciones(String titulo, String opcion1, String opcion2, String opcion3){
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
  
  public static String menu4opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4){
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
  
  public static String menu5opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5){
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
  
  public static String menu6opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5, String opcion6){
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
            + "\n[5] - " + opcion6);
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
  
  public static String menu7opciones(String titulo, String opcion1, String opcion2, String opcion3, String opcion4, String opcion5, String opcion6, String opcion7){
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
