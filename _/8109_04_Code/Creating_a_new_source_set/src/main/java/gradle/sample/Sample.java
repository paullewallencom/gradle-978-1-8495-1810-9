// File: src/main/java/gradle/sample/Sample.java
package gradle.sample;

import java.util.ResourceBundle;

/**
 * Read welcome message from external properties file
 * <code>messages.properties</code>.
 */
public class Sample implements ReadWelcomeMessage {

    public Sample() {
    }

    /**
     * Get <code>messages.properties</code> file and read
     * value for <em>welcome</em> key.
     *
     * @return Value for <em>welcome</em> key from <code>messages.properties</code>
     */
    public String getWelcomeMessage() {
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        final String message = resourceBundle.getString("welcome");
        return message;
    }
}
