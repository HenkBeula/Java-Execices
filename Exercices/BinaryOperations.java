/**
 *
 * @author Henk Beula
 */
public class BinaryOperations {

    public static String addition(long bin1, long bin2){
        // Add two binary numbers
        int i = 0, rest = 0;
        String result = "";
        int[] sum = new int[20];
        while (bin1 != 0 || bin2 != 0) {
            sum[i++] = (int) ((bin1 % 10 + bin2 % 10 + rest) % 2);
            rest = (int) ((bin1 % 10 + bin2 % 10 + rest) / 2);
            bin1 = bin2 / 10;
            bin2 = bin2 / 10;
        }
        if (rest != 0) {
            sum[i++] = rest;
        }
        --i;
        while (i >= 0) {
            result += sum[i--];
        }
        return result;
    }

    public static String decimalToBinary(int decimal){
        int controler,y=1,j;
        int binary[]=new int[9999999];
        controler=decimal;
        String result = "";
        
        while(controler>0){
            binary[y++] = controler%2;
            controler = controler/2;
        }
        
        for(j=y-1;j>0;j--)
            result += binary[j];
        return result;
    }

    public static String decimalToHexadecimal(int decimal){
        int remindr;
        String hex_num="";
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        while(decimal>0){
            remindr=decimal%16;
            hex_num=hex[remindr]+hex_num;
            decimal=decimal/16;
        }
        return hex_num;
    }

    public static String decimalToOctal(int decimal){
        int j = 1, octal_num[] = new int[99999], rest;
        String result = "";
        rest = decimal;
        while (rest != 0) {
            octal_num[j++] = rest % 8;
            rest = rest / 8;
        }
        for (int i = j - 1; i > 0; i--)
            result += octal_num[i];
        return result;
    }

    public static long binaryToDecimal(int bin){
        return 0;
    }
}
