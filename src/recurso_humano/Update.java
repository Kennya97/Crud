//KENNYA CLARISSA CASTRO GARCIA 
//N° DE CARNET 184519
//SISTEMA 21 "A"

package recurso_humano;

import java.sql.SQLException;
import java.util.Scanner;

public class Update {

Update() throws SQLException {
    
Scanner  leer = new Scanner (System.in);
Persona person = new Persona ();
Conexion_CRUD utilerias = new Conexion_CRUD ();

System.out.println("<<ACTUALIZAR REGISTROS >>");

System.out.println("Ingresa id del registro a modificar: ");
person.setId_persona(leer.nextInt());

//REINGRESO DE DATOS PARA ACTUALIZAR 

String  tabla_buscar = "tb_contacto";

String campos_buscar= "id_contacto, nom_contacto, email_contacto, tel_contacto";

String  condicion_buscar = "id_contacto = "+person.getId_persona();
utilerias.desplegar_registros(tabla_buscar, campos_buscar, condicion_buscar);

System.out.println("Nombre: ");
person.setNombre_persona(leer.next());

System.out.println("Correo Electrónico: ");
person.setEmail_persona(leer.next());

System.out.println("Teléfono: ");
person.setTel_persona(leer.next());

String tabla = "tb_contacto";

String campos_valores_nuevos = "nom_contacto = ' "+ person.getNombre_persona() + "', email_contacto ='"+ person.getEmail_persona() +
"', tel_contacto = ' " +person.getTel_persona()+"'"; //CONTINUACION DE LA FILA ANTERIOR

utilerias .actualizar_eliminar_registro(tabla, campos_valores_nuevos, condicion_buscar);
System.out.println("Modificado Correctamente !!!!!!!!");

Menu_Principal.desplegar_Menu(); //LLAMA EL METODO DEL MENU PRINCIPAL
        
}
}

