package unittests;

import algorithm.ProximitySearchAlgo;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.FileUtils;

import java.io.IOException;

public class ProximitySearchAlgoTest {

   public static ProximitySearchAlgo proximitySearchAlgo;

    @BeforeTest
    public void initProximitySearch(){
        proximitySearchAlgo = new ProximitySearchAlgo();


    }

    @Test
    public void checkIfKeywordsNotExist() throws IOException {

        Assert.assertEquals(proximitySearchAlgo.proximitySearch("the","cammal",6, FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\input.txt")),0,"Validate Keywords Counts");


    }

    @Test
    public void checkValidKeywordsCountswithInput1() throws IOException {

        Assert.assertEquals(proximitySearchAlgo.proximitySearch("the","canal",6, FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\input.txt")),11,"Validating Keywords Counts");

    }

    @Test
    public void checkValidKeywordsCountswithInput2() throws IOException {

        Assert.assertEquals(proximitySearchAlgo.proximitySearch("the","canal",6, FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\input1.txt")),3,"Validating Keywords Counts");

    }

    @Test
    public void checkValidKeywordsCountswithInput3() throws IOException {

        Assert.assertEquals(proximitySearchAlgo.proximitySearch("the","canal",3, FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\input1.txt")),1,"Validating Keywords Counts");

    }


}
