import java.util.Scanner;
public class Survei13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Input nilai untuk responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai untuk pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nRata-rata per responden:");
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += survey[i][j];
            }
            double rata2Respon = (double) sum / 6;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rata2Respon);
        }
        System.out.println("\nRata-rata per pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += survey[i][j];
            }
            double rata2Pertanyaan = (double) sum / 10;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + ": " + rata2Pertanyaan);
        }
        int total = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
                count++;
            }
        }
        double rata2Total = (double) total / count;
        System.out.println("\nRata-rata keseluruhan: " + rata2Total);
    }
}
