package algorithm;


import java.util.Arrays;
import java.util.stream.Collectors;

public class ProximitySearchAlgoRevised {

    public static String fixedKey = null;
    public static String lookUpKey = null;
    /*
    * @Params
    *       keyword1 : first keyword
    *       KeyWord2 : Second Keyword
    *       keyWordRange: Proxmity search Range
    *       wordsArray: Array of all the words in a File given
    * @return: total number of  times keywords Match
    * */

    public static int proximitySearch(String keyword1, String keyword2, int keyWordRange, String[] wordsArray) {

        int sumOfMatchCount = 0;
        int matchCount = 0;
        int sumOfStreamCount = 0;
        int streamCount = 0;
        if (wordsArray.length > 0) {

            for (int startIndex = 0; startIndex < wordsArray.length; startIndex++) {

                if (wordsArray[startIndex].equalsIgnoreCase(keyword1) || wordsArray[startIndex].equalsIgnoreCase(keyword2)) {
                    fixedKey = wordsArray[startIndex].equalsIgnoreCase(keyword1) ? keyword1 : keyword2;
                    lookUpKey = fixedKey.equalsIgnoreCase(keyword1) ? keyword2 : keyword1;
                    int range = (wordsArray.length - startIndex > keyWordRange) ? keyWordRange : (wordsArray.length - startIndex);
                    streamCount =(int)Arrays.stream(wordsArray,startIndex + 1,startIndex + range).filter(w -> w.equalsIgnoreCase(lookUpKey)).count();
                    for (int rangeIndex = startIndex + 1; rangeIndex < startIndex + range; rangeIndex++) {
                        if (wordsArray[rangeIndex].equalsIgnoreCase(lookUpKey)) {
                            matchCount++;
                        }
                    }

                    sumOfMatchCount += matchCount;
                    sumOfStreamCount+=streamCount;
                    System.out.println(sumOfMatchCount + " : " + sumOfStreamCount);
                    matchCount = 0;
                }

            }
        }

        return sumOfMatchCount;
    }


    public static int proximitySearch(String keyword1, String keyword2, int keyWordRange, String[] wordsArray,boolean baseSensitive) {

        if (baseSensitive) {
            return proximitySearch(keyword1, keyword2, keyWordRange, wordsArray);
        } else {
                int sumOfMatchCount = 0;
                int matchCount = 0;
                int sumOfStreamCount = 0;
                int streamCount = 0;
                if (wordsArray.length > 0) {

                    for (int startIndex = 0; startIndex < wordsArray.length; startIndex++) {
                        if (wordsArray[startIndex].equals(keyword1) || wordsArray[startIndex].equals(keyword2)) {
                            fixedKey = wordsArray[startIndex].equals(keyword1) ? keyword1 : keyword2;
                            lookUpKey = fixedKey.equals(keyword1) ? keyword2 : keyword1;
                            int range = (wordsArray.length - startIndex > keyWordRange) ? keyWordRange : (wordsArray.length - startIndex);
                            streamCount =(int)Arrays.stream(wordsArray,startIndex + 1,startIndex + range).filter(w -> w.equalsIgnoreCase(lookUpKey)).count();
                            for (int rangeIndex = startIndex + 1; rangeIndex < startIndex + range; rangeIndex++) {
                                if (wordsArray[rangeIndex].equalsIgnoreCase(lookUpKey)) {
                                    matchCount++;
                                }
                            }
                            sumOfMatchCount += matchCount;
                            sumOfStreamCount+=streamCount;
                            System.out.println(sumOfMatchCount + " : " + sumOfStreamCount);
                            matchCount = 0;
                        }

                    }
                }

                return sumOfMatchCount;


        }

    }
}
