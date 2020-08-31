package org.example.suites;

import org.example.core.DriverFactory;
import org.example.testes.LoginTeste;
import org.example.testes.MovimentacoesTeste;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTeste.class,
        MovimentacoesTeste.class

})
public class SuiteTeste {
    @AfterClass
    public static void finalizaTudo(){
        DriverFactory.killDriver();
    }
}
