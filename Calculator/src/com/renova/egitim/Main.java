/**
 * 
 */
package com.renova.egitim;

 // EMRULLAH ALAY
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author emir
 *
 */
public class Main {

	/**
	 * @param args
	 */
	static double preNumber=0;
	static double postNumber;
	static double memoryNumber;
	static int control=0;
	static int bolmeControl =0;
	static int cikarmaControl = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		Scanner outerScan;
		int choice;
				
		do {
			postNumber=0;	
			System.out.println("[1] Toplama\r\n"
					+ "[2] Çýkarma\r\n"
					+ "[3] Çarpma\r\n"
					+ "[4] Bölme\r\n"
					+ "[5] Mod\r\n"
					+ "[6] Hafýzaya Al\r\n"
					+ "[7] Hafýzadakini Yazdýr ve Temizle\r\n"
					+ "[0] Çýkýþ");
	
			choice= scan.nextInt();
			
			switch(choice) {		
			case 0: // CIKIS
				System.out.println("Cikis yapmaktasiniz");
				break;
				
			case 1:  // TOPLAMA
				outerScan = new Scanner(System.in);
				System.out.println("\nToplanacak sayilari giriniz:");		
				dortIslem(choice, outerScan);
					
				break;
				
			case 2:  // CIKARMA 
			// ( CIKARMA ISLEMI 2'DEN FAZLA SAYI ILE YAPILDIGI ICIN ILK SAYIDAN DIGER SAYILAR CIKARILIR)
				outerScan = new Scanner(System.in);
				System.out.println("\nCikarilacak sayilari giriniz:");			
				dortIslem(choice, outerScan);
					
				break;
				
			case 3:  //  CARPMA
				postNumber=1;
				outerScan = new Scanner(System.in);
				System.out.println("\nCarpilacak sayilari giriniz:");				
				dortIslem(choice, outerScan);
					
				break;
				
			case 4: // BOLME
			// ( BOLME ISLEMI 2'DEN FAZLA SAYI ILE YAPILDIGI ICIN ILK SAYIDAN BASLAYARAK SIRAYLA 2LI OLARAK BOLME YAPILIR)
				postNumber=1;
				outerScan = new Scanner(System.in);
				System.out.println("\nBolunecek sayilari giriniz:");
				dortIslem(choice, outerScan);
				//outerScan.close();	
				break;
				
			case 5: // MOD ALMA
				double a;
				double b;
				outerScan = new Scanner(System.in);
				System.out.println("\nModu alinacak sayiyi giriniz:");
				a = outerScan.nextDouble();
				System.out.println("\nHangi sayiya gore modun alýnacagini giriniz:");
				b = outerScan.nextDouble();
				modAlma(a, b);
				preNumber= postNumber;
				System.out.println("Islem sonucu: "+new DecimalFormat("##.##").format(postNumber).replace(',', '.'));
				break;
				
			case 6:
				memoryNumber = preNumber;
				control++;
				System.out.println("Son yapilan islem hafizaya alinmistir.");
				break;
				
			case 7:
				if(control ==0)
					System.out.println("Hafizada sayi bulunmamaktadir");
				else {
					System.out.println("Hafizadaki sayi: "+ new DecimalFormat("##.##").format(memoryNumber).replace(',', '.'));
					memoryNumber = 0;
					System.out.println("Hafiza temizlendi.");
					control = 0;
				}							
				break;
				
			default:
				System.out.println("Lutfen gecerli bir islem seciniz...");	
			}
			
		}while(choice != 0);
		
		System.out.println("Program sonlandirildi");
	}
	
	public static void modAlma(double a, double b) {
		postNumber = a%b;
	}
	
	public static void dortIslem(int choice, Scanner sc){
        //	ISLEMLER ICIN SAYILARIN OKUNDUGU METHOD
        Scanner innerScan;
       
        while(sc.hasNextLine()){    
            String line = sc.nextLine();  // SAYILARIN GIRILDIGI SATIRIN TAMAMI ALINIR
            innerScan = new Scanner(line);
            while(innerScan.hasNextDouble()){   // SATIRDAKI SAYILAR ISLEME SOKULUR
                double inputNumber = innerScan.nextDouble();
                islemler(choice, inputNumber);
            }
            preNumber =postNumber;
            System.out.println("Islem sonucu: "+ new DecimalFormat("##.##").format(postNumber).replace(',', '.'));
            break;
        }
      
        bolmeControl= 0;
        cikarmaControl= 0;
    }
	
	public static void islemler(int choice, double inputNumber){
        // 4 ISLEMIN YAPILDIGI METHOD 
		// DOUBLE DEGERLER RUNTIMEDE ISLEME SOKULURKEN INT  BAZ ALINDIGINDAN BILGI-
		// KAYBI OLDUGUNDAN DEGERLER BIGDECIMAL OLARAK ALINDI
        BigDecimal inputDecimalNumber = BigDecimal.valueOf(inputNumber);
        BigDecimal processDecimalNumber = BigDecimal.valueOf(postNumber);          
        switch(choice){
            
            case 1: // TOPLAMA
            	processDecimalNumber = processDecimalNumber.add(inputDecimalNumber);
                break;
            case 2:  // CIKARMA
            	if(postNumber == 0 && cikarmaControl == 0) {  // ILK GIRILEN SAYI KONTROLU
        			postNumber = inputNumber;
        			cikarmaControl++;
        		}else {		
        			processDecimalNumber = processDecimalNumber.subtract(inputDecimalNumber);    	
        		}
            	if(postNumber == inputNumber)
            		processDecimalNumber = BigDecimal.valueOf(postNumber);	
            	break;
            case 3: // CARPMA
            	processDecimalNumber = processDecimalNumber.multiply(inputDecimalNumber);
            	break;
            case 4: // BOLME
            	if(bolmeControl==0 && postNumber == 1) {  // ILK GIRILEN SAYI KONTROLU
        			postNumber = inputNumber;
        			bolmeControl++;
        		}else {
        			processDecimalNumber = processDecimalNumber.divide(inputDecimalNumber, 2, RoundingMode.HALF_DOWN);
        		}
            	if(postNumber == inputNumber)
            		processDecimalNumber = BigDecimal.valueOf(postNumber);            	
            	break;
            default: 
                System.out.println("girmek yine imkansýz");
        }
        postNumber = processDecimalNumber.doubleValue();
	}

	
	
	

}
