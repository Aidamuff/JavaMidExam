package Application;
import data.*;
import java.util.Scanner;
/**
 *
 * @author Aida Muflihah
 */
public class Application {
    public static void main(String[] args) {
        String lNama, lProsesor, lOs, lStorage;
        int lStok,lCore, lRam;
        
//        Scanner
        Scanner masukan = new Scanner(System.in);
       
        Axioo neon = new Axioo();
        Dell xps = new Dell();
        
//        neon.getAllLaptopData();
        neon.axiooSlogan();
//        Untuk test Axioo neon
        System.out.print("Nama : "); lNama = masukan.nextLine();
        System.out.print("Prosesor : "); lProsesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); lCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); lOs = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); lRam = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); lStorage = masukan.nextLine();
        System.out.print("Stok : "); lStok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        neon.setNamaLaptop(lNama);
        neon.setProsesorLaptop(lProsesor);
        neon.setCoreLaptop(lCore);
        neon.setOsLaptop(lOs);
        neon.setRamLaptop(lRam);
        neon.setStorageLaptop(lStorage);
        neon.setStokLaptop(lStok);
        neon.getAllLaptopData();
        System.out.println("Store Position " + neon.getNamaLaptop() + 
                " adalah " + neon.getStorePositionLaptop());
        System.out.println("==========================================");
                

//        xps.getAllLaptopData();
        xps.dellSlogan();
        
//        Untuk test Dell xps
        System.out.print("Nama : "); lNama = masukan.nextLine();
        System.out.print("Prosesor : "); lProsesor = masukan.nextLine();
        System.out.print("Jumlah Core : "); lCore = masukan.nextInt();masukan.nextLine();
        System.out.print("Operating System : "); lOs = masukan.nextLine();
        System.out.print("Ukuran RAM(GB): "); lRam = masukan.nextInt();masukan.nextLine();
        System.out.print("Jenis Storage : "); lStorage = masukan.nextLine();
        System.out.print("Stok : "); lStok = masukan.nextInt();masukan.nextLine();
        System.out.println("");
        xps.setNamaLaptop(lNama);
        xps.setProsesorLaptop(lProsesor);
        xps.setCoreLaptop(lCore);
        xps.setOsLaptop(lOs);
        xps.setRamLaptop(lRam);
        xps.setStorageLaptop(lStorage);
        xps.setStokLaptop(lStok);
        xps.getAllLaptopData();
        System.out.println("Store Position " + xps.getNamaLaptop() + 
                " adalah " + xps.getStorePositionLaptop());
        System.out.println("==========================================");       
        
    }
}