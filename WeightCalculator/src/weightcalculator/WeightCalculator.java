/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightcalculator;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author emir
 */
public class WeightCalculator {

    /**
     * @param args the command line arguments
     */
    
    /*      GEZEGEN YERÇEKİMİ KATSAYILARI
    final static float mercuryWeight = 3.7f;
    final static float venusWeight = 8.87f;
    final static float marsWeight = 3.77f;
    final static float jupiterWeight = 23.30f;
    final static float saturnWeight = 9.2f;
    final static float uranusWeight = 8.69f;
    final static float neptuneWeight = 11f;
    final static float plutoWeight = 0.06f; */
    
    public enum GEZEGEN{
        //Gezegenler ve gezegenlerin yercekimi katsayilari
        MERCURY(3.7f),
        VENUS(8.87f),
        MARS(3.77f),
        JUPITER(23.30f),
        SATURN(9.2f),
        URANUS(8.69f),
        NEPTUNE(11f),
        PLUTON(0.06f);
        
        public final float gravityFactor;
        
        //Yercekimi katsayilarina ulasmak icin constructor
        private GEZEGEN(float gravityFactor){ 
            this.gravityFactor = gravityFactor;
            }
     
        /**
        * @param weight kullanıcıdan alınan agırlık degeri
        * 
        */
        public static void calculate(float weight){ 
            
            float m= weight/9.81f; // Ağırlık=kütle x kütle çekim
            float newWeight=0;
            
            for(GEZEGEN g : values())
                System.out.println(g+" gezegenindeki agirliginiz: "+new DecimalFormat("##.##").format(m*g.gravityFactor).replace(',', '.'));
                // Display icin virgulden sonraki 2 basamak nokta ile gösterilir ve "m*g.gravityFactor" farklı gezegenlerden gelen farkli yercekimi katsayilari ile agirliklari hesaplar
        }
        
    }
    
    /*
            OLD CODE
    
    final static float[] planetGravity= new float[]{3.7f, 8.87f, 3.77f, 23.30f, 9.2f, 8.69f, 11f, 0.06f};
    final static String[] planetName = new String[]{"Merkur", "Venus", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluton"};
    
    public static void calculator(float weight){
        float m= weight/9.81f;  // Ağırlık=kütle x kütle çekim
        float newWeight;
        
        for(int i=0; i< planetName.length;i++){
            newWeight= m*planetGravity[i];
            System.out.println(planetName[i]+ " gezegenindeki agirliginiz: "+new DecimalFormat("##.##").format(newWeight).replace(',', '.'));
        }
    }
    */
   
    public static void main(String[] args) throws MyException {
        // TODO code application logic here
        float weight;
        Scanner scan = new Scanner(System.in);
                       
        while(true){          
            System.out.println("Agirlinizi giriniz: (Programı sonlandırmak icin 0 griniz)");
            try{
                weight = scan.nextFloat();
                if(weight == 0)
                    break;
                else{
                    //calculator(weight);
                    GEZEGEN.calculate(weight);
                }
            }catch(InputMismatchException ex){
                throw new MyException("YANLIS FORMATTA GIRDINIZ");
            }
            
        }
        
        
    }
    
}
