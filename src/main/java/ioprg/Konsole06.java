import java.io.Console;
import java.util.Arrays;

public class Konsole06 {

  public static void main(String[] args) {
    Console console = System.console();
    String username = console.readLine("Kullanýcý adý : ");
    char[] password = console.readPassword("Password: ");

    if (username.equals("admin") && String.valueOf(password).equals("secret")) {
      console.printf(" Java uygulamalarýna hoþ geldiniz  %1$s.\n", username);

      Arrays.fill(password, ' ');
    } else {
      console.printf("Geçersiz kullanýcý ya da password.\n");
    }
  }
}
