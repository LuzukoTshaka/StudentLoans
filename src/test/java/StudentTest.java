import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    private UnderGrad underGrad;
    private PostGrad postGrad;

    @Before
    public void setUp() throws Exception {
        underGrad = new UnderGrad(200);
        postGrad = new PostGrad(500);
    }

    @Test
    public void setUnderGrad(){

        int totalAmount = underGrad.loan(300);

        Assert.assertEquals(500,totalAmount);
    }

    @Test
    public void setPostGrad(){

        int totalAmount = postGrad.loan(600);
        Assert.assertEquals(1100,totalAmount);

    }
}