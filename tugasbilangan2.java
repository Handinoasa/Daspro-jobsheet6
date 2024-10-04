import java.util.Scanner;

public class tugasbilangan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        float diskon = 0, totalDiskon;

        System.out.print("Masukkan jenis Buku (kamus/novel/lainnya): ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku yang dibeli: ");
        jumlahBuku = sc.nextInt();

        switch (jenisBuku.toLowerCase()) {
            case "kamus":
                diskon = 10;
                if (jumlahBuku > 2) {
                    diskon += 2;
                }
                break;
            case "novel":
                diskon = 7;
                if (jumlahBuku > 3) {
                    diskon += 2;
                } else {
                    diskon += 1;
                }
                break;
            default:
                if (jumlahBuku > 3) {
                    diskon = 5;
                }
                break;
        }

        totalDiskon = diskon; // Assuming this is the percentage
        System.out.println("Diskon yang didapat: " + totalDiskon + "%");
        
        sc.close(); // Close the scanner
    }
}