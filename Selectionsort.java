class Selectionsort {
  public static void main(String[] args) {
      int arr[] = {8,1,3,2,5};
      int n = arr.length;

      for(int i=0; i<n-1; i++){

        int pos = i;
        int minElement =arr[i];
        int index = i;

        for(int j=i+1; j<n; j++){
          if (arr[j] < minElement){
            minElement = arr[j];
            index = j;
          }
        }
        int temp = arr[pos];
        arr[pos] = arr[index];
        arr[index] = temp;
      }
      for(int i=0; i<n; i++) {
        System.out.print(arr[i] + " ");
      }
  }
}