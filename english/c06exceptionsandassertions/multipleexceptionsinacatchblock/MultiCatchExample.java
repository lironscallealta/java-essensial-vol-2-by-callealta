package english.c06exceptionsandassertions.multipleexceptionsinacatchblock;

/*
 * try {
 * // some codes that throws some Exception object
 * }
 * catch(IOException ex) {
 * logProblem(ex);
 * }
 * catch(SQLException ex) {
 * logProblem(ex);
 * }
 * 
 * In Java SE 7, multiple Exception objects can be caught inside a single catch
 * block like this:
 * 
 * try {
 * // some codes that throws some Exception object
 * }
 * catch(IOException | SQLException ex) {
 * logProblem(ex);
 * }
 */

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatchExample {

    public static void main(String[] args) {
        catchSeparately();
        catchTogether();
    }

    private static void catchSeparately() {
        // Before Java SE 7, each exception type needed its own catch block.
        try {
            performOperation(false);
        } catch (IOException ex) {
            logProblem(ex);
        } catch (SQLException ex) {
            logProblem(ex);
        }
    }

    private static void catchTogether() {
        // Since Java SE 7, multi-catch lets different exception types
        // share the same handler. Separate the types with |.
        try {
            performOperation(true);
            // -> IMPORTANT about || or |: In a multi-catch, | separates the exception types
            // that this block can catch.
        } catch (IOException | SQLException ex) {
            // Either exception is handled by this same block.
            logProblem(ex);
        }
    }

    private static void performOperation(boolean simulateDatabaseError)
            throws IOException, SQLException {
        // Simulate either kind of failure so the example can run on its own.
        if (simulateDatabaseError) {
            throw new SQLException("Could not query the database.");
        }

        throw new IOException("Could not read the file.");
    }

    private static void logProblem(Exception ex) {
        System.err.println(ex.getClass().getSimpleName() + ": " + ex.getMessage());
    }
}
