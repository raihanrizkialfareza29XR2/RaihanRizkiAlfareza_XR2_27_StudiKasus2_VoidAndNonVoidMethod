package Studi;

public class Kasus2 {
    public static void main(String[] args) {
        Studi suhu = new Studi();
        suhu.input();
        System.out.println("");
        System.out.println("Input Nama Anda : " + suhu.NAMA());
        System.out.println("Pilihan Anda : " + suhu.PILIHAN());
        System.out.println("Input Suhu Celcius : " + suhu.CELCIUS());
        System.out.println("-----------------------------------------------------");
        if (suhu.PILIHAN()==1){
            System.out.println("Hasil Konversi : " + suhu.HASIL1() + " Reamur");
        }
        if (suhu.PILIHAN()==2){
            System.out.println("Hasil Konversi : " + suhu.HASIL2() + " Fahrenheit");
        }
        if (suhu.PILIHAN()==3){
            System.out.println("Hasil Konversi : " + suhu.HASIL3() + " Kelvin");
        }
    }
}
