# Latihan PBO — com.kamachi.pbo

Deskripsi singkat
Proyek latihan Pemrograman Berorientasi Objek (PBO) dengan struktur pertemuan (pert1–pert6). Berisi contoh-contoh dasar: input/output, tipe data, struktur kendali, array, method, OOP, dan abstraksi.

## Prasyarat
- Java JDK 8+ terpasang
- Maven (proyek memiliki folder `target` / `maven-status`) atau buka langsung di NetBeans/IDE yang mendukung Maven
- NetBeans atau IDE lain (optional)

## Instalasi & Menjalankan
1. Buka proyek di NetBeans: File → Open Project → pilih folder proyek.
  Atau import sebagai Maven project di IDE lain.
2. Dari terminal:
  - Build: `mvn clean package`
  - Jalankan kelas utama lewat IDE atau:
    - Jika ada JAR: `java -jar target/NamaProyek.jar`
    - Jika belum ada JAR atau ingin jalankan kelas tertentu:
     `java -cp target/classes <fully.qualified.MainClass>`
  (Ganti `<fully.qualified.MainClass>` dengan nama kelas yang berisi method main.)

## Struktur proyek (ringkasan)

```
src/
├─ main/
│  └─ java/
│     └─ com.kamachi.pbo/
│        ├─ pert1/
│        │  └─ latihan1/
│        ├─ pert2/
│        │  └─ dosen/
│        │     ├─ inputOutput/
│        │     ├─ strukturKendali/
│        │     └─ tipeData/
│        ├─ pert3/
│        │  ├─ asdos/
│        │  │  ├─ array/
│        │  │  └─ method/
│        │  └─ dosen/
│        │     ├─ array/
│        │     └─ method/
│        ├─ pert4/
│        │  ├─ asdos/
│        │  │  └─ oop/
│        │  └─ dosen/
│        │     └─ oop/
│        ├─ pert5/
│        │  └─ dosen/
│        ├─ pert6/
│        │  └─ dosen/
│        │     └─ abstrak/
│        │        └─ tugas/
│        └─ pert7
│           └─ dosen
│              └─ interfaces
│                 ├─ alatmusik
│                 ├─ assets
│                 └─ konverterSuhu
├─ test/
│  └─ java/
└─ target/
```

## Cara penggunaan
- Cari kelas dengan `public static void main(String[] args)` untuk tiap latihan/pertemuan dan jalankan dari IDE.
- Contoh menjalankan dari terminal (kelas Main di package contoh):
  `java -cp target/classes com.kamachi.pbo.pert1.latihan1.Main`

---

Catatan: README ini bersifat umum untuk latihan PBO. Jika Anda ingin README yang lebih spesifik (mis. nama kelas utama yang dipakai untuk menjalankan, skrip build khusus, contoh input/output, atau daftar dependensi), kirimkan nama kelas utama atau file `pom.xml`/`build.xml` dan saya perbarui README sesuai proyek.
