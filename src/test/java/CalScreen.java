import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalScreen {
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_0")
    AndroidElement btn0;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_1")
    AndroidElement btn1;

    @FindBy(id= Setup.PACKAGE_ID+":id/digit_2")
    AndroidElement btn2;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_3")
    AndroidElement btn3;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_4")
    AndroidElement btn4;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_5")
    AndroidElement btn5;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_8")
    AndroidElement btn8;
    @FindBy(id= Setup.PACKAGE_ID+":id/digit_9")
    AndroidElement btn9;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_add")
    AndroidElement btnAdd;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_sub")
    AndroidElement btnSub;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_mul")
    AndroidElement btnMul;

    @FindBy(id=Setup.PACKAGE_ID+":id/op_div")
    AndroidElement btnDiv;

    @FindBy(id=Setup.PACKAGE_ID+":id/eq")
    AndroidElement btnEquals;

    @FindBy(id=Setup.PACKAGE_ID+":id/clr")
    AndroidElement btnClear;

    @FindBy(id=Setup.PACKAGE_ID+":id/result_final")
    AndroidElement resultFinal;



    public CalScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public String doSum() throws InterruptedException{
        btn9.click();
        btnAdd.click();
        btn5.click();
        btnEquals.click();
        return resultFinal.getText();
    }

    public String doSub() throws InterruptedException{
        btn8.click();
        btnSub.click();
        btn3.click();
        btnEquals.click();
        return resultFinal.getText();
    }
    public String doMul() throws InterruptedException{
        btn1.click();
        btn4.click();
        btnMul.click();
        btn5.click();
        btnEquals.click();
        return  resultFinal.getText();
    }
    public String doDiv() throws InterruptedException{

        btnDiv.click();
        btn1.click();
        btn0.click();
        btnEquals.click();
        return resultFinal.getText();
    }
    public String doSolve() throws InterruptedException{
        btn1.click();
        btn0.click();
        btn0.click();
        btnAdd.click();
        btn2.click();
        btn0.click();
        btn0.click();
        btnSub.click();
        btn1.click();
        btn0.click();
        btn0.click();
        btnMul.click();
        btn2.click();
        btnDiv.click();
        btn5.click();
        btnEquals.click();
        return resultFinal.getText();
    }


}
