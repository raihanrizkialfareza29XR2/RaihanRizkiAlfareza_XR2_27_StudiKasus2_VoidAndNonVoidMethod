package Studi;

import java.util.Scanner;

public class Studi {
    String nama;
    double celcius;
    int pilihan;
    boolean running = true;

    void input(){
        while (running){
            Scanner input = new Scanner(System.in);
            System.out.println("|=======================================|");
            System.out.println("|Selamat Datang di Program Konversi Suhu|");
            System.out.println("|---------------------------------------|");
            System.out.println("|         1. Celcius - Reamur           |");
            System.out.println("|       2. Celcius - Fahrenheit         |");
            System.out.println("|         3. Celcius - Kelvin           |");
            System.out.println("|---------------------------------------|");
            System.out.println("|=======================================|");
            System.out.println("");
            System.out.print("Silahkan Masukkan Nama Anda : ");
            nama = input.nextLine();
            System.out.print("Silahkan Masukkan Pilihan Program (Masukkan Angkanya Saja!) : ");
            pilihan = input.nextInt();
            if (pilihan == 1){
                System.out.println("Anda Memilih Konversi Suhu dari Celcius ke Reamur");
                System.out.println("-------------------------------------------------");
                System.out.print("Masukkan Nilai Celcius : ");
                celcius = input.nextDouble();
            }
            else if (pilihan == 2){
                System.out.println("Anda Memilih Konversi Suhu dari Celcius ke Fahrenheit");
                System.out.println("-----------------------------------------------------");
                System.out.print("Masukkan Nilai Celcius : ");
                celcius = input.nextDouble();
            }
            else if (pilihan == 3){
                System.out.println("Anda Memilih Konversi Suhu dari Celcius ke Kelvin");
                System.out.println("-----------------------------------------------------");
                System.out.print("Masukkan Nilai Celcius : ");
                celcius = input.nextDouble();
            }

            Scanner darurat = new Scanner(System.in);
            System.out.println("");
            System.out.print("Apakah Anda Ingin Mengulang? (Y/T) : ");
            String x = darurat.nextLine();
            if(x.equalsIgnoreCase("T")){
                running = false;
            }
        }
    }


    String NAMA (){
        return nama;
    }
    int PILIHAN (){
        return pilihan;
    }
    double CELCIUS (){
        return celcius;
    }
    double HASIL1 (){
        return (0.8)*celcius;
    }
    double HASIL2 (){
        return (1.8)*celcius + 32;
    }
    double HASIL3 (){
        return celcius + 273;
    }
}
