package lesson11.Lession11_1;

public class ProjectC extends TestRelAttributes{
    public void testSth(){
        testRelAttribute();
    }

    @Override
    protected String customsRelAttributes() {
        return "xyz";
    }
}
