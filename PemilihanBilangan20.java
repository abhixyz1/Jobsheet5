import java.util.Scanner;

class PemilihanBilagan20{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Sebuah Angka");
        int angka = sc.nextInt();
        String result = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " termasuk bilangan " + result);

    }
}