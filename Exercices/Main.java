public class Main{
    //solution for some exercises 
    
    public static String move2end(java.lang.String str, java.lang.Integer n) {
        if(str.length()<3)
            return str;
        else
            return str.substring(n, str.length()) + str.substring(0, n);    
    }

    public static String cutMiddle(String s){
        if(s.length() % 2 == 0){
            return s.substring(0, (s.length()/2)-1) + s.substring((s.length()/2)+1, s.length());
        }
        return s.substring(0, (s.length()/2)) + s.substring((s.length()/2)+1, s.length());
    }

    public static String doubleChar(String s){
        String result = "";
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            result += chars[i];
            result += chars[i];
        }
         return result;
     }
     
    public static int countNumChar(String s, char ch){
        int repetitions =0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==ch)
                repetitions++;
        }
        return repetitions;
    }      

    /*public static int countNumString(String s, String find){
        int v =0;
        if(s.contains(find)){
            System.out.println(v++);
        }
        return 0;
    }*/
    
    public static String everyOtherChar0(String s){
        char[] chars = s.toCharArray();
        String result = "";

        for (int i = 0; i < chars.length; i+=2) {
            result += chars[i];
        }
        return result;
    }     

    public static int countCharsAfterFirst(String s, char ch1, char ch2){
        int repetitions =0, firstOccor=0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==ch1){
                repetitions++;
                firstOccor=i;
                break;
            }
        }
        if(repetitions>0){
            repetitions=0;
            for (int i = firstOccor; i < chars.length; i++) {
                if(chars[i]==ch2){
                    repetitions++;
                }
            }
            return repetitions;
        }
        return 0;
    }


    public static int countCharsOutsideRange(String s, char ch, int start, int end){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i>=start && i<end)
                continue;
            else if(s.charAt(i)==ch)
                count++;
        }
        return count;
    }
    
    public static int countCharsInRange(String s, char ch, int start, int end){
        int count = 0;
        for (int i = start; i < end && i<s.length(); i++) {
            if(i>=start && i<end && s.charAt(i)==ch)
                count++;
        }
        return count;
    }
    
    public static int countA(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a')
                count++;
        }return count;
    }

    public static String reverse(String s){
        if(s.length()==1)
            return s;
        return reverse(s.charAt(s.length()-1));
    }

    /*public static boolean containsNM(int[] arr, int n, int m){
        boolean containsN  = false, containsM = false;
        for (int i : arr) {
            if(i==n)
                containsN=true;
            if(i==m)
                containsM=true;
        }
        return (containsM && containsN);
    }*/

    public static boolean containsNM(int[] arr, int n, int m){
        boolean contains = false, containsN  = false, containsM = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==n && arr[i+1]==m || arr[i]==m && arr[i+1]==n){
                return false;
            }
        }
        for (int i : arr) {
            if(i==n)
                containsN=true;
            if(i==m)
                containsM=true;
        }
        return (containsM && containsN);
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int elmt : arr) {
            if(elmt < min) {
                min = elmt;
            }
        }
        return min;
    }

    public static int minIndex(int[] arr){
        int min = Integer.MAX_VALUE, minIndex=0, index=0;
        while(index < arr.length) {
            if(arr[index] < min) {
                min=arr[index];
                minIndex = index;
                //break;
            }
            index++;
        }
        return minIndex;
    }
    
    public static int findSum(int[] arr) {
        int sum = 0;
        for(int elmt : arr){
            sum += elmt;
        }
        return sum;
    }
    
    public static boolean lessThan10(int n){
        return (n < 10) ? true: false;
    }
    
    //Return true if s does not contains the char 'a'
    public static boolean notContainsA(String s) {
        return !s.contains("a");
    }
    
        /*public static boolean isAlpha(String s){
        String [][] dictionary = {{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}, 
                                  {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26",}};
        int [] coresp = new int[s.length()*2];
        int j=0, controler=0;
        for (int i = 0; i < s.length(); i++) {
            for (int col = 0; col < 26; col++) {
                if(s.charAt(i)==dictionary[0][col].charAt(0)){
                    coresp[j++] = Integer.valueOf(dictionary[1][col]);
                    controler++;
                }
            }
        }

        for (int i = 0; i < controler-1; i++) {
            System.out.println(coresp[i] + " " + coresp[i+1]);
            if(coresp[i]<=coresp[i+1]){
                
                continue;
            }
            else
              return false;
        }
           return true;
    }      */

    public static boolean isAlpha(String s){
        char [] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]>chars[i+1])
                return false;
        }
        return true;
    }
}
