package algorithm;

import org.w3c.dom.ranges.Range;
import utilities.FileUtils;
import validationexception.EmptyFileException;
import validationexception.RangeNotValidException;

import java.io.IOException;

public class ProximitySearchApp {

    public static String keyword1;
    public static String keyword2;
    public static int keyWordRange;
    public static String inputFileName;
    public static String[] wordsArray;

    public static void main(String[] args) throws Exception {

//        System.out.println("[keyword1 : " + args[0] + "]\n[keyword2 : " + args[1] + "]\n[Range : " + args[2] + "]\n[InputFileName : " + args[3] + "]");
//        //Program argument assignments
//        keyword1 = args[0];
//        keyword2 = args[1];
//        keyWordRange = Integer.parseInt(args[2]);
//        inputFileName = args[3];
//        runProximitySearch(keyword1,keyword2,keyWordRange,inputFileName ,false);
        runProximitySearch("the","canal",6,"D:\\Automation_Project\\docusign-proximity-assignment\\src\\main\\resources\\data\\input.txt" ,false);
    }


    public static void runProximitySearch(String keyword1,String keyword2,Integer keyWordRange,String inputFileName, boolean pathRelative) throws RangeNotValidException, EmptyFileException, IOException {
        if (keyWordRange<2){
            throw new RangeNotValidException("Range is not valid : " + keyWordRange);
        }

        if (pathRelative == true)
         inputFileName = System.getProperty("user.dir") + inputFileName;
         String []content = FileUtils.readFileAsString(inputFileName);
        if(content.length==0 ||(content.length==1 || content[0] == "")){
            throw new EmptyFileException("File is Empty or File has only one keyword");
        }
//        int keyWordsCount = ProximitySearchAlgo.proximitySearch(keyword1, keyword2, keyWordRange, content);
        int keyWordsCount = ProximitySearchAlgoRevised.proximitySearch(keyword1, keyword2, keyWordRange, content);

        System.out.println("\n\nKEY_WORDS_COUNT : " + keyWordsCount);
    }

}
