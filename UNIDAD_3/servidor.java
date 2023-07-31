package chat;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;

public class servidor extends Observable implements Runnable {

    private int puerto;

    public servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream entrada;

        try {

            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            while (true) {

                socket = servidor.accept();
                System.out.println("Cliente conectado");
                entrada = new DataInputStream(socket.getInputStream());

                String mensaje = entrada.readUTF();
                System.out.println(mensaje);

                this.setChanged();
                this.notifyObservers(mensaje);
                this.clearChanged();

                socket.close();
                System.out.println("Cliente desconectado");
            }
        } catch (IOException error) {
            System.out.println(error);
        }
    }
}
