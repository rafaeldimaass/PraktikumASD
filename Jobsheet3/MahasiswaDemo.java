package Jobsheet3;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa arrayOfMahasiswa[] = new Mahasiswa[3];
        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "254107020051";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB 1E";
        arrayOfMahasiswa[0].ipk = (float)3.75;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "234567890111";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "SIB 1C";
        arrayOfMahasiswa[1].ipk = (float)3.36;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "123456789101";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI 1E";
        arrayOfMahasiswa[2].ipk = (float)3.80;

        System.out.println("NIM: " + arrayOfMahasiswa[0].nim);
        System.out.println("NAMA: " + arrayOfMahasiswa[0].nama);
        System.out.println("KELAS: " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[0].ipk); 
        System.out.println("---------------------------------------");
        System.out.println("NIM: " + arrayOfMahasiswa[1].nim);
        System.out.println("NAMA: " + arrayOfMahasiswa[1].nama);
        System.out.println("KELAS: " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[1].ipk); 
        System.out.println("-----------------------------------------");
        System.out.println("NIM: " + arrayOfMahasiswa[2].nim);
        System.out.println("NAMA: " + arrayOfMahasiswa[2].nama);
        System.out.println("KELAS: " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK: " + arrayOfMahasiswa[2].ipk); 
    }
    
    
}
