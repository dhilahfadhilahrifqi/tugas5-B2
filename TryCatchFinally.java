/*1. TULISKAN SINTAX PENANGANAN KESALAHAN MENGGUNAKAN TRY,CATCH, 
DAN FINALLY BESERTA CONTOHNYA*/

import java.util.Scanner;

class TryCatchFinally{

	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		int a, c;
		System.out.print("Masukkan angka : ");
		a = obj.nextInt();
		
		 
		try{c=a/0;
			System.out.println("Tidak terdefinisi"); //kesalahan yg tampil saat di jalankan
		} catch(ArithmeticException e){ //exception yg di tangkap dari kesalahan
			System.out.println(e); //mengeluarkan exception
		}
		System.out.println("Akhir dari program.");
	}
}

/*
sintaks 1:
try { 
	<code to be monitored for exceptions> 
} catch (<ExceptionType1> <ObjName>) { 
	<handler if ExceptionType1 occurs> 
}
. . . 
} catch (<ExceptionTypeN> <ObjName>) { 
	<handler if ExceptionTypeN occurs> 
}

sintaks 2:
try { 
	<kode monitor exception> 
} catch (<ExceptionType1> <ObjName>) { 
	<penanganan jika ExceptionType1 terjadi> 
} 
. . . 
} finally { 
<kode yang akan dieksekusi saat blok try berakhir> 
}

output yang kular di atas:
Masukkan angka : 3
java.lang.ArithmeticException: / by zero
Akhir dari program.
*/