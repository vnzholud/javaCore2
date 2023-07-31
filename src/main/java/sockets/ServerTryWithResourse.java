package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTryWithResourse {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8189)) {
            System.out.println("Сервер запущен!");

            try (Socket socket = server.accept()) {
                System.out.println("Клиент подключился ");

                try(Scanner in = new Scanner(socket.getInputStream());
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true)){

                    while (true) {
                        String str = in.nextLine();

                        if (str.equals("/end")) {
                            System.out.println("Клиент отключился");
                            break;
                        }

                        System.out.println("Клиент: " + str);
                        out.println("echo: " + str);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
