import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static Object mostFrequentChar(String s) {
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      int temp =0;
      int max = 0;
      Object ans = null;
      for (char a: s.toCharArray()){
        if(!map.containsKey(a)){
          map.put(a, 1);
        }else{
          map.put(a, ((int)map.get(a)+1));
        }
      }

      Object[] charArr = map.keySet().toArray();
      for (int i = 0; i< charArr.length;i++){
        if((int)map.get(charArr[i]) >= max){
          ans = charArr[i];
          max = (int)map.get(charArr[i]);
        } 
      }
      return ans;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("david")); // -> 'e'
    }

  }
