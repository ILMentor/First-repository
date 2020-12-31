import javax.security.auth.callback.Callback;

public class Main {

    public static void main(String[] args) {
        SomeClass someclass = new SomeClass();
        Task1 task = new Task1();
        someclass.registerCallBack(task);
        someclass.doSomething("help");
    }
}
