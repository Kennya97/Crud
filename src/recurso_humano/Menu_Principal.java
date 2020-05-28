//KENNYA CLARISSA CASTRO GARCIA 
//N° DE CARNET 184519
//SISTEMA 21 "A"

package recurso_humano;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu_Principal {

//THRWS Especifica el tipo de excepcion que pude ocacionar 
public static void main(String[] args) throws SQLException{

desplegar_Menu();    
    
}
public static void desplegar_Menu() throws SQLException{
Scanner opcion_seleccionada = new Scanner (System.in);

String opcion_Menu;
//Metodo a desplegar;




System.out.println("*****************************************************************");
System.out.println("|                        CRUD DE JAVA EN CONSOLA                |");
System.out.println("*****************************************************************");


System.out.println("|   Opciones:                                                   |");
System.out.println("|                  1. Crear registros :                         |");
System.out.println("|                  2. Consultar registros                       |");
System.out.println("|                  3. Actualizar registros                      |");
System.out.println("|                  4. Eliminar registros                        |");
System.out.println("|                  5. Salir                                     |");
 
System.out.println("*****************************************************************");
System.out.println("Seleccionar opción: ");

opcion_Menu = opcion_seleccionada.next();

//DESPLIEGUE DE MENU  BASADO EN LAS OPCION SELECCIONADA

switch(opcion_Menu){

case"1":
Create  create = new Create ();
break;
    
case"2":
Read read = new Read ();
break;
    
case"3":
Update update  = new Update ();
break;

case"4":
Delete delete = new Delete ();
break;

case"5":
System.exit(0);
break;
    
default:

System.out.println("Selección  invalida ");
break;    
    
}

}


}























