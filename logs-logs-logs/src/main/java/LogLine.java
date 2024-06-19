public class LogLine {
    private final String logLine;
    public LogLevel logLevel;
    public String message;

    public LogLine(String logLine) {
        StringBuilder sb = new StringBuilder();
        message = logLine;
        for (String s : logLine.split(":")) {
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    sb.append(c);
                }
            }
            break;
        }
        this.logLine = sb.toString();
    }

    public LogLevel getLogLevel() {
        switch (logLine) {
            case "TRC" -> logLevel = LogLevel.TRACE;
            case "DBG" -> logLevel = LogLevel.DEBUG;
            case "INF" -> logLevel = LogLevel.INFO;
            case "WRN" -> logLevel = LogLevel.WARNING;
            case "ERR" -> logLevel = LogLevel.ERROR;
            case "FTL" -> logLevel = LogLevel.FATAL;
            default -> logLevel = LogLevel.UNKNOWN;
        }

        return this.logLevel;
    }

    public String getOutputForShortLog() {
        String shortFormat = "";
        for (String s : message.split(":")) {
            shortFormat = String.format("%d:%s", getLogLevel().getLevelNumber(), s.trim());
        }
        return shortFormat;
    }
}
