public class LogLine {
    private final String logLine;
    public LogLevel logLevel;

    public LogLine(String logLine) {
        StringBuilder sb = new StringBuilder();

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

        return logLevel;
    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
