package test.data;
import lombok.AllArgsConstructor;
import  lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private String id;
    private String username;
    private String Firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private String userstatus;
}
