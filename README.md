# UTS-pbo
menggunakan bahasa java
Kodingan di atas merupakan implementasi sederhana dari konsep pemrograman berorientasi objek (PBO) dalam bahasa pemrograman Java. Mari kita jelaskan masing-masing bagian dari kodingan tersebut:

1. **Interface `Binatang`**: Ini adalah sebuah interface yang mendefinisikan dua metode, `suara()` dan `gerak()`, yang harus diimplementasikan oleh kelas-kelas yang mengimplementasikan interface ini.

2. **Abstract class `Hewan`**: Ini adalah sebuah abstract class yang menjadi template untuk fitur-fitur umum dari binatang. Kelas ini mengimplementasikan interface `Binatang` dan memiliki satu metode abstract, yaitu `tidur()`, yang harus diimplementasikan oleh kelas-kelas turunannya.

3. **Class `Singa`**: Ini adalah sebuah kelas yang mewarisi dari abstract class `Hewan` dan mewakili objek singa. Kelas ini mengimplementasikan metode `suara()`, `gerak()`, dan `tidur()` sesuai dengan perilaku singa.

4. **Class `Kuda`**: Ini adalah sebuah kelas yang juga mewarisi dari abstract class `Hewan` dan mewakili objek kuda. Kelas ini juga mengimplementasikan metode `suara()`, `gerak()`, dan `tidur()` sesuai dengan perilaku kuda.

5. **Class `Ikan`**: Ini adalah sebuah kelas yang juga mewarisi dari abstract class `Hewan` dan mewakili objek ikan. Kelas ini juga mengimplementasikan metode `suara()`, `gerak()`, dan `tidur()` sesuai dengan perilaku ikan.

6. **Class `Main`**: Ini adalah kelas utama yang memiliki metode `main()`. Di dalam metode `main()`, objek-objek dari kelas `Singa`, `Kuda`, dan `Ikan` dibuat, dan kemudian metode-metode mereka dipanggil untuk menampilkan perilaku masing-masing binatang.

Dengan menggunakan struktur seperti ini, program memanfaatkan konsep pewarisan (inheritance) dan implementasi interface (interface implementation) dalam PBO. Abstract class `Hewan` menyediakan implementasi umum untuk metode-metode yang sama pada setiap binatang, sementara kelas-kelas seperti `Singa`, `Kuda`, dan `Ikan` menerapkannya dengan cara yang sesuai dengan spesifikasi individu dari masing-masing binatang.
