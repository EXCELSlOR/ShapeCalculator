package model.utils;

public class ValidateUtil {

    public static boolean isValidSide(double side) {
        if (side == Double.NaN) {
            return false;
        }
        if (side == Double.POSITIVE_INFINITY) {
            return false;
        }
        return side > 0;
    }

    public static boolean isValidTriangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide <= thirdSide) {
            return false;
        }
        if (firstSide + thirdSide <= secondSide) {
            return false;
        }
        if (secondSide + thirdSide <= firstSide) {
            return false;
        }
        return true;
    }
}
