public class Main {
    public static void main(String[] args) {
        Boolean res = LoginService.checkLoginFields("login111111111111111111111", "pass", "pass");
        System.out.println("Результат проверки вводных данных = " + res);
    }
}