package unittests;

import algorithm.ProximitySearchApp;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import validationexception.EmptyFileException;
import validationexception.RangeNotValidException;

import java.io.IOException;

public class ProximitySearchAppTest {

   public static ProximitySearchApp proximitySearchApp;

    @BeforeTest
    public void initProximitySearch(){
        proximitySearchApp = new ProximitySearchApp();
    }
    @Test
    public void checkInvalidRange() throws IOException, EmptyFileException {

        try {
            proximitySearchApp.runProximitySearch("the","canal",1,"\\src\\main\\resources\\data\\input.txt",true);
        } catch (RangeNotValidException e) {
            Assert.assertTrue(true,"Expected Range Not valid Exception");
        }

    }

    @Test
    public void emptyFileExceptionTest() throws IOException ,RangeNotValidException{

        try {
            proximitySearchApp.runProximitySearch("the","canal",3,"\\src\\main\\resources\\data\\emptyFile.txt",true);
        } catch (EmptyFileException e) {
            Assert.assertTrue(true,"Expected EmptyFile Exception");
        }

    }


}
