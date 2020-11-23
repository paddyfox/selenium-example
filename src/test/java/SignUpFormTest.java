import org.junit.Test;

import framework.FunctionalTest;
import pages.ReceiptPage;
import pages.SignUpPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignUpFormTest extends FunctionalTest {

    @Test
    public void signMeUp() {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);
        assertTrue(signUpPage.isInitialised());

        signUpPage.enterName("Paddy", "Fox");

        ReceiptPage receiptPage = signUpPage.submit();

        assertEquals("Thank you", receiptPage.confirmationHeader());
    }
}
