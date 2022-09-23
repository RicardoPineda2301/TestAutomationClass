package testng.listeners.itestlistener.isuitelistener;

import org.testng.ISuite;

public class SuiteListener implements org.testng.ISuiteListener{

    public void onStart(ISuite suite){
        System.out.println("--> Method on Start" + suite.getName());
    }

    public void onFinish(ISuite suite){
        System.out.println("--> Method on Start" + suite.getName());
    }
}
