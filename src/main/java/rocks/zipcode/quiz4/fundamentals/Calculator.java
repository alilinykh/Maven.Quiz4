package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        return Math.sqrt(value);
    }

    public static Double square(Double value) {
        return value*value;
    }

    public static Double[] squareRoots(Double... value) {
        List<Double> rslt = new ArrayList<>();
        for (Double d: value
        ) {
            rslt.add(squareRoot(d));
        }
        Double[] arr = new Double[rslt.size()];
        return rslt.toArray(arr);
    }

    public static Double[] squares(Double... values) {
        List<Double> rslt = new ArrayList<>();
        for (Double d: values
             ) {
            rslt.add(d*d);
        }
        Double[] arr = new Double[rslt.size()];
        return rslt.toArray(arr);
    }

    public static Double add(Double value1, Double value2) {
        return value1+value2;
    }

    public static Double subtract(Double value1, Double value2) {
        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {
        return divisor/dividend;
    }
}
