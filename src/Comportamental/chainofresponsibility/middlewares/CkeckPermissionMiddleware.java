package Comportamental.chainofresponsibility.middlewares;

public class CkeckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@hcode.com.br")) {
            System.out.println("Bem vindo Administrador");
            return true;
        }
        System.out.println("Bem Vindo");
        return checkNext(email, password);
    }
}
