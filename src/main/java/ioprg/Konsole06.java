import java.io.Console;
import java.util.Arrays;

public class Konsole06 {

  public static void main(String[] args) {
    Console console = System.console();
    String username = console.readLine("Kullan�c� ad� : ");
    char[] password = console.readPassword("Password: ");

    if (username.equals("admin") && String.valueOf(password).equals("secret")) {
      console.printf(" Java uygulamalar�na ho� geldiniz  %1$s.\n", username);

      Arrays.fill(password, ' ');
    } else {
      console.printf("Ge�ersiz kullan�c� ya da password.\n");
    }
  }
}
