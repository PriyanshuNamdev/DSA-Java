class Solution {
    public boolean isPalindrome(int x) {
        String intStr = Integer.toString(x);
        StringBuilder newStr = new StringBuilder(); 
        int a = intStr.length() - 1;

        for (int i = 0; i < intStr.length(); i++) {
            newStr.append(intStr.charAt(a--));
        }

        return intStr.equals(newStr.toString());
    }
}
