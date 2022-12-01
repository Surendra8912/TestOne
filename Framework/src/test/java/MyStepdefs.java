import io.cucumber.java.en.Given;

public class MyStepdefs {
    petShop reg = new petShop();
        @Given("User has to enter credentials")
        public void userHasToEnterCredentials() throws InterruptedException{
            reg.Main();
        }
}
