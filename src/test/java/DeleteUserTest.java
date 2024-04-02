import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.apiUserClient.ServicesUserSteps;
import test.data.User;

@Feature("Add new  pet in store")
public class DeleteUserTest extends BaseTest2{
    private ServicesUserSteps apiClient = ServicesUserSteps.getInstance();
    @Test(description = "delete User By Id ")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePosSimplePet(){
        User createTampungData = TestUtils.generateSimpleTemplateUser();
        apiClient.postUserSuccessfully(createTampungData);
        apiClient.deleteUserById(createTampungData.getUsername());
    }
}
