/*12.*/

import java.util.Scanner;
class Array{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		/*System.out.print("Masukan batas deret : ");
		int batas = input.nextInt();*/
		double hasil;
		int sum=0;
		int[] nilai; //deklarasi
		nilai = new int[5]; //inisialisasi
		System.out.print("Masukkan 4 nilai : ");
		for(int i=0; i<4; i++){
			nilai[i]=input.nextInt();
			sum+=nilai[i];
		}
		hasil=sum/4;
		System.out.print("Hasil Rata dari 4 nilai yang di masukkan : " +hasil);
	}
}

/*
output:
Masukkan 4 nilai : 12 14 16 18
Hasil Rata dari 4 nilai yang di masukkan : 15.0
*/