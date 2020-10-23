import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class  SocketRecibir implements Runnable{
    SocketRecibir(){

    }
    public void iniciarEscuchar(){
        //Thread miHilo= new Thread(this);
        //miHilo.start();
        try {
            ServerSocket servidor = new ServerSocket(9999);
            Socket misocket= servidor.accept();
            DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());
            String mensaje_texto= flujo_entrada.readUTF();
            System.out.println(mensaje_texto);
            misocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void run() {
        try {
            ServerSocket servidor = new ServerSocket(9999);
            Socket misocket= servidor.accept();
            DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());
            String mensaje_texto= flujo_entrada.readUTF();
            System.out.println(mensaje_texto);
            misocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
public class Servidor  {
      Thread miHilo;
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hola desde Servidor");

        SocketRecibir hilito= new SocketRecibir();

        hilito.iniciarEscuchar();
        


    }


}
