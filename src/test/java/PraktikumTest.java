import io.qameta.allure.junit4.DisplayName;
import jdk.jfr.Description;
import org.junit.Test;


import static org.junit.Assert.*;


public class PraktikumTest {

    public static void main(String[] args) {
        Account account = new Account("Елизаветта Моргендт");
        account.checkNameToEmboss();
        System.out.println(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Checking for whitespace at the string")
    public void checkSpaceAtString() {
        Account account = new Account("Елизаветта Моргендт");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Checking for whitespace at the beginning of a string")
    public void checkSpaceAtBeginString() {
        Account account = new Account(" Елизаветта Моргендт");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Checking for whitespace at the end of a string")
    public void checkSpaceAtEndString() {
        Account account = new Account("Елизаветта Моргендт ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Checking for whitespace at the beginning and end of a string")
    public void checkSpaceAtBeginAndEndString() {
        Account account = new Account(" Елизаветта Моргендт ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check for the maximum number of characters in a string.")
    public void checkMaximumCharInString() {
        Account account = new Account("Елизаветтааа Моргендт");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Check for the minimum number of characters in a string.")
    public void checkMinimumCharInString() {
        Account account = new Account("Е А");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Checking a string without a space.")
    public void checkStringWithoutSpace() {
        Account account = new Account("ЕлизаветтаМоргендт");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("Empty string check.")
    public void checkEmptyString() {
        Account account = new Account("");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("This test checks functionality that doesn't exist yet. Latin string check.")
    public void checkLatinString() {
        Account account = new Account("Darth Vader");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("This test checks functionality that doesn't exist yet. Checking a string of numbers.")
    @Description("The test fails: when the string contains numbers," +
            " the test should return false, but the test returns true.")
    public void checkStringNumbers() {
        Account account = new Account("77777 99999");
        System.out.println(account.checkNameToEmboss());
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    @DisplayName("This test checks functionality that doesn't exist yet. Check for a string that contains special characters.")
    @Description("The test fails because the string contains invalid characters, " +
            "and the test returns true.")
    public void checkStringContainsSpecialChar() {
        Account account = new Account("@$%#&*() :|?><<,./");
        System.out.println(account.checkNameToEmboss());
        assertFalse(account.checkNameToEmboss());
    }
}

