import java.util.Scanner;

public class TugasJobsheet11_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];

        System.out.println("Input nilai survei (skala 1-5):");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < survei[i].length; j++) {
                do {
                    System.out.print("  Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    survei[i][j] = sc.nextInt();
                    if (survei[i][j] < 1 || survei[i][j] > 5) {
                        System.out.println("  Nilai harus antara 1 - 5!");
                    }
                } while (survei[i][j] < 1 || survei[i][j] > 5);
            }
            System.out.println();
        }

        System.out.println("\nRata-rata responden:");
        for (int i = 0; i < survei.length; i++) {
            double total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            double rata = total / survei[i].length;
            System.out.printf("Responden ke-%d: %.2f\n", (i + 1), rata);
        }

        System.out.println("\nRata-rata pertanyaan:");
        for (int j = 0; j < survei[0].length; j++) {
            double total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            double rata = total / survei.length;
            System.out.printf("Pertanyaan ke-%d: %.2f\n", (j + 1), rata);
        }

        double totalKeseluruhan = 0;
        int jumlahData = survei.length * survei[0].length;
        for (int i = 0; i < survei.length; i++) {
            for (int j = 0; j < survei[i].length; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan / jumlahData;
        System.out.println("\nRata-rata keseluruhan: " + rataKeseluruhan);
    }
}
