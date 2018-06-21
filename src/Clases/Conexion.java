package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/inventarioautomoviles", "root", "wild24174485***");
        } catch (ClassNotFoundException | SQLException error) {
            JOptionPane.showMessageDialog(null, "Error al Conectarse" + "\n" + error, "Mensaje Error", JOptionPane.ERROR_MESSAGE);
        }

        return conectar;
    }
}
