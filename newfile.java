import java.util.Scanner;
public class Main {
 //* Ini nama Class bernama "Main" 
public static void main(String[] args) {
//* ini nama Method bernama "main" bertipe static void artinya blok kode yang akan dijalankan terlebih dahulu dan void berarti tidak mengembalikan nilai
	Scanner periksa = new Scanner(System.in); //* Yang ini mungkin method
	System.out.println("Siapa namamu?");
	String inputNama = periksa.next();
	//* Deklarasi variabel "inputNama" bertipe "String" lalu bernilai method "periksa.next();" setara dengan read kalau di shell, scanf kalau di c language
  System.out.println("Hello, " + inputNama + "!");
 
  //* Ini akan mencetak String "Siapa namamu?" kemudian jika input diberikan maka program akan menyapamu "Hello, NAMA KAMU!"
   periksa.close();
   //* ini penutup method
  
  }  
}
