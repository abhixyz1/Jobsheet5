import java.util.Scanner;

class PemilihanPercobaan2  {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.println("Nilai UAS : ");
        float UAS = input20.nextFloat();
        System.out.println("Nilai UTS : ");
        float UTS = input20.nextFloat();
        System.out.println("Nilai Kuis : ");
        float Kuis = input20.nextFloat();
        System.out.println("Nilai Tugas : ");
        float Tugas = input20.nextFloat();

        float total = (UAS * 0.4F) + (UTS * 0.3F) + (Kuis * 0.1F) + (Tugas * 0.2F);

        String message = total < 65 ? "Remidi"  : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message );
    }
}