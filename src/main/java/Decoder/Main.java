package Decoder;

import java.util.Map;

class Main{
    public static void main(String[] args) {
        StringToMapDecoder myMapDecoder = new StringToMapDecoder();
        String stringToDecode = "one=1&two=2";

        Map<String, String> myMap = myMapDecoder.decode(stringToDecode);

        myMapDecoder.printKeys(myMap);
        myMapDecoder.printValues(myMap);
        myMapDecoder.printKeyValuePairs(myMap);

    }
}


