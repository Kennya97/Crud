//KENNYA CLARISSA CASTRO GARCIA 
//N° DE CARNET 184519
//SISTEMA  21 "A"

package recurso_humano;

import java.sql.SQLException;
import java.util.Scanner;

public class Create {

Create() throws SQLException {

Scanner leer= new Scanner(System.in);
Persona person = new Persona();

System.out.println("<<  CREAR REGISTRO >>");

System.out.println("Nombre:  ");
person.setNombre_persona(leer.nextLine());//ASIGNA LOS NOMBRES QUE REGISTREMOS

System.out.println("Correo Electrónico:  ");
person.setEmail_persona(leer.nextLine());

System.out.println("Teléfono : ");
person.setTel_persona(leer.nextLine());

String tabla = "tb_contacto";
String campos_tabla = "nom_contacto , email_contacto , tel_contacto";

String valores_campos= " ' "+ person.getNombre_persona() + "  ' , '   "+ person.getEmail_persona() +"  ' , '   "+
person.getTel_persona()+" ' ";//ESTA LINEA ES CONTINUA  A LA ANTERIOR 

//INSTANCIA U OBJETO DE LA CLASE CONEXION CRUD 
Conexion_CRUD utilerias  = new Conexion_CRUD();

//SE ENVIAN LOS  PARAMETROS  NECESARIOS PARA GUARDAR EL REGISTRO AL METODO GUARDAR_REGISTRO
utilerias.guardar_registros(tabla, campos_tabla, valores_campos);

Menu_Principal.desplegar_Menu(); //LLAMA EL METODO DEL MENU PRINCIPAL
}
}
