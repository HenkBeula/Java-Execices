puiblic class Arrays{
    public static boolean isSorted(int[] arr){
        boolean isAscendent = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                isAscendent = false;
                break;
            }
        }
           return isAscendent;
    }
}
