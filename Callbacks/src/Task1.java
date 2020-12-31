
public class Task1 implements CallBack {

    @Override
    public void callingBack(double a) {
        if (a == 10)
            System.out.println("Все верно.");
        else
            System.out.println("Ответ неверный.");
    }

    @Override
    public void callingBack(String s) {
        System.out.println("Use other callback.");
    }
}
