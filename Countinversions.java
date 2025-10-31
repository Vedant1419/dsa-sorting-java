
import java.util.ArrayList;

class Countinversions {
  static int merge(int arr[], int start, int mid, int end) {
    int count = 0;
    ArrayList<Integer> sortedMerge = new ArrayList<>();

    int i = start;
    int j = mid + 1;

    while (i<=mid && j <= end){
      if(arr[i] <= arr[j]){
        sortedMerge.add(arr[i]);
        i++;
      }
      else {
        count += (mid - i + 1);
        sortedMerge.add(arr[j]);
        j++;
      }
    }
    while (i <= mid){
      sortedMerge.add(arr[i]);
      i++;
    }

    while (j <= end){
      sortedMerge.add(arr[j]);
      j++;
    }

    int index = 0;
    for (int k=start; k<=end; k++){
      arr[k] = sortedMerge.get(index);
      index++;
    }

    return count;
  }

  static int mergeSort(int start, int end, int arr[]){
    if (start == end){  // base case
      return 0;
    }

    int mid = (start + end) / 2;

    int leftInversion = mergeSort(start, mid, arr); // left part of array
    int rightInversion = mergeSort(mid + 1, end, arr); // right part of array

    int mergeInversion = merge(arr, start, mid, end);
    int answer = leftInversion + rightInversion + mergeInversion;
    return answer;


  }
    static int inversionCount(int arr[]) {
      int n = arr.length;
      return mergeSort(0, n-1, arr);
    }
}