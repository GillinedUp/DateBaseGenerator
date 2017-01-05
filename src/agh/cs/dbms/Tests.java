package agh.cs.dbms;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Yurii on 1/4/2017.
 */
public class Tests {

    @Test
    public void connectionTest() {
        Connector connector = new Connector();
        String userId = "vyzhha";
        String password = "MfkrCjXp";
        connector.connect(userId, password);
    }

}
