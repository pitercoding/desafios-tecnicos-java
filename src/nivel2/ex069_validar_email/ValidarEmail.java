package nivel2.ex069_validar_email;

public class ValidarEmail {

    public static void main(String[] args) {

        String email = "teste@gmail.com";

        if (emailValido(email)) {
            System.out.println("E-mail válido!");
        } else {
            System.out.println("E-mail inválido!");
        }
    }

    public static boolean emailValido(String email) {

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return email.matches(regex);
    }
}