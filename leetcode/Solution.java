class Solution 
{
    public boolean isPalindrome(int x) 
    {
        String a = String.valueOf(x);
        int l = a.length();
        int count = 0;
        for (int i = 0; i<l/2;i++) 
        {
            if (a.charAt(i)==a.charAt(l-i-1)) 
            {
                count++;
            }
        }
        return count==l/2;
}
}