import java.util.Scanner;

class SortedSquare {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
      int n = in.nextInt();
      int nums[] = new int[n];
      int answer[] = new int[n];

      int index = n-1;
      int i=0;
      int j = n-1;

      while (i <= j){
        if (Math.abs(nums[i]) > Math.abs(nums[j])){
          answer[index] = nums[i] * nums[i];
          i++;
        }
        else {
          answer[index] = nums[j] * nums[j];
          j--;
        }
        index++;
      }
      System.out.print(answer + " ");
  }
}