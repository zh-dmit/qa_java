import com.example.Alex;
import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.mockito.Mockito;


public class BaseTestCase {

    Feline felineSpy = Mockito.spy(new Feline());

    Feline feline = new Feline();
    Lion lion = new Lion("Самец", felineSpy, felineSpy);
    Alex alex = new Alex(felineSpy, felineSpy);
    Cat cat = new Cat(felineSpy);

    public BaseTestCase() throws Exception {
    }
}
