package august.javaclass;

import java.util.ArrayList;

/**
 * Created by D2J-00 on 31/01/2017.
 */
public class Transaksi {
    private ArrayList<Barang> ListBarang = new ArrayList<>();

    public void addBarang (Barang barang){
        this.ListBarang.add(barang);
    }
    public int totalTransaksi(){
        int hasil = 0;
        for (int i = 0; i < ListBarang.size(); i++){
            hasil += ListBarang.get(i).getHarga();
        }
        return hasil;
    }
    public String printTransaksi(){
        String text = "Barang yang dibeli pada transaksi in adalah:\n";
        text += "--------------------------------------------\n";
        for (int i =0; i< ListBarang.size(); i++){
            text += ListBarang.get(i).toString();
        }
        text += "--------------------------------------------\n";
        text += " Total Pembelian: "+totalTransaksi()+"\n";
        text += "--------------------------------------------\n";
        return text;
    }

    public  double averageTransaksi(){
        double hasil =0;
        for (int i =0; i< ListBarang.size(); i++){
            hasil += ListBarang.get(i).getHarga();
        }
        hasil=hasil / ListBarang.size();
        return hasil;
    }

    public String maxBarang(){
        Barang max;
        max = ListBarang.get(0);
        for (int i =0; i< ListBarang.size(); i++) {
             if(ListBarang.get(i).getHarga()> max.getHarga()){
                 max = ListBarang.get(i);
             }
        }

        String namaBarang = max.getNama();
        String text = "Barang termahal pada transaksi adalah "+namaBarang;
        return text;
    }
}
