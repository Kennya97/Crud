//KENNYA CLARISSA CASTRO GARCIA 
//N° DE CARNET 184519
//SISTEMA  21 "A"

package recurso_humano;

import java.sql.SQLException;

public class Read {
public Read () throws SQLException {

System.out.println(" << CONSULTA DE REGISTROS >> ");
mostrar_resultados(); //LLAMA EL METODO  DENTRO DE ESTA CLASE 
}    
private void mostrar_resultados() throws SQLException {
try{
Conexion_CRUD utilerias = new Conexion_CRUD();

String tabla = " tb_contacto ";

String campos_tabla = "*";

//CONDICION SE ENVIA VACIA PARA INDICAR QUE TODOS LOS REGISTROS SE NECESITAN MOSTRAR

String condicion_Busqueda = "";

//METODO QUE REALIZA LA BUSQUEDA 

utilerias.desplegar_registros(tabla, campos_tabla, condicion_Busqueda);

}catch (SQLException ex){
System.out.println("Ha ocurrido un error!!! Error "+ex.getMessage());
}finally{
Menu_Principal.desplegar_Menu();
}
}
}
