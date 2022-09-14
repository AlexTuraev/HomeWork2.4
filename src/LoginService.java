public class LoginService {
    public static Boolean checkLoginFields(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Длина login больше 20 символов");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("password и confirmPasword не совпадают");
            }

            if (!(login.matches("^[a-zA-Z0-9_]+$") && password.matches("^[a-zA-Z0-9_]+$"))) {
                System.out.println("login или password содержит др символы, кроме лат. алфавита, цифр и знака подчеркивания");
                return false; // login или password содержит др символы, кроме лат. алфавита, цифр и знака подчеркивания
            } else if (password.length() >= 20) {
                System.out.println("password должен быть строго меньше 20 символов");
                return false;
            } else {
                return true;
            }
        } catch (WrongLoginException e) {
            System.out.println("e = " + e);
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("e = " + e);
            return false;
        }
    }
}
