package adttanggal;
import java.util.Scanner;
public class ADTtanggal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hari = 0, tanggal, bulan, tahun;
        boolean Tanggal, Bulan, Valid;
        String hasil, namabulan = null;
       
        System.out.print("Masukkan Tanggal : ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan : ");
        bulan = input.nextInt();
        System.out.print("Masukkan Tahun : ");
        tahun = input.nextInt();
        
        if(bulan==1){
            hari = 31;
            namabulan = " Januari ";
        }
        else if(bulan==2){
            if((tahun % 4 == 0 && tahun % 100!=0) || tahun %400 == 0){
                hari=29;
                namabulan = " Februari ";
            }
            else{
                hari=28;
                namabulan = " Februari ";
            }
        }
        else if(bulan==3){
            hari = 31;
            namabulan = " Maret ";
        }
        else if(bulan==4){
            hari = 30;
            namabulan = " April ";
        }
        else if(bulan==5){
            hari = 31;
            namabulan = " Mei ";
        }
        else if(bulan==6){
            hari = 30;
            namabulan = " Juni ";
        }
        else if(bulan==7){
            hari = 31;
            namabulan = " Juli ";
        }
        else if(bulan==8){
            hari = 31;
            namabulan = " Agustus ";
        }
        else if(bulan==9){
            hari = 30;
            namabulan = " September ";
        }
        else if(bulan==10){
            hari = 31;
            namabulan = " Oktober ";
        }
        else if(bulan==11){
            hari = 30;
            namabulan = " November ";
            
        }
        else if(bulan==12){
            hari = 31;
            namabulan = " Desember ";
        }
        else{
            hari = -1;
        }
        
        Tanggal = tanggal >=1 && tanggal <= hari;
        Bulan = bulan >=1 && bulan <=12;
        Valid = Tanggal && Bulan;
        
        if(Valid){
            hasil = " valid ";
        }
        else{
            hasil = " tidak valid ";
        }
        System.out.println("");
        System.out.println(tanggal+namabulan+tahun+hasil);
    }
}