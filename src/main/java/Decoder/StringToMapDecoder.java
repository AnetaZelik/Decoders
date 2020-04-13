package Decoder;

import java.util.HashMap;
import java.util.Map;

public class StringToMapDecoder {

    Map<String, String> keyValuesMap = new HashMap<String, String>();

    public Map<String, String> decode(String s) {

        //splitting given string into tab of "key=value" pairs
        String[] keyValuePairs = s.split("&");

        //creating tab 2D tab for separating key from value
        String[][] keyAndValue = new String[keyValuePairs.length][2];

        //iterating through the tab to split "key=value" pairs into 2D tab as [[key, value], [key, value]]
        for (int i = 0; i <= keyValuePairs.length - 1; i++) {
            //splitting "key=value" pairs into 2D tab as [[key, value], [key, value]]
            keyAndValue[i] = keyValuePairs[i].split("=");
            //adding [[key, value], [key, value]] to the map
            for (int j = 0; j <= keyAndValue.length - 1; j++) {
                keyValuesMap.put(keyAndValue[i][0], keyAndValue[i][1]);
            }
        }
        return keyValuesMap;
    }

    public void printKeyValuePairs(Map map) {
        System.out.println("Printing key and value pairs");
        for (Object entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public void printKeys(Map map) {
        System.out.println("Printing keys");
        for (Object key : map.keySet()) {
            System.out.println(key);
        }
    }

    public void printValues(Map map) {
        System.out.println("Printing values");
        for (Object value : map.values()) {
            System.out.println(value);
        }
    }
}
