import com.sun.security.jgss.GSSUtil;

public class LogLevels {

    public static String message(String logLine) {
        String[] loglines = logLine.split(":", 2);

        for (String log : loglines) {
            logLine = log;
        }

        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        String[] loglines = logLine.split(":", 2);

        for (String log : loglines) {
            logLine = log;
            logLine = logLine.replace("[", " ");
            logLine = logLine.replace("]", " ");
            logLine = logLine.toLowerCase();
            break;
        }

        return logLine.trim();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String level = logLevel(logLine);
        logLine = message + " (" + level + ")";

        return logLine;
    }
    

}
