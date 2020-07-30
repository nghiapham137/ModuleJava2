import java.lang.reflect.Method;

public class View {
    public static void main(String[] args) {

        Fan fan = new Fan(3,true,10,"yellow");
        Fan fan1 = new Fan(2,false,5,"blue");

        System.out.println(fan.toString());
        System.out.println(fan1.toString());

    }
}
