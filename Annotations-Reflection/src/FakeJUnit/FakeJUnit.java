package FakeJUnit;

public class FakeJUnit {
    public static boolean assertEquals(int expected, int result){
        return expected == result;
    }
    public static boolean assertEquals(String expected, String result){
        return expected.equals(result);
    }
    public static boolean assertEquals(boolean expected, boolean result){
        return expected == result;
    }
}
