public class IntegerUtils {
    public static boolean greaterThan(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Values of both the parameters should be not null");
        }
        return a.intValue() > b.intValue();
    }

    public static boolean greaterThanEqualTo(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Values of both the parameters should be not null");
        }
        return a.intValue() >= b.intValue();
    }

    public static boolean lesserThan(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Values of both the parameters should be not null");
        }
        return a.intValue() < b.intValue();
    }

    public static boolean lesserThanEqualTo(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Values of both the parameters should be not null");
        }
        return a.intValue() <= b.intValue();
    }

    public static boolean equalTo(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new RuntimeException("Values of both the parameters should be not null");
        }
        return a.intValue() == b.intValue();
    }
}
