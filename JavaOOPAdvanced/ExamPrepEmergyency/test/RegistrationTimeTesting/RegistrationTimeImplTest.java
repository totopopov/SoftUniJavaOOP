package RegistrationTimeTesting;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import utils.RegistrationTime;
import utils.RegistrationTimeImpl;

public class RegistrationTimeImplTest {

    private RegistrationTime registrationTime;

    @Before
    public void setUp() throws Exception {
        this.registrationTime=new RegistrationTimeImpl("12:24 25/02/2016");
    }

    @Test
    public void getHour() throws Exception {
        Assert.assertEquals(Integer.valueOf(12),this.registrationTime.getHour());
    }

    @Test()
    public void getMinutes() throws Exception {
        Assert.assertEquals(Integer.valueOf(24),this.registrationTime.getMinutes());
    }

    @Test
    public void getDay() throws Exception {
        Assert.assertEquals(Integer.valueOf(25),this.registrationTime.getDay());
    }

    @Test
    public void getMonth() throws Exception {
        Assert.assertEquals(Integer.valueOf(2),this.registrationTime.getMonth());
    }

    @Test
    public void getYear() throws Exception {
        Assert.assertEquals(Integer.valueOf(2016),this.registrationTime.getYear());
    }

}