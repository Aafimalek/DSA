import java.util.*;
public class Solution {
    public static void nForest(int n) {
        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
                 
            }
         System.out.print("\n");
        }
       
    }
     public static void main(String[]args){
        Solution s1 = new Solution();
        s1.nForest(3);
    }
}
