# 📚 Book Catalog API

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.6-brightgreen.svg)
![PostgreSQL](https://img.shields.io/badge/Database-PostgreSQL-blue.svg)
![License](https://img.shields.io/badge/license-MIT-green.svg)

Book Catalog API adalah aplikasi backend sederhana untuk mengelola daftar buku menggunakan **Java Spring Boot 3** dan **PostgreSQL**.

---

## ✨ Fitur

- ✅ Tambah, lihat, update, dan hapus data buku
- ✅ Validasi input pengguna
- ✅ Penanganan error global
- ✅ Dokumentasi API dengan Swagger (OpenAPI)

---

## 🧪 Teknologi yang Digunakan

- Java 17
- Spring Boot 3.1.6
- Spring Data JPA
- PostgreSQL
- Lombok
- Swagger UI
- ModelMapper

---

## 🚀 Cara Menjalankan Aplikasi

1. **Clone repo ini**:
   ```bash
   git clone https://github.com/Fadliiii/BookCatalog.git
   cd BookCatalog
   ```

2. **Setup database PostgreSQL**, buat database:
   ```sql
   CREATE DATABASE BookCatalog;
   ```

3. **Sesuaikan `application.properties` atau `application.yml`**:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/BookCatalog
   spring.datasource.username=ucorp
   spring.datasource.password=ucorp
   ```

4. **Jalankan aplikasi**:
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Buka Swagger UI untuk uji API**:
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 📁 Struktur Project

```
BookCatalog/
├── src/
│   ├── main/
│   │   ├── java/              # Kode sumber Java
│   │   └── resources/         # Konfigurasi (application.yml, schema.sql, dll)
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🔗 Dokumentasi API

Semua endpoint tersedia di Swagger UI:

📄 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 🧑‍💻 Author

**Fadlilatul Umam**  
Java Backend Developer  
GitHub: [@Fadliiii](https://github.com/Fadliiii)

---

## 📄 Lisensi

Proyek ini menggunakan lisensi [MIT](https://opensource.org/licenses/MIT) — silakan digunakan secara bebas.