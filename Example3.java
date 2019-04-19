public class Example3{
    // two functions are the same if they have same name, same return type, same number and type of inputs
    public static int sum(int x, int y){
        int result = x+y;
        return result;
    }
    // overloading a method/function
    public static String sum(String x,String y){
        return x + y;
    }
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        String s1 = "Hello";
        String s2 = " world";
        System.out.println("a + b = " + sum(a,b));
        System.out.println("s1 + s2 = " + sum(s1,s2));
    }
}