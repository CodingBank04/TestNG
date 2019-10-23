import org.testng.annotations.Factory;

public class TestFactoryClass {
      @Factory
    public Object[] factory(){
          return new Object[]{new ClassTest("www.google.com","book"),new ClassTest("www.google.com","magazine")};

      }
}
