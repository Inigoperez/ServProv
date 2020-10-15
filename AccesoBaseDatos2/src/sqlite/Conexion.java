package sqlite;

import java.sql.*;
import java.util.Scanner;

public class Conexion {

    private static int select = 0;
    private static Connection dbConnection = null;
    private static Statement stmt = null;

    public static void main(String[] args) throws SQLException {

        //funcion donde creara la tabla de empleados ---EJERCICIO 1---//
        //crear_tabla_empleados();
        //funcion donde creara un usuario ---EJERCICIO 2---//
        //crear_un_empleado();
        //funcion para ver datos de usuarios de un departamento ---EJERCICIO 3---//
        //select_empleados_dept();
        //funcion para cambiar el salario a empleados de un departamento ---EJERCICIO 4---//
        //cambiar_salario();
        }

    public static void abrirConexion(){

        try {
            dbConnection = DriverManager.getConnection("jdbc:sqlite:C:/SQLite/ejemplo.db");
            System.out.println("La conexión con la BBDD SQlite se ha establecido correctamente");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }

    }

    public static void cerrar_conexion( Connection con ) {
        try {
            if ( con != null )
                if ( !con.isClosed() )    // Si no está cerrada, la cierro
                    con.close();
        }
        catch (SQLException e) { e.printStackTrace();  }
    }

    public static void crear_tabla_empleados() throws SQLException {
        abrirConexion();
        stmt = dbConnection.createStatement ();
        String sql = "create table empleados(" +
                "emp_no TINYINT(2) NOT NULL PRIMARY KEY," +
                "apellido VARCHAR(10)," +
                "salario FLOAT(6,2)," +
                "dept_no TINYINT(2) NOT NULL REFERENCES departamentos(dept_no))";
        stmt.executeUpdate(sql);
        stmt.close ();
        cerrar_conexion(dbConnection);
    }

    public static void crear_un_empleado() throws SQLException {
        abrirConexion();
        stmt = dbConnection.createStatement ();
        String sql = "Insert into empleados (emp_no, apellido, salario, dept_no) VALUES (1, 'perez', 250.54 , 20);"; ;
        stmt.executeUpdate(sql);
        stmt.close ();
        cerrar_conexion(dbConnection);
    }

    public static void select_empleados_dept() throws SQLException {
        abrirConexion();
        stmt = dbConnection.createStatement ();
        String sql = "select empleados.apellido,empleados.salario,departamentos.dnombre from empleados inner join departamentos on empleados.dept_no = departamentos.dept_no where departamentos.dept_no=20"; ;
        ResultSet rs = stmt.executeQuery ( sql);
        while(rs.next ()) {
            String apellido = rs.getString ( "apellido");
            float salario = rs.getFloat ( "salario");
            String departamento = rs.getString ( "dnombre");
            System.out.println("---------------------------");
            System.out.println ( "Apellido = " + apellido);
            System.out.println ( "Salario = " + salario);
            System.out.println ( "Departamento = " + departamento);
        }
        rs.close ();
        stmt.close ();
        cerrar_conexion(dbConnection);
    }

    public static void cambiar_salario() throws SQLException {
        abrirConexion();
        stmt = dbConnection.createStatement();
        String sql = "UPDATE empleados SET salario=1100 WHERE dept_no=10";
        stmt.executeUpdate(sql);
        String sql_1 = "SELECT * FROM empleados";
        ResultSet rs = stmt.executeQuery(sql_1);
        while(rs.next ()) {
            String apellido = rs.getString ( "apellido");
            float salario = rs.getFloat ( "salario");
            String departamento = rs.getString ( "dept_no");
            System.out.println("---------------------------");
            System.out.println ( "Apellido = " + apellido);
            System.out.println ( "Salario = " + salario);
            System.out.println ( "Departamento = " + departamento);
        }
        rs.close ();
        stmt.close ();
        cerrar_conexion(dbConnection);
    }
}