package sql;

import conexion.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class guarda_mysql {
     conexion instanciaMySQL = conexion.getInstance();

    
    public void guardaConversacion_cliente(String mensaje) {
         PreparedStatement consulta = null;
        Connection conexion = null;
        
        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacion_cliente) values(?)");

            consulta.setString(1, mensaje);
            
            
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

  
    public void guardaConversacion_servidor(String mensaje) {
         PreparedStatement consulta = null;
        Connection conexion = null;

        try {
            conexion = instanciaMySQL.conectar();
            consulta = conexion.prepareStatement("insert into conversaciones(conversacion_servidor) values(?)");

            consulta.setString(1, mensaje);
             
            consulta.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    }
    

