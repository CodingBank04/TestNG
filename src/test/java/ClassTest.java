import org.testng.annotations.Test;

public class ClassTest {
    String URL;
    String item;

    public ClassTest(String URL, String item) {
        this.URL = URL;
        this.item = item;
        System.out.println(URL);
        System.out.println(item);
    }


    @Test
    public void test2(){
        System.out.println("test2 + " + URL + "and username : " + item);
    }


    @Test
    public void test3(){
        System.out.println("test3 + " + URL + "and username : " + item);
    }
}
