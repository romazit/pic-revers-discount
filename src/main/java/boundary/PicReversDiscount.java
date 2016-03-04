package boundary;

import java.text.NumberFormat;
import javax.ejb.Stateless;

/**
 *
 * @author romanm
 */

@Stateless
public class PicReversDiscount {

    
    
    String result = "";
    String version = "version-7";
    
    public PicReversDiscount(){
        
    }
    /*
    public static void main(String[] args) {
        PicReversDiscount picReversDiscount = new PicReversDiscount();
        String str = picReversDiscount.getPicReversDiscount(100.00, 67.50);
        System.out.println(str);
    }
    */
     
    public String getName(){
        return "Ala";
    }
    
    public String getPicReversDiscount3Places(double priceBefore, double priceAfter){
     
    double disc1Value = 0.0;
    double disc1Price = 0.0;
    double disc2Value = 0.0;
    double disc2Price = 0.0;
    double disc3Value = 0.0;
    double disc3Price = 0.0;
    double diff    = 0.0;
    double diffTmp = priceAfter;
    

        /*
        double disc1 = 0.04;  //discount %
        double disc1Value = priceBefore*disc1;    //discount value
        double disc1Price = priceBefore - disc1Value;   //price after discount1
        
        double disc2 = 0.14;
        double disc2Value = disc1Price*disc2;
        double disc2Price = disc1Price - disc2Value;
        
        double disc3 = 0.19;
        double disc3Value = disc2Price*disc3;
        double disc3Price = disc2Price - disc3Value;
       
        System.out.println(disc1Value);
        System.out.println(disc2Value);
        System.out.println(disc3Value);
        
        System.out.println(disc1Price);
        System.out.println(disc2Price);
        System.out.println(disc3Price);
        
        */
        
        //  i1/i2/i3
        for (int i1 = 1; i1 < 100; i1++) {
            for (int i2 = 1; i2 < 100; i2++) {
                for (int i3 = 0; i3 < 100; i3++) {
         

                    
        disc1Value = priceBefore*i1/100;    //discount value
        disc1Price = priceBefore - disc1Value;   //price after discount1
        
        disc2Value = disc1Price*i2/100;
        disc2Price = disc1Price - disc2Value;
        
        disc3Value = disc2Price*i3/100;
        disc3Price = disc2Price - disc3Value;
                    
                    
        //System.out.println(i1+"-"+i2+"-"+i3+"---"+disc2Price);
         
        diff = priceAfter - disc3Price;
        
                    if (Math.abs(diff) < diffTmp) {
                        diffTmp = Math.abs(diff);

                            
                        result = " " +i1 +" / "+ i2 +" / "+ i3 + "<br>diff="+getDoubleFormat(diff)+ "<br>"+version;
                        //System.out.println(result);
                    }
                    
                }
            }

        }//end i1
        
        //System.out.println("result=" +result);
       
        return result;
    }
    
    
    public String getPicReversDiscount2Places(double priceBefore, double priceAfter){
     
    double disc1Value = 0.0;
    double disc1Price = 0.0;
    double disc2Value = 0.0;
    double disc2Price = 0.0;
    double diff    = 0.0;
    double diffTmp = priceAfter;
    
        
        //  i1/i2/i3
        for (int i1 = 1; i1 < 100; i1++) {
            for (int i2 = 1; i2 < 100; i2++) {
         

                    
        disc1Value = priceBefore*i1/100;    //discount value
        disc1Price = priceBefore - disc1Value;   //price after discount1
        
        disc2Value = disc1Price*i2/100;
        disc2Price = disc1Price - disc2Value;
                     
                    
        //System.out.println(i1+"-"+i2+"-"+i3+"---"+disc2Price);
         
        diff = priceAfter - disc2Price;
        
                    if (Math.abs(diff) < diffTmp) {
                        diffTmp = Math.abs(diff);

                            
                        result = " " +i1 +" / "+ i2 +" / "+ 0 + "<br>diff="+getDoubleFormat(diff)+ "<br>"+version;
                        //System.out.println(result);
                    }
                    
                
            }

        }//end i1
        
        //System.out.println("result=" +result);
        
       return result;
    }
    
    
    
    public String getPicReversDiscount1Places(double priceBefore, double priceAfter){
     
    double disc1Value = 0.0;
    double disc1Price = 0.0;
    double diff    = 0.0;
    double diffTmp = priceAfter;
    
        
        //  i1/i2/i3
        for (int i1 = 1; i1 < 100; i1++) {

         

                    
        disc1Value = priceBefore*i1/100;    //discount value
        disc1Price = priceBefore - disc1Value;   //price after discount1
                     
                    
        //System.out.println(i1+"-"+i2+"-"+i3+"---"+disc2Price);
         
        diff = priceAfter - disc1Price;
        
                    if (Math.abs(diff) < diffTmp) {
                        diffTmp = Math.abs(diff);

                            
                        //result = " " +i1 +" / "+ 0 +" / "+ 0 + "<br>diff="+diff+ "<br>"+version;
                        result = " " +i1 +" / "+ 0 +" / "+ 0 + "<br>diff="+getDoubleFormat(diff)+ "<br>"+version;
                        //System.out.println(result);
                    }
                    
                
 

        }//end i1
        
        //System.out.println("result=" +result);
        
       return result;
    }
    
    public String getDoubleFormat(double d) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(6);
        return nf.format(d);
    }

}
