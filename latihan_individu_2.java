import java.util.Scanner;

public class latihan_individu_2 {
    public static void main(String[] args) {
        // 
        String Username = "abhixyz1";
        String Password = "polinema123";

        // 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // 
        if (inputUsername.equals(Username) && inputPassword.equals(Password)) {
            System.out.println("Selamat datang, " + inputUsername + "!");
        } else {
            System.out.println("Username dan password salah.");
        }

        //
    }
}

    

