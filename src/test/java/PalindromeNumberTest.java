import junit.framework.TestCase;

public class PalindromeNumberTest extends TestCase {

    public void testProfit1(){
        int x = 121;
        boolean actual = Main.Solution.isPalindrome(x);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        int x = -121;
        boolean actual = Main.Solution.isPalindrome(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void testProfit3(){
        int x = 10;
        boolean actual = Main.Solution.isPalindrome(x);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}