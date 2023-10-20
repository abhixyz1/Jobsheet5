import java.util.Scanner;

public class latihan_individu_1 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        
        int pilih = 0;
        String senjata = null;

        System.out.println("---- Tutorial game FPS ----");
        System.out.println("----- Pilih Senjata : -----\n\n1.Meele Weapon\n2.Ranged Weapon\n");
        pilih = sc.nextInt();

        switch (pilih) {
            case 1 :
            System.out.println("Melee Weapon adalah senjata yang digunakan untuk close combat atau pertarungan jarak dekat\ndengan jarak < 5 meter");
            break;

            case 2 :
            System.out.println("Range Weapon adalah senjata yang digunakan untuk pertarungan jarak jauh\ndengan jarak > 5 meter");
            break;

            default :
            System.out.println("Tidak Tersedia");

        

        }

    
    }
    
}
