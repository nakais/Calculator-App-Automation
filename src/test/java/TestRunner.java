import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup{
    @Test(priority = 1, description = "Sum of 2 number")
    public void doSum() throws InterruptedException {
        CalScreen calScreen = new CalScreen(driver);
        String sum = calScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum,"14");
    }

    @Test(priority = 2,description = "Sub of 2 number")
    public void doSub() throws InterruptedException {
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();
        String sum = calScreen.doSub();
        System.out.println(sum);
        Assert.assertEquals(sum,"5");
    }
    @Test(priority = 3,description = "Mul of 2 number")
    public void doMul() throws InterruptedException{
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();
        String sum = calScreen.doMul();
        System.out.println(sum);
        Assert.assertEquals(sum,"70");

    }
    @Test(priority = 4 , description = "Div of 2 number")
    public void doDiv() throws InterruptedException{
        CalScreen calScreen = new CalScreen(driver);
        String sum = calScreen.doDiv();
        System.out.println();
        Assert.assertEquals(sum,"7");
    }
    @Test(priority = 5 , description = "Solve of multiple number")
    public void doSolve() throws InterruptedException{
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();
        String sum = calScreen.doSolve();
        System.out.println();
        Assert.assertEquals(sum,"260");
    }

   /*
   @AfterMethod
    public void clearScreen(){
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();

    }
    */

}

