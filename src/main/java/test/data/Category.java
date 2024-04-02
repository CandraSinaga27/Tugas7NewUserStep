package test.data;
import lombok.AllArgsConstructor;
import  lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data(staticConstructor = "category")
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class Category {
    private String id;
    private String name;
}
