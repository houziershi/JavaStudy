package learn.my.java;

public interface MyInterface {
    void refresh(MyCallBack myCallBack);

    interface MyCallBack{
        void callback();
    }
}
