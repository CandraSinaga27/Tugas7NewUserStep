import io.qameta.allure.Feature;
import org.testng.annotations.Test;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
@Feature("test with existing pets")
public class CheckExistingPetTest extends BaseTest{
        private ServicesPetSteps apiClient = ServicesPetSteps.getInstance();

        @Test(description = "check all fileds for existing simple default pet")
        public void checkExistingSimplePet(){
            apiClient.uploadPetSuccessfully(pet).checkAllPetFields(pet);
        }
    }

