
public class Solution {
	
	public static void main(String []args){
		Solution sl = new Solution();
		System.out.println(sl.isPalindrome(11));
	}
    public boolean isPalindrome(int x) {
        
        if (x < 0 || x == Integer.MAX_VALUE) {
            
            return false;
            
        }
        
        int len = 0;
        int n = x;
        
        while (n != 0) {
            
            n /= 10;
            len++;
            
        }
        
        for (int i = 1; i < len / 2 + 1; i++) {
            
            if (x % Math.pow(10, i) != x / Math.pow(10, len - i)) {
                System.out.println("(x % Math.pow(10, i) "+x % Math.pow(10, i));
                System.out.println("x / Math.pow(10, len - i) "+x / Math.pow(10, len - i));
                return false;
                
            }
            
        }
        
        return true;
        
    }
}