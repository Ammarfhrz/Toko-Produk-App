package kelas.model;
public class Makanan extends Produk {
 public Makanan(String nama,int jumlah){super(nama,jumlah);}
 @Override public long hitungTotal(){return getJumlah();}
}
