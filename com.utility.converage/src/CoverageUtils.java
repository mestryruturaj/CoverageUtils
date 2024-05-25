import java.util.function.Supplier;

public class CoverageUtils {

    /**
     * Performs a logical AND operation on a variable number of boolean suppliers.
     *
     * @param supplierVarArgs Variable number of boolean suppliers to evaluate.
     * @return {@code true} if all suppliers return {@code true}, {@code false} otherwise.
     * @throws RuntimeException If the array of suppliers is null or if any supplier throws a RuntimeException during evaluation.
     */
    public static boolean performLogicalAnd(Supplier<Boolean>... supplierVarArgs) {
        if (supplierVarArgs == null) {
            throw new RuntimeException("AndOperandsFailure: There is not a single expression to evaluate.");
        }

        for (Supplier<Boolean> each : supplierVarArgs) {
            try {
                if (!each.get()) {
                    return false;
                }
            } catch (RuntimeException exception) {
                throw new RuntimeException("Unable to evaluate expression." + exception + ".");
            }
        }
        return true;
    }


    /**
     * Performs a logical OR operation on a variable number of boolean suppliers.
     *
     * @param supplierVarArgs Variable number of boolean suppliers to evaluate.
     * @return {@code true} if at least one supplier returns {@code true}, {@code false} otherwise.
     * @throws RuntimeException If the array of suppliers is null or if any supplier throws a RuntimeException during evaluation.
     */
    public static boolean performLogicalOr(Supplier<Boolean>... supplierVarArgs) {
        if (supplierVarArgs == null) {
            throw new RuntimeException("OrOperandsFailure: There is not a single expression to evaluate.");
        }

        for (Supplier<Boolean> each : supplierVarArgs) {
            try {
                if (each.get()) {
                    return true;
                }
            } catch (RuntimeException exception) {
                throw new RuntimeException("Unable to evaluate expression." + exception + ".");
            }
        }
        return false;
    }

    /**
     * Performs a logical NOT operation on a boolean supplier.
     *
     * @param operand The boolean supplier to evaluate.
     * @return {@code true} if the supplier returns {@code false}, {@code false} if the supplier returns {@code true}.
     * @throws RuntimeException If the supplier throws a RuntimeException during evaluation.
     */
    public static boolean performLogicalNot(Supplier<Boolean> operand) {
        try {
            return !operand.get();
        } catch (RuntimeException exception) {
            throw new RuntimeException("Unable to evaluate expression." + exception + ".");
        }
    }
}
