class Mergesort {
  public void merge()
  public void mergeSort(int st , int end, int[] nums){
    if(st >= end){
      return;
    }
    int mid = (st + end) / 2;
    mergeSort(st, mid, nums);  // LEFT PART
    mergeSort(mid + 1, end, nums);  // RIGHT PART
  }
    public int[] sortArray(int[] nums) {
      int end = nums.length - 1;
      mergeSort(0, end, nums);

    }
}                                                         