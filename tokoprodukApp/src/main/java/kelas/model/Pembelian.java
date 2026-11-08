package kelas.model;

public class Pembelian {

    private final String kode;
    private final Produk tiket;
    private final String gambarUri;

    public Pembelian(String kode, Produk tiket, String gambarUri) {
        if (kode == null || kode.isBlank() || tiket == null) {
            throw new IllegalArgumentException("Data pembelian tidak lengkap.");
        }
        this.kode = kode;
        this.tiket = tiket;
        this.gambarUri = gambarUri;
    }

    public String getKode() {
        return kode;
    }

    public Produk getTiket() {
        return tiket;
    }

    public String getGambarUri() {
        return gambarUri;
    }

    public String getJenis() {
        if (tiket instanceof Minuman) {
            return "Makanan";
        } else {
            return "Minuman";
        }
    }

    public String getNamaPembeli() {
        return tiket.getNamaPembeli();
    }

    public int getJumlah() {
        return tiket.getJumlah();
    }
}
