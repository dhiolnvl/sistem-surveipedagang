package projectk4;

import javax.swing.*;
import static projectk4.project4.*; //MEMANGGIL ARRAY DARI CLASS project4

public class INPUT { //baris ini adalah variabel keseluruhan kelas
                                            //DEKLARASI VARIABEL GLOBAL UNTUK KESELURUHAN PROGRAM CLASS
    static String na, al, np, jenis, mod, pj, pb, cb, ale, sm, hp, st, ks,
            ket, ket2, ket3, ket4, ket5, ket6, ket7, kett, nr, 
            ulang = "y", hasil = "", rekap = "", edit, dh, tempat, 
            tanggal, bulan, tahun;
    static int no = 0, nmo, x = -1, hr = 0, ed, nh, x1, x2, hal, 
            sisa, g, z, p = 0, s = 0, m = 0, bb = 0, spt = 0, bp = 0, e = 0, ll = 0,
            tgl, bln, thn, bnd = 0, bnc = 0, bnl = 0, jnd = 0, 
            jnl = 0, jns = 0, cnt = 0, cna = 0, tnmo = 0, rnmo = 0, fb = 0, 
            wa = 0, ig = 0, tele = 0, dll = 0, ak = 0, tk = 0, tme = 0, tmt = 0;
    static boolean salah = true, keluar = true, ruang = true;

    static void data() {                
        tempat = JOptionPane.showInputDialog("TEMPAT SURVEI");  //INPUTAN TEMPAT DAN TANGGAL

        do {
            try {
                do {
                    tanggal = JOptionPane.showInputDialog("TANGGAL"); 
                    tgl = Integer.parseInt(tanggal);
                } while (!(tgl > 0 && tgl <= 31)); //jika menginput kecuali 1-31 maka akan mengalami perulangan
                do {
                    bulan = JOptionPane.showInputDialog("BULAN");
                    bln = Integer.parseInt(bulan);
                } while (!(bln > 0 && bln <= 12));
                do {
                    tahun = JOptionPane.showInputDialog("TAHUN");
                    thn = Integer.parseInt(tahun);
                } while (!(thn > 0 && thn <= 2030));
                salah = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "TOLONG INPUT ANGKA");
                salah = true;
            }
        } while (salah);
       if (bln == 1) {          //IF UNTUK KETERANGAN BULAN
            kett = "JANUARI";   // jika input 1 maka akan keluar keterangan
        }
       if (bln == 2) {
            kett = "FEBRUARI";
        }
       if (bln == 3) {
            kett = "MARET";
        }
       if (bln == 4) {
            kett = "APRIL";
        }
       if (bln == 5) {
            kett = "MEI";
        }
       if (bln == 6) {
            kett = "JUNI";
        }
       if (bln == 7) {
            kett = "JULI";
        }
       if (bln == 8) {
            kett = "AGUSTUS";
        }
       if (bln == 9) {
            kett = "SEPTEMBER";
        }
       if (bln == 10) {
            kett = "OKTOBER";
        }
        if (bln == 11) {
            kett = "NOVEMBER";
        }
        if (bln == 12) {
            kett = "DESEMBER";
        }

    }

    static void input() {

        do {
            if (x == 20) {      //JIKA DATA 20
                JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
            } else {            //JIKA DATA KURANG DARI 20
                do {
                    x = x + 1; //ini adalah rumus array
                    no = no + 1; // karena array mulai dari 0
                    na = JOptionPane.showInputDialog("NAMA TOKO"); //INPUT NAMA TOKO
                    nama[x] = na;
                    al = JOptionPane.showInputDialog("ALAMAT");  //INPUT ALAMAT
                    alamat[x] = al;
                    np = JOptionPane.showInputDialog("NAMA PEMILIK");  //INPUT NAMA PEMILIK
                    pemilik[x] = np;
                    do {
                        jenis = JOptionPane.showInputDialog("JENIS USAHA \n" //INPUT JENIS USAHA
                                + "1. PAKAIAN \n"
                                + "2. SARUNG \n"
                                + "3. MAKANAN \n"
                                + "4. SEPATU/TAS \n"
                                + "5. ELEKTRONIK \n"
                                + "6. BARANG BEKAS \n"
                                + "7. BAHAN POKOK \n"
                                + "8. LAIN-LAIN \n");
                        switch (jenis) {    //SWITCH CASE UNTUK KETERANGAN PILIHAN
                            case "1": {
                                ket = "PAKAIAN";
                                p = p + 1;
                                break;
                            }
                            case "2": {
                                ket = "SARUNG";
                                s = s + 1;
                                break;
                            }
                            case "3": {
                                ket = "MAKANAN";
                                m = m + 1;
                                break;
                            }
                            case "4": {
                                ket = "SEPATU/TAS";
                                spt = spt + 1;
                                break;
                            }
                            case "5": {
                                ket = "ELEKTRONIK";
                                e = e + 1;
                                break;
                            }
                            case "6": {
                                ket = "BARANG BEKAS";
                                bb = bb + 1;
                                break;
                            }
                            case "7": {
                                ket = "BAHAN POKOK";
                                bp = bp + 1;
                                break;
                            }
                            case "8": {
                                ket = "LAIN-LAIN";
                                ll = ll + 1;
                                break;
                            }
                            default : {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                break;
                            }
                        }
                    } while (!("1".equals(jenis) || "2".equals(jenis) || "3".equals(jenis) ||
                            "4".equals(jenis) || "5".equals(jenis) || "6".equals(jenis) ||
                            "7".equals(jenis) || "8".equals(jenis)));
                    jenus[x] = jenis;
                    do {
                        try { 
                            mod = JOptionPane.showInputDialog("MODAL"); //INPUT MODAL
                            nmo = Integer.parseInt(mod);
                            salah = false;
                        } catch (Exception e) {  //JIKA MENGINPUT SELAIN ANGKA
                            JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                            salah = true;
                        }
                    } while (salah);
                    modal[x] = nmo;
                    do {
                        pj = JOptionPane.showInputDialog("PENJUALAN \n" //INPUT PENJUALAN
                                + "D. DALAM NEGERI \n"
                                + "L. LUAR NEGERI \n"
                                + "S. DALAM DAN LUAR NEGERI \n");
                    } while (!("D".equals(pj) || "L".equals(pj) || "S".equals(pj) ||
                            "d".equals(pj) || "l".equals(pj) || "s".equals(pj)));
                    penjualan[x] = pj;
                    
                    if ("D".equals(pj) || "d".equals(pj)) {  //IF UNTUK KETERANGAN PILIHAN
                        ket2 = "DALAM NEGERI";
                        jnd = jnd + 1;
                    } else if ("L".equals(pj) || "l".equals(pj)) {
                        ket2 = "LUAR NEGERI";
                        jnl = jnl + 1;
                    } else {
                        ket2 = "DALAM DAN LUAR NEGERI";
                        jns = jns + 1;
                    }

                    do {
                        pb = JOptionPane.showInputDialog("PEMBELI \n" //INPUT PEMBELI
                                + "D. DOMESTIK \n"
                                + "L. LUAR \n"
                                + "C. CAMPURAN \n");
                    } while (!("D".equals(pb) || "L".equals(pb) || "C".equals(pb) ||
                            "d".equals(pb) || "l".equals(pb) || "c".equals(pb)));
                    pembelian[x] = pb;

                    if ("D".equals(pb) || "d".equals(pb)) {  //IF UNTUK KETERANGAN PILIHAN
                        ket3 = "DOMESTIK";
                        bnd = bnd + 1;
                    } else if ("L".equals(pb) || "l".equals(pb)) {
                        ket3 = "LUAR";
                        bnl = bnl + 1;
                    } else {
                        ket3 = "CAMPURAN";
                        bnc = bnc + 1;
                    }

                    do {
                        cb = JOptionPane.showInputDialog("CABANG \n" //INPUT CABANG
                                + "T. TIDAK ADA  \nA. ADA\n");
                    } while (!("T".equals(cb) || "A".equals(cb) || "t".equals(cb) || "a".equals(cb)));
                    cabang[x] = cb;

                    if ("T".equals(cb) || "t".equals(cb)) {  //IF UNTUK KETERANGAN PILIHAN
                        ket4 = "TIDAK ADA";
                        cnt = cnt + 1;
                    } else {
                        ket4 = "ADA";
                        cna = cna + 1;
                    }

                    ale = JOptionPane.showInputDialog("ALAMAT EMAIL");  //INPUT EMAIL
                    email[x] = ale;
                    if (ale.length() > 1) {  //JIKA ADA EMAIL
                        tme = tme + 1;
                    }
                    do {
                        sm = JOptionPane.showInputDialog("SOSIAL MEDIA \n"  //INPUT SOSMED
                                + "1. FACEBOOK  \n2. WHATSAPP  \n3. INSTAGRAM  \n4. TELEGRAM  \n5. DLL");
                        switch (sm) {   //SWITCH CASE UNTUK KETERANGAN PILIHAN
                            case "1": {
                                ket5 = "FACEBOOK";
                                fb = fb + 1;
                                break;
                            }
                            case "2": {
                                ket5 = "WHATSAPP";
                                wa = wa + 1;
                                break;
                            }
                            case "3": {
                                ket5 = "INSTAGRAM";
                                ig = ig + 1;
                                break;
                            }
                            case "4": {
                                ket5 = "TELEGRAM";
                                tele = tele + 1;
                                break;
                            }
                            case "5": {
                                ket5 = "DAN LAIN-LAIN";
                                dll = dll + 1;
                                break;
                            }
                             default : {
                                JOptionPane.showMessageDialog(null, "DATA YANG ANDA INPUT SALAH");
                                break;
                            }
                        }
                    } while (!("1".equals(sm) || "2".equals(sm) || "3".equals(sm) || "4".equals(sm) || "5".equals(sm)));
                    sosmed[x] = sm;

                    do {
                        hp = JOptionPane.showInputDialog("NO TELPON / HP");  //INPUT NOMOR TELEPON
                        nomor[x] = hp;
                        salah = false;
                        if (hp.length() > 13) {    //JIKA NOMOR LEBIH DARI 13 DIGIT
                            JOptionPane.showMessageDialog(null, "KELEBIHAN, INPUT DENGAN BENAR");
                            salah = true;
                        }
                        if (hp.length() > 1) {    //JIKA ADA NOMOR  
                            tmt = tmt + 1;
                        }

                    } while (salah);

                    do {
                        st = JOptionPane.showInputDialog("STATUS PEMILIK(NIKAH/BELUM) \n"  //INPUT STATUS
                                + "[N/B]");
                    } while (!("N".equals(st) || "B".equals(st) || "n".equals(st) || "b".equals(st)));
                    status[x] = st;

                    if ("N".equals(st) || "n".equals(st)) {    //IF UNTUK KETERANGAN PILIHAN
                        ket6 = "NIKAH";
                    } else {
                        ket6 = "BELUM";
                    }

                    do {
                        ks = JOptionPane.showInputDialog("KERJASAMA DENGAN PERUSAHAAN/ORANGLAIN \n" //INPUT KERJASAMA
                                + "[Y/T]");
                    } while (!("Y".equals(ks) || "T".equals(ks) || "y".equals(ks) || "t".equals(ks)));
                    kerjasama[x] = ks;
                    if ("Y".equals(ks) || "y".equals(ks)) {  //IF UNTUK KETERANGAN PILIHAN
                        ket7 = "ADA KERJASAMA";
                        ak = ak + 1;
                    } else {
                        ket7 = "TIDAK ADA KERJASAMA";
                        tk = tk + 1;
                    }                            //REKAP DATA YANG DIINPUT
                    hasil += "                                             DATA PEDAGANG           \n";
                    hasil += "==========================================================\n";
                    hasil += "NAMA TOKO = " + nama[x] + "\n";
                    hasil += "ALAMAT    = " + alamat[x] + "\n";
                    hasil += "NAMA PEMILIK  = " + pemilik[x] + "\n";
                    hasil += "JENIS USAHA   = " + ket + "\n";
                    hasil += "MODAL = " + modal[x] + "\n";
                    hasil += "PENJUALAN = " + ket2 + "\n";
                    hasil += "PEMBELI   = " + ket3 + "\n";
                    hasil += "CABANG    = " + ket4 + "\n";
                    hasil += "ALAMAT EMAIL  = " + email[x] + "\n";
                    hasil += "SOSIAL MEDIA  = " + ket5 + "\n";
                    hasil += "NO TELPON / HP    = " + nomor[x] + "\n";
                    hasil += "STATUS PEMILIK    = " + ket6 + "\n";
                    hasil += "KERJASAMA PERUSAHAAN/ORANG LAIN   = " + ket7 + "\n";
                    hasil += "==========================================================\n";

                    JOptionPane.showMessageDialog(null, hasil, "INFORMASI DATA PEDAGANG NO " + no, JOptionPane.INFORMATION_MESSAGE);
                    hasil = "";
                    do {
                        ulang = JOptionPane.showInputDialog("INPUT DATA LAGI [Y/T]");  //INPUT ULANG DATA

                        if (x == 19) {         //JIKA DATA ADA 20
                            JOptionPane.showMessageDialog(null, "DATA SUDAH PENUH");
                            ulang = "T";
                        }
                    } while (!("Y".equals(ulang) | "y".equals(ulang) | "t".equals(ulang) | "T".equals(ulang)));
                } while ("Y".equals(ulang) || "y".equals(ulang));
            }
            keluar = false;
        } while (keluar);
    }
}

