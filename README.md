# ✅ TUTORIAL LENGKAP: Instalasi JDK 17 Hingga Integrasi SonarQube


### 1. Instalasi JDK 17

#### Langkah 1: Unduh JDK 17

- Buka: [https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Pilih **JDK 17** dan sesuaikan dengan **Sistem Operasi kalian**

#### Langkah 2: Instalasi

- Jalankan installer
- Pilih lokasi instalasi, default saja: `C:\Program Files\Java\jdk-17`
- Klik Next hingga selesai

#### Langkah 3: Konfigurasi Environment Variable

1. Buka **Start** → cari `Environment Variables`
2. Klik **Environment Variables**
3. Di bagian **System variables**, klik:
   
   - `New...` → Name: `JAVA_HOME`, Value: `C:\Program Files\Java\jdk-17`
   - Edit `Path`, tambahkan: `%JAVA_HOME%\bin`
4. Klik OK

#### Langkah 4: Verifikasi

Buka `CMD`, jalankan:

```cmd
java -version
````

Jika berhasil, akan muncul:

```
java version "17.x.x"
```

---

### 2. Instalasi dan Konfigurasi SonarQube

#### Langkah 1: Unduh SonarQube dan Scanner

* SonarQube: [https://www.sonarsource.com/products/sonarqube/downloads/](https://www.sonarsource.com/products/sonarqube/downloads/)
* SonarScanner: [https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/](https://docs.sonarsource.com/sonarqube/latest/analyzing-source-code/scanners/sonarscanner/)

#### Langkah 2: Ekstrak File

Ekstrak:

* `sonarqube-*` ke: `C:\sonarqube`
* `sonar-scanner-*` ke: `C:\sonar-scanner`

#### Langkah 3: Tambahkan PATH

* Tambahkan `C:\sonar-scanner\bin` ke Environment Variable `Path`

#### Langkah 4: Jalankan SonarQube

1. Buka CMD
2. Jalankan:

```cmd
C:\sonarqube\bin\windows-x86-xx\StartSonar.bat
```

3. Tunggu hingga muncul log sukses
4. Akses: [http://localhost:9000](http://localhost:9000)

---

### 3. Konfigurasi Proyek dan Token

#### Langkah 1: Buat Token

* Login ke SonarQube
* Klik profil (kanan atas) → **My Account** → **Security**
* Buat token, salin token

#### Langkah 2: Siapkan Proyek

* Buat folder `project-modul-9`, isi dengan file kode (misal Java)

---

### 4. Analisis Proyek dengan SonarScanner

#### Langkah 1: Buka CMD di Folder Proyek

```cmd
cd D:\project-modul-9
```

#### Langkah 2: Jalankan Perintah Analisis

```cmd
"C:\sonar-scanner\bin\sonar-scanner.bat" ^
 -D"sonar.projectKey=project-modul-9" ^
 -D"sonar.sources=." ^
 -D"sonar.host.url=http://localhost:9000" ^
 -D"sonar.token=ISI_TOKEN_DISINI"
```

#### Langkah 3: Cek Hasil

* Buka browser: [http://localhost:9000](http://localhost:9000)
* Masuk ke proyek `project-modul-9`
* Lihat hasil analisis: bug, code smell, dll

---

### 5. Troubleshooting Umum

| Masalah                       | Penyebab           | Solusi                                      |
| ----------------------------- | ------------------ | ------------------------------------------- |
| `java -version` tidak muncul  | Path belum diset   | Tambahkan `%JAVA_HOME%\bin` ke `Path`       |
| `sonar-scanner.bat not found` | Path belum diset   | Tambahkan `C:\sonar-scanner\bin` ke `Path`  |
| Error: Not authorized         | Token salah        | Buat token baru dari dashboard SonarQube    |
| SonarQube tidak bisa dibuka   | Server belum jalan | Jalankan `StartSonar.bat`, jangan tutup CMD |

---
