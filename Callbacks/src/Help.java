

public class Help implements CallBack {
    @Override
    public void callingBack(double a) {
        System.out.println("Use other callback.");
    }

    @Override
    public void callingBack(String s) {
        if (s.equals("help")|| s.equals("Help"))
        System.out.println("It`ll be ok. You`re good.");
        else
            System.out.println("i cannot help you.");
    }
}
