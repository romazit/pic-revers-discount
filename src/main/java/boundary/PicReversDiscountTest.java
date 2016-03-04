package boundary;
/**
 *
 * @author romanm
 */
public class PicReversDiscountTest {

    public static void main(String[] args) {
        PicReversDiscount picReversDiscount = new PicReversDiscount();
        System.out.println("1 "+picReversDiscount.getPicReversDiscount1Places(111.00, 11.00));
        System.out.println("2 "+picReversDiscount.getPicReversDiscount2Places(111.00, 11.00));
        System.out.println("3 "+picReversDiscount.getPicReversDiscount3Places(111.00, 11.00));       
    }

}
