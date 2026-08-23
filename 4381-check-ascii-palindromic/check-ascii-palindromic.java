class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary = new StringBuilder();

        for(char ch:s.toCharArray()){
            String str=Integer.toBinaryString(ch);

            while(str.length()<8){
                str="0"+str;
            }
            binary.append(str);
        }
        int left=0;
        int right=binary.length()-1;

        while(left<right){
            if(binary.charAt(left)!=binary.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}