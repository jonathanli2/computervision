package test;
import lib2.MyLib2;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String version = System.getProperty("java.version");
        System.out.println("version:" + version);
    
        MyLib2 lib2 = new MyLib2();
        int aaa = lib2.times(1, 3);
        System.out.println(aaa);

        DocTypeFinder docTypeFinder = new DocTypeFinder();
        docTypeFinder.detectDocType();
    }
}
