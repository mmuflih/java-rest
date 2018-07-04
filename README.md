# README

## Cara Menjalankan
- Buat Database
- Buat Tabel
- Setting koneksi pada file src/main/java/config/Database.java
- Kemudian jalankan ./gradlew bootRun

### Database
Tabel mahasiswa

    CREATE TABLE `mahasiswa` (
        `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
        `name` varchar(50) DEFAULT NULL,
        `nim` varchar(10) DEFAULT NULL,
        PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
Tabel phonebooks
    
    CREATE TABLE `phonebooks` (
        `id` int(10) NOT NULL AUTO_INCREMENT,
        `name` varchar(50) NOT NULL DEFAULT '',
        `phone` varchar(20) NOT NULL DEFAULT '',
        PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

### Rest Endpoint

Phonebook

- Tambah Phonebook (POST)
    
    Endpoint: http://localhost:8080/phonebook

    Request body:

        {
        	"name": "Test",
        	"phone": "7777"
        }

- Get List Phonebook (GET)

    Endpoint: http://localhost:8080/phonebook

- Get Phonebook Per id (GET)

    Endpoint: http://localhost:8080/phonebook/1

- Edit Phonebook per id (PUT)

    Endpoint: http://localhost:8080/phonebook/1

    Request body:

        {
        	"name": "Muflih",
        	"phone": "08123456789"
        }

- Hapus Phonebook per id (DELETE)

    Endpoint: http://localhost:8080/phonebook/1

Mahasiswa

- Tambah Mahasiswa (POST)
    
    Endpoint: http://localhost:8080/phonebook

    Request body:

        {
        	"name": "Muflih",
        	"nim": "075410252"
        }

- Get List Mahasiswa (GET)

    Endpoint: http://localhost:8080/phonebook

- Get Mahasiswa Per id (GET)

    Endpoint: http://localhost:8080/phonebook/1