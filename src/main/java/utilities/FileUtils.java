package utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {


    /*
    *  @param   filePath
    *          the path to the file to be read
    *
    *  @return String[]
    *          it will return the String array of all the words in a file
    *
    *  @throw exception
    *          if the given file path is not found it will throw an Exception
    * */
    public static String[] readFileAsString(String filePath)throws IOException
    {
        String data = new String(Files.readAllBytes(Paths.get(filePath)));
        return data.split(" ");
    }

}
