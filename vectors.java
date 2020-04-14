import java.util.Vector;
 
public class vectors {
    public static void main(String[] args) {
        // membuat Objek 
        Vector<String> vec = new Vector<String>();
         
        //  Menambahkan value ke dalam Vector
        vec.add("Yudi");    //  Index 0
        vec.add("Dian");    //  Index 1
        vec.add("Puji");    //  Index 2
        vec.add("Lisa");    //  Index 3
        vec.add("Eko");     //  Index 4
        System.out.println("Vector : "+vec);
         
        //  hapus salah satu value dari Vector
		// menghapus vektor Eko
        vec.removeElement("Eko");
        System.out.println("Vector hapus(part1) : "+vec);
         
        //  hapus salah satu value dari Vector berdasarkan Posisi Index
        vec.removeElementAt(2);
        System.out.println("Vector hapus(part2) : "+vec);
         
        //  mengambil salah satu value dari Vector
        String temp = vec.get(0);
        System.out.println("Vector Index 0 : "+temp);
    }
}

/*
output:
Vector : [Yudi, Dian, Puji, Lisa, Eko]
Vector hapus(part1) : [Yudi, Dian, Puji, Lisa]
Vector hapus(part2) : [Yudi, Dian, Lisa]
Vector Index 0 : Yudi
*/