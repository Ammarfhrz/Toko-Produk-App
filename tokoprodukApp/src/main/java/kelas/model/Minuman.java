package kelas.model;
public class Minuman extends Produk {
 public Minuman(String nama,int jumlah){super(nama,jumlah);}
 @Override public long hitungTotal(){return getJumlah();}
}
