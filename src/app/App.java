package app;

public class App {
    public static void main(String[] args) throws Exception {
        Simple obj = new Simple();
        System.out.println(obj.data); //Compile Time Error
        obj.msg();                    //Compile Time Error
    }
}
