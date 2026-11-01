package Comportamental.chainofresponsibility;

import Comportamental.chainofresponsibility.middlewares.CheckUserMiddleware;
import Comportamental.chainofresponsibility.middlewares.CkeckPermissionMiddleware;
import Comportamental.chainofresponsibility.middlewares.Middleware;
import Comportamental.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainChainOfResponsibility {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();
        boolean done;

        do {
            System.out.println("Digite o E-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email, password);
        } while (!done);
    }

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "876ajsdhfk**&");
        server.registerUser("user@hcode.com.br", "12345678");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CkeckPermissionMiddleware());
        server.setMiddleware(middleware);
    }
}
