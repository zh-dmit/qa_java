import com.example.Alex;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.mockito.Spy;

public class BaseTestCase {

    @Spy
    Feline felineSpy;

    Feline feline = new Feline();
    Lion lion = new Lion("Самец", felineSpy);
    Alex alex = new Alex("Самец", felineSpy);
    Cat cat = new Cat(felineSpy);

    public BaseTestCase() throws Exception {
    }
}
