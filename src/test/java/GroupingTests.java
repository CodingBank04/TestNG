import org.testng.annotations.Test;

public class GroupingTests {
    @Test (groups = {"SmokeTest"})
    public void test1() {
        System.out.println("test 1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test 2 executed");

    }
    @Test (groups = {"SmokeTest"})
    public void test3() {
        System.out.println("test 3 executed");

    }
    @Test
    public void test4() {
        System.out.println("test 4 executed");

    }
}
