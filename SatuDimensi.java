/*10. Tulis program sederhana menggunakan array satu dimensi 
selain yang ada di materi*/

import java.util.Scanner;
class SatuDimensi{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Scanner inputa = new Scanner(System.in);
		
		System.out.print("Jumlah nama siswa yang ingin dimasukkan : ");
		int batas=input.nextInt();
		
		
		for(int i=0; i<batas; i++){
			String nama[]=new String[batas];
			System.out.print("Nama Mahasiswa " +(i+1) +" : ");
			nama[i] = inputa.nextLine();
		}	//System.out.print("\n");
	}
}
/*
output:
Jumlah nama siswa yang ingin dimasukkan : 5
Nama Mahasiswa 1 : atry
Nama Mahasiswa 2 : rahma
Nama Mahasiswa 3 : vani
Nama Mahasiswa 4 : firda
Nama Mahasiswa 5 : fadhilah
*/