import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;



public class AnimalTest {

    Animal a1;
    @Before
    public void setup()
    {
         a1 = new Animal("Max",2,new ItFlys());
    }
    @Test
    public void testToString() throws Exception {
        String expected = "Animal{name='Max', age=2, flyable=I can fly sooooo high!!!}";
        Assert.assertEquals(expected,a1.toString());
    }

    @Test
    public void getName() throws Exception {
        String expected = "Max";
        Assert.assertEquals(expected,a1.getName());

    }

    @Test
    public void setName() throws Exception {
        a1.setName("Bus");
        String expected = "Bus";
        Assert.assertEquals(expected,a1.getName());

    }

    @Test
    public void getAge() throws Exception {
        int expected = 2;
        Assert.assertEquals(expected,a1.getAge());
    }

    @Test
    public void setAge() throws Exception {
        a1.setAge(3);
        int expected = 3;
        Assert.assertEquals(expected,a1.getAge());
    }

    @Test
    public void getFlyable() throws Exception {
        ItFlys expected = new ItFlys();
       assertThat(expected,instanceOf(a1.getFlyable().getClass()));
    }

    @Test
    public void setFlyable() throws Exception {
        a1.setFlyable(new CantFly());
        CantFly expected = new CantFly();
        assertThat(expected,instanceOf(a1.getFlyable().getClass()));
    }

}