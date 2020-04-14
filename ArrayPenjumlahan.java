/*no. 5
#masalah diketahui
#input nilai melalui keyboard
#batas awal(i) bertipe integer
#batas akhir(n) bertipe integer
#hasil penjumlahan disimpan dalam variabel jumlah bertipe integer
ilustrasi output yang diharapkan
#jumlah bilangan : 5
#2 3 10 7 3
#hasil penjumlahan : 25*/

import java.util.Scanner;

class ArrayPenjumlahan{

	public static void main(String[] args){
		Scanner inputbatas = new Scanner(System.in);
		Scanner inputdata = new Scanner(System.in);
		
		int sum=0;
		
		System.out.print("Jumlah bilangan : ");
		int n=inputbatas.nextInt();
		
		for(int i=0; i<n; i++){
			int data[]=new int[n];
			//System.out.print("Input nilai : ");
			data[i] = inputdata.nextInt(); 
			sum+=data[i];
		}
		System.out.print("Hasil penjumlahan : " +sum);
	}
}

/*
output:
Jumlah bilangan : 5
2 3 10 7 3
Hasil penjumlahan : 25
*/