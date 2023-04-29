package util;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class Listeners implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Hey I am a Listener and you have started the execution");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Hey I am a Listener and execution has ended");
    }
}
