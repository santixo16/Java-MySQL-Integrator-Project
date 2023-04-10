package aplicacionpi;
//probando
public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bienvenid@");
      
        ConnectionDB conexion = new ConnectionDB("techcare");

        conexion.conectar();
        conexion.desconectar();

    }
}
 