import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.apiUserClient.ServicesUserSteps;

@Feature("Add new  pet in store")
public class AddNewUserTest extends BaseTest2{
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();

    @Test(description = "Post data User ")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePosSimplePet(){
        apiClient.postUserSuccessfully(user);
    }

    @Test(description = "Post data User")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostFullPet() {
        apiClient.postUserSuccessfully(TestUtils.generateSimpleTemplateUser());
    }
}
