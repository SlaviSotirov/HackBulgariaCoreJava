package ClassInfo;



@ClassInfoAnnotation (
    author="Johnny",
    revision=2,
    checked=true,
    related={TestClass.class}   
)
public class TestClass {
    private String s;
    private int i;
    
    public TestClass(String s, int i) {
        this.s = s;
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
    
}
