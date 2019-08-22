package unittests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.FileUtils;

import java.io.IOException;

public class FileUtilsTest {

   public static FileUtils fileUtils;

    @BeforeTest
    public void initProximitySearch(){
        fileUtils = new FileUtils();


    }

    @Test
    public void checkIfFileNotExist()  {

        try {
            FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\abc.txt");
        } catch (IOException e) {
            Assert.assertTrue(true,"Given File " + System.getProperty("user.dir")+"\\src\\main\\resources\\data\\abc.txt" + "is Not found");
        };
    }

     @Test
    public void checkIfContentExistInGivenFile() throws IOException {

        String[] content = FileUtils.readFileAsString(System.getProperty("user.dir")+"\\src\\main\\resources\\data\\input.txt");
        Assert.assertTrue(content.length > 1 ,"Content Exist in the file");

     }


}
