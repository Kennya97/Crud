//KENNYA CLARISSA CASTRO GARCIA 
//N° DE CARNET 184519
//SISTEMA  21 "A"

package recurso_humano;

import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
Delete() throws SQLException{
   
Scanner  leer = new Scanner (System.in);
Conexion_CRUD utilerias = new Conexion_CRUD ();

System.out.println("<< ELIMINAR  REGISTRO >>");

System.out.println("Ingresar el  Id del registro: ");
String id_contacto_eliminar= leer.next();

//REINGRESO DE DATOS PARA ACTUALIZAR 

String tabla = "tb_contacto";
String campos = "*";
String condicion = "id_contacto  = "+id_contacto_eliminar;

utilerias.desplegar_registros(tabla, campos, condicion);

System.out.println("Presionar <<Y>> para confirmar");
String confirmar_borrar = leer.next();

if ("Y".equals(confirmar_borrar)){
/* sE LE DEJA VACIO PARA EL METODO ACTTUALIZAR  ELIMINAR REGISTRO
 ENVIE SOLAMENTE LOS PARAMETROS DE TABLA  Y   CONDICION Y PODER ELIMINAR */

String valores_campos_nuevos = "";

utilerias.actualizar_eliminar_registro(tabla, valores_campos_nuevos, condicion);
System.out.println("Registro borrado");        

}
Menu_Principal.desplegar_Menu();
}  
}
