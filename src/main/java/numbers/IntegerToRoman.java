package numbers;

import java.util.*;

public class IntegerToRoman {

    private static Map<Integer, RomanNumber> integerToRomanMap = new HashMap<>();

    static {
        integerToRomanMap.put(1, RomanNumber.I);
        integerToRomanMap.put(5, RomanNumber.V);
        integerToRomanMap.put(10, RomanNumber.X);
        integerToRomanMap.put(50, RomanNumber.L);
        integerToRomanMap.put(100, RomanNumber.C);
        integerToRomanMap.put(500, RomanNumber.D);
        integerToRomanMap.put(1000, RomanNumber.M);
    }

    public String intToRoman(int number) {

        if(number >= 4000){
            throw new IllegalArgumentException("The maximum supported number is 3999");
        }

        Set<Integer> boundariesDescending = new TreeSet<>(integerToRomanMap.keySet()).descendingSet();
        for(Integer boundary : boundariesDescending){
            RomanNumber boundaryRoman = integerToRomanMap.get(boundary);
            if(number >= boundary){
                return  boundaryRoman.name() + intToRoman(number - boundary);
            }else {
                RomanNumber previousRoman = boundaryRoman.previousValue;
                if((previousRoman != null) && (number >= (boundary - previousRoman.intValue))) {
                    return intToRoman(boundary - number) + integerToRomanMap.get(boundary).name();
                }
            }
        }

        return "";
    }

    enum RomanNumber {
        I(1),
        V(I, 5),
        X(I, 10),
        L(X, 50),
        C(X, 100),
        D(C, 500),
        M(C, 1000);

        RomanNumber previousValue;
        Integer intValue;

        RomanNumber(RomanNumber previousValue, Integer intValue) {
            this.previousValue = previousValue;
            this.intValue = intValue;
        }

        RomanNumber(Integer intValue) {
            this.intValue = intValue;
        }
    }
}
