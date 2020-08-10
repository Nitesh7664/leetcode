//Power of Four

class Solution {
   public boolean isPowerOfFour(int num) {
       while(num > 1 && num % 4 == 0){
           num = num / 4;
       }
       return num == 1;
   }
}