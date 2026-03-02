package Jobsheet3;

public class DataDosen23 {
    
    
    public void tampilkanSeluruhData(Dosen23[] arrayOfDosen) {
        int x = 1;
        for (Dosen23 d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (x++));
            System.out.println("Kode: " + d.kode);
            System.out.println("Nama: " + d.nama);
            System.out.println("Jenis Kelamin: " + (d.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia: " + d.usia);
            System.out.println("---------------------------");
        }
    }

    
    public void hitungGenderDosen(Dosen23[] arrayOfDosen) {
        int laki = 0, perempuan = 0;
        for (Dosen23 d : arrayOfDosen) {
            if (d.jenisKelamin) laki++;
            else perempuan++;
        }
        System.out.println("Jumlah Dosen Laki-Laki: " + laki);
        System.out.println("Jumlah Dosen Perempuan: " + perempuan);
    }

    
    public void rataRataUmurGender(Dosen23[] arrayOfDosen) {
        int jumLaki = 0, jumPerempuan = 0, totLaki = 0, totPerempuan = 0;
        for (Dosen23 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                jumLaki++;
                totLaki += d.usia;
            } else {
                jumPerempuan++;
                totPerempuan += d.usia;
            }
        }
        System.out.println("Rerata Usia Pria: " + (jumLaki == 0 ? 0 : (double) totLaki / jumLaki));
        System.out.println("Rerata Usia Wanita: " + (jumPerempuan == 0 ? 0 : (double) totPerempuan / jumPerempuan));
    }

    public void cariDosenSenior(Dosen23[] arrayOfDosen) {
        int max = 0;
        Dosen23 senior = null;
        for (Dosen23 d : arrayOfDosen) {
            if (d.usia > max) {
                max = d.usia;
                senior = d;
            }
        }
        if (senior != null) System.out.println("Dosen Paling Tua: " + senior.nama);
    }

    public void cariDosenTermuda(Dosen23[] arrayOfDosen) {
        int min = 100;
        Dosen23 muda = null;
        for (Dosen23 d : arrayOfDosen) {
            if (d.usia < min) {
                min = d.usia;
                muda = d;
            }
        }
        if (muda != null) System.out.println("Dosen Paling Muda: " + muda.nama);
    }
}