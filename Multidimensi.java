/*9.Tulis program sederhana menggunakan array multidimensi 
selain yang ada di materi*/

import java.util.Scanner;

class Multidimensi{
	
	public static void main(String[] args){
		
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int hasil[][] = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.print("Matriks a\n");
		for (int baris = 0;  baris < 3;  baris++) {
			for (int kolom = 0;  kolom < 3;  kolom++) {
				System.out.print("Nilai [" +baris +"][" +kolom +"] : ");
				a[baris][kolom] = input.nextInt();
			}
		}
		System.out.print("\n");
		System.out.print("Matriks b\n");
		for (int baris = 0;  baris < 3;  baris++) {
			for (int kolom = 0;  kolom < 3;  kolom++) {
				System.out.print("Nilai [" +baris +"][" +kolom +"] : ");
				b[baris][kolom] = input.nextInt();
			}
		}
		
		for (int baris=0;  baris<3;  baris++) {
			for (int kolom = 0;  kolom<3;  kolom++) {
			hasil[baris][kolom] = a[baris][kolom] + b[baris][kolom];
			}
		}
		System.out.print("\n");
		System.out.print("Hasil Penjumlahan materik a dan b:\n");
		for (int baris=0;  baris<3;  baris++) {
			for (int kolom = 0;  kolom<3;  kolom++) {
			System.out.print(hasil[baris][kolom] + " ");
			} System.out.print("\n");
		}
	}
}

/*
output:
Matriks a
Nilai [0][0] : 1
Nilai [0][1] : 2
Nilai [0][2] : 3
Nilai [1][0] : 1
Nilai [1][1] : 2
Nilai [1][2] : 3
Nilai [2][0] : 1
Nilai [2][1] : 4
Nilai [2][2] : 5

Matriks b
Nilai [0][0] : 5
Nilai [0][1] : 6
Nilai [0][2] : 4
Nilai [1][0] : 3
Nilai [1][1] : 1
Nilai [1][2] : 22
Nilai [2][0] : 1
Nilai [2][1] : 2
Nilai [2][2] : 3

Hasil Penjumlahan materik a dan b:
6 8 7
4 3 25
2 6 8
*/