import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;

@Feature("Add new  pet in store")
public class AddNewPetTest extends BaseTest{
    private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

    @Test(description = "Validation adding default pet to store")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePosSimplePet(){
        apiClient.uploadPetSuccessfully(pet);
    }

    @Test(description = "Validation adding pet with all fields")
    @Severity(SeverityLevel.CRITICAL)
    public void checkPositivePostFullPet() {
        apiClient.uploadPetSuccessfully(TestUtils.generateFullTemplate());
    }
}
