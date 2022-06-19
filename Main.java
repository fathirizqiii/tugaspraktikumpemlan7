package Tugas7Pemlan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<>();

        pegawai.add(new PegawaiTetap("Bayu", "3174836573928477", 200000));
        pegawai.add(new PegawaiHarian("Edo", "3176384638468399", 8500, 40));
        pegawai.add(new Sales("Tika", "3174638573927588", 50, 50000));

        pegawai.add(new PegawaiTetap("Bryan", "3187493756478399", 3000000));
        pegawai.add(new PegawaiHarian("James", "3178397483947588", 9000, 45));
        pegawai.add(new Sales("Julia", "3173839576448903", 55, 55000));

        pegawai.add(new PegawaiTetap("Brown", "3189446385774188", 4000000));
        pegawai.add(new PegawaiHarian("Cony", "3173859375638395", 9500, 50));
        pegawai.add(new Sales("Sally", "3173944738558365", 60, 60000));
        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
