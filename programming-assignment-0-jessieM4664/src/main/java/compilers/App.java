package compilers;

/**
 * Hello world! and starter code
 * CSC416/565 - Compilers
 * West Chester University
 */
public class App 
{
    public static void main( String[] args )
    {
     //   System.out.println( "Hello World!" );
        System.out.println( helloWorld() );
     //   System.out.println( helloCustom("Java!") );
        System.out.println( helloCustom("Compilers Writers!") );
        System.out.println( addTwoNumbers(2, 3) );
    }

    /* returns the string "Hello World" */
    public static String helloWorld() {
        return "Hello World";
    }

    /*
     * TODO - fix this
     * Should return the string 'Hello ' concatenated with the parameter string s
     */
    public static String helloCustom(String s) {
        return "Hello " + s;
    }

    /*
     * TODO - fix this
     * Should return the sum of the two parameters m and n
     */
    public static int addTwoNumbers(int x, int y) {
        return x+y;
    }
}
