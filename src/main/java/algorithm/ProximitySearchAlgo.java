package algorithm;

public class ProximitySearchAlgo {

    /*
    * @Params
    *       keyword1 : first keyword
    *       KeyWord2 : Second Keyword
    *       keyWordRange: Proxmity search Range
    *       wordsArray: Array of all the words in a File given
    * @return: total number of  times keywords Match
    * */

    public static int proximitySearch(String keyword1, String keyword2, int keyWordRange, String[] wordsArray) {
        String fixedKey = null;
        String lookUpKey = null;
        int sumOfMatchCount = 0;
        int matchCount = 0;
        if (wordsArray.length > 0) {

            for (int startIndex = 0; startIndex < wordsArray.length; startIndex++) {

                if (wordsArray[startIndex].equalsIgnoreCase(keyword1) || wordsArray[startIndex].equalsIgnoreCase(keyword2)) {
                    fixedKey = wordsArray[startIndex].equalsIgnoreCase(keyword1) ? keyword1 : keyword2;
                    lookUpKey = fixedKey.equalsIgnoreCase(keyword1) ? keyword2 : keyword1;
                    int range = (wordsArray.length - startIndex > keyWordRange) ? keyWordRange : (wordsArray.length - startIndex);

                    for (int rangeIndex = startIndex + 1; rangeIndex < startIndex + range; rangeIndex++) {

                        if (wordsArray[rangeIndex].equalsIgnoreCase(lookUpKey)) {
                            matchCount++;
                        }
                    }

                    sumOfMatchCount += matchCount;
                    matchCount = 0;
                }

            }
        }


        return sumOfMatchCount;
    }
}
