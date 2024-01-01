package lib;

public class RetryUtils {
    public static void retryOnException(Runnable action, int maxRetries, long delayMillis) {
        for (int retryCount = 0; retryCount < maxRetries; retryCount++) {
            try {
                action.run(); // Execute the action
                return; // Exit the loop if successful
            } catch (Exception e) {
                if (retryCount < maxRetries - 1) {
                    // Sleep for a specified time before retrying
                    try {
                        Thread.sleep(delayMillis);
                    } catch (InterruptedException ignored) {
                    }
                } else {
                    throw e; // If max retries reached, throw the exception
                }
            }
        }
    }
}
