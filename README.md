# Toko-Produk-App

Aplikasi desktop manajemen produk toko berbasis **Java** menggunakan **JavaFX** dan **Maven**. Project ini dirancang dengan arsitektur berorientasi objek yang memisahkan model data, antarmuka pengguna (*FXML*), serta pengontrol (*Controller*).

---

## 📂 Struktur Project

```text
Toko-Produk-App/
│
└── tokoprodukApp/
    ├── src/main/java/kelas/
    │   ├── controller/      # Berisi logika tampilan (Daftar, Detail, Form)
    │   ├── data/            # Manajemen data pembelian/penyimpanan sementara
    │   ├── model/           # Kelas entitas (Produk, Makanan, Minuman, Pembelian)
    │   ├── MainApp.java     # Titik masuk utama aplikasi (Entry Point JavaFX)
    │   └── Navigator.java   # Pengelola navigasi antar halaman
    │
    ├── src/main/resources/kelas/
    │   ├── daftar.fxml      # Tampilan daftar produk
    │   ├── detail.fxml      # Tampilan detail produk
    │   ├── form.fxml        # Tampilan formulir input/edit produk
    │   └── styles/
    │       └── app.css      # Kustomisasi styling CSS antarmuka
    │
    └── pom.xml              # Konfigurasi dependensi Maven


    git clone [https://github.com/Ammarfhrz/Toko-Produk-App.git](https://github.com/Ammarfhrz/Toko-Produk-App.git)


    ---

**Cara pakai di halaman GitHub kamu saat ini:**
1. Blok dan salin seluruh teks di dalam kotak kode di atas.
2. Tempel (*paste*) ke editor web GitHub yang sedang terbuka di layar kamu (menggantikan teks yang mungkin masih terpotong)[cite: 4].
3. Gulir ke bawah halaman GitHub tersebut, lalu klik tombol hijau **Commit changes...** untuk menyimpannya.
