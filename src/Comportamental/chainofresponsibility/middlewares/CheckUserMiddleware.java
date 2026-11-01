package Comportamental.chainofresponsibility.middlewares;

import Comportamental.chainofresponsibility.server.Server;

public class CheckUserMiddleware extends Middleware {
    public Server server;

    public CheckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("E-mail inválido");
            return false;
        }

        if (!server.isValidPassword(email,password)) {
            System.out.println("E-mail ou Senha Inválidos");
            return false;
        }

        return checkNext(email, password);
    }
}
