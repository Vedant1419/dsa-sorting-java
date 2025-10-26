
import java.util.ArrayList;
import java.util.Collections;

class Charfreq {
    public String frequencySort(String s) {
        int freq[] = new int[256];
        int n = s.length();

        for(int i=0; i<n; i++){
          char currentcharacter = s.charAt(i);
          int val = currentcharacter;
          freq[val]++;
        }

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0; i<256; i++){

          if(freq[i] != 0) {
          ArrayList<Integer> currentrow = new ArrayList<>();
          currentrow.add(i);
          currentrow.add(freq[i]);

          arr.add(currentrow);
        }
    }

    Collections.sort(arr, (x,y) -> Integer.compare(x.get(1), y.get(1)));
    Collections.reverse(arr);

    StringBuilder str = new StringBuilder();
    
    for(int i=0; i<arr.size(); i++){

      int frequency = arr.get(i).get(1);
      char ch = (char)(int)(arr.get(i).get(0));

      while(frequency > 0){
        str.append(ch);
        frequency--;

      }
    }
    return str.toString();
}
}
