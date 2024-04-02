package test.apiUserClient;

import io.qameta.allure.Step;
import io.restassured.internal.RestAssuredResponseImpl;
import io.restassured.response.Response;
import test.TestUtils;
import test.apiPetClient.ServicesPetSteps;
import test.data.Pet;
import test.data.User;

import static org.assertj.core.api.Assertions.assertThat;

public class ServicesUserSteps extends UserBaseApiClient{
    private static ServicesUserSteps client;

    public static ServicesUserSteps getInstance() {
        if (client == null) {
            synchronized (ServicesPetSteps.class) {
                if (client == null) {
                    client = new ServicesUserSteps();
                }
            }
        }
        return client;
    }


    @Step("Check correct status {status}")
    public ServicesUserSteps checkStatusResponse(int status, Response response){
        assertThat(((RestAssuredResponseImpl) response).getStatusCode()).isEqualTo(status);
        return this;
    }
    @Step("Get user")
    public User getUserByUsername(String UserId){
        Response response = getUser(UserId);
        checkStatusResponse(200, response);
        return response.as(User.class);
    }

    @Step("Post User")
    public ServicesUserSteps postUserSuccessfully(User user) {
        Response response = postUser(user);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Delete User")
    public ServicesUserSteps deleteUserById(String userName) {
        Response response = deleteUser(userName);
        checkStatusResponse(200, response);
        return this;
    }

    @Step("Update User")
    public ServicesUserSteps updateUserSuccessfully(String userName) {
        User tampungDataUsername = getUserByUsername(userName);
        tampungDataUsername.setFirstname(TestUtils.getRandomWord());
        //User updateUser = TestUtils.generateSimpleTemplateUser();
        Response response = putUser(tampungDataUsername,userName);
        checkStatusResponse(200, response);
        return this;
    }


}
