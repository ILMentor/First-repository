public class SomeClass {
    CallBack callback;

    void registerCallBack(CallBack cbi){
        this.callback = cbi;
    }
     double doSomething(double a, double b){
        callback.callingBack(a * b);
        return a * b;
    }
    void doSomething(String s){
        callback.callingBack(s);
    }
}
