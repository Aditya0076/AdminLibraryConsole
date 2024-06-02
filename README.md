# AdminLibrary

AdminLibrary adalah program manajemen perpustakaan sederhana yang dibuat menggunakan bahasa pemrograman Java. Program ini menyediakan fungsionalitas untuk mengelola buku, anggota perpustakaan, peminjaman, dan pengembalian buku.

## Fitur

- **Login Admin**: Autentikasi admin untuk mengakses fitur program.
- **Manajemen Buku**:
    - Tambah Buku
    - Tampilkan Buku
    - Edit Buku
    - Hapus Buku
- **Manajemen Anggota** (belum diimplementasikan sepenuhnya):
    - Tambah Anggota
    - Tampilkan Anggota
    - Edit Anggota
    - Hapus Anggota
- **Manajemen Peminjaman** (belum diimplementasikan sepenuhnya):
    - Tambah Peminjaman
    - Tampilkan Peminjaman
    - Edit Peminjaman
    - Hapus Peminjaman
- **Manajemen Pengembalian** (belum diimplementasikan sepenuhnya):
    - Tambah Pengembalian
    - Tampilkan Pengembalian
    - Edit Pengembalian
    - Hapus Pengembalian

## Cara Penggunaan

1. **Login Admin**: Masukkan username dan password admin (`admin` untuk keduanya).
2. **Menu Utama**: Pilih opsi yang diinginkan dari menu utama.
    - 1: Buku
    - 2: Anggota
    - 3: Peminjaman
    - 4: Pengembalian
    - 0: Keluar

### Manajemen Buku

1. **Tambah Buku**: Masukkan jumlah buku yang akan ditambahkan dan detail buku (judul, pengarang, dan penerbit).
2. **Tampilkan Buku**: Menampilkan daftar semua buku yang telah ditambahkan.
3. **Edit Buku**: Edit informasi buku berdasarkan indeks yang diberikan.
4. **Hapus Buku**: Hapus buku berdasarkan indeks yang diberikan.

### Manajemen Anggota, Peminjaman, dan Pengembalian

- Menu ini saat ini hanya menampilkan opsi dan belum diimplementasikan sepenuhnya. (catatan)

## Catatan Penting

- Variabel `book` mungkin perlu diinisialisasi dengan lebih tepat untuk menghindari kesalahan potensial.
- Menu manajemen anggota, peminjaman, dan pengembalian belum diimplementasikan sepenuhnya. Fungsi-fungsi tersebut masih dalam tahap perancangan dan perlu dikembangkan lebih lanjut.

## Cara Menjalankan Program

1. Clone repositori ini ke lokal Anda.
2. Buka proyek dengan IDE Java favorit Anda (misalnya, IntelliJ IDEA, Eclipse).
3. Jalankan kelas `Main` untuk memulai program.