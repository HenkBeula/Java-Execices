/*
The binarySearch method takes four parameters:

arr, a sorted array of int values
searchVal, an int value
start, a start index (inclusive)
end, an end index (exclusive)
The method should return the index of the occurrence of searchVal within the range of indices from start (inclusive) to end (exclusive), if there is one. 
Otherwise, it should return -1 to indicate that searchVal does not occur within the specified range of indices.

You can use the fact that the array is sorted to make this method very efficient. 
A simple base case is a range that does not contain any elements: this means that the searchVal does not occur in the range and -1 should be returned.

If the range is nonempty, check the element in the middle of the range. If it matches the searchVal, return its index: this is a successful search. 
Otherwise, see whether the middle element is greater than or less than the searchVal. 
If it's greater than the searchVal, then the searchVal must occur to the left of the middle element. 
Otherwise, it must occur to the right of the middle element. A recursive call can then be used to continue the search.
*/
public static int binarySearch(int[] arr, int searchVal, int start, int end) {
  int middle = (start+end)/2;

  if(arr[middle] == searchVal)
    return middle;

  if (start >= end){
    return -1;
  }else{
    if(arr[middle]>searchVal){
      return binarySearch(arr, searchVal, 0, middle-1);
    }
    else if(arr[middle]<searchVal){
      return binarySearch(arr, searchVal, middle+1, end-1);
    }
  }
  return 0;//unknown error
}
