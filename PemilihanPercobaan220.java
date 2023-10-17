import java.util.Scanner;

class PemilihanPercobaan220  {
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

        if (total > 80)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan A ");
        else if (total > 73)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan B+");
        else if (total > 65)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan B");
        else if (total > 60)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan C+");
        else if (total > 50)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan C");
        else if (total > 39)
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan D");
        else
        System.out.println("Nilai akhir = " + total + " sehingga mendapatkan E");
    }
}