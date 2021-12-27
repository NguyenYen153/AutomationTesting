package lesson11.Lession11_1;

public abstract class TestRelAttributes {
        protected void testRelAttribute(){
            String customsRelAttributes = customsRelAttributes();
            String expectedRelAttribute = customsRelAttributes == null ?"Expected result" : customsRelAttributes();
            System.out.println(expectedRelAttribute);
        }
        //
        protected String customsRelAttributes(){
            return null;
        }

}