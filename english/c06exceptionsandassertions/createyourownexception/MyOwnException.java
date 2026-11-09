package english.c06exceptionsandassertions.createyourownexception;

class BadTastingFoodException extends Exception {
}

public class MyOwnException {

    private static boolean candy = false;
    private static boolean sourBall = true;

    public static void main(String[] args) {
        // 1. Java enters main and starts with the first try block.
        try {
            System.out.println("Testing candy");

            // 2. Imagine pausing here. candy is false.
            // Enter isSour at A with taste = false.
            // Follow A -> C, then return to step 3.
            isSour(candy);

            // 3. isSour finished normally, so we continue here.
            System.out.println("candy: returned normally from isSour");

        } catch (BadTastingFoodException btfe) {
            // We skip this catch because no exception was thrown.
            System.out.println("candy: entered the catch block");
        }

        // 4. We continue with the second try block.
        try {
            System.out.println("Testing sourBall");

            // 5. Imagine pausing here. sourBall is true.
            // Enter isSour at A with taste = true.
            // Follow A -> B, then jump to step 6.
            isSour(sourBall);

            // We skip this line because isSour threw an exception.
            System.out.println("sourBall: returned normally from isSour");

        } catch (BadTastingFoodException btfe) {
            // 6. Java finds this matching catch and runs its code.
            // The variable btfe holds the exception that was thrown.
            System.out.println("sourBall: entered the catch block");
        }

        // 7. We reach the end of main.
    }

    private static void isSour(boolean taste)
            throws BadTastingFoodException {
        // A. Is taste true? If it is false, skip the if body and go to C.
        if (taste) {
            // B. taste is true. Throw the exception and exit the method.
            throw new BadTastingFoodException();
        }
        // C. We reached the end of the method, so we return normally.
    }
}