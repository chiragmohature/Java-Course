class Palindrome
{
    static boolean isPalindrome(int n)
    {
        if (n % 11 == 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(55) ? "Palindrome" : "Not Palindrome");
    }
}