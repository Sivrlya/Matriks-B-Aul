import java.util.Scanner;

public class PRMatriks {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah baris: ");
    int baris = input.nextInt();
    System.out.print("Masukkan jumlah kolom: ");
    int Kolom = input.nextInt(); 

    int matriks[][] = new int[baris][Kolom]; 

    for (int i = 0; i < matriks.length; i++) {
        for (int j = 0; j < matriks[i].length; j++) {
            System.out.print("Masukkan nilai baris "+i+" kolom "+i+ " : ");
            matriks[i][j] = input.nextInt();
        }
    }

    for (int i = 0; i < matriks.length; i++) {
        for (int j = 0; j < matriks[i].length; j++) {
            System.out.print(matriks[i][j] + ", ");
        }
        System.out.println();
} 
    }
    
}
