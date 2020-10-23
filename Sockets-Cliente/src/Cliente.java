
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;


class  SocketEnviar {
    SocketEnviar(String mensaje){
        try {
            Socket misocket = new Socket("192.168.56.1",9999);
            DataOutputStream flujo_salida=new DataOutputStream(misocket.getOutputStream());
            flujo_salida.writeUTF(mensaje);
            flujo_salida.close();
            misocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}


public class Cliente {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hola desde Cliente");
        SocketEnviar envio = new SocketEnviar("Hola se tu secreto jajaj");

    }
}

