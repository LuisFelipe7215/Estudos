public class LogLine {
    private final String logLine;

    public LogLine(String logLine) {
        char[] chars = logLine.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : chars) {
            if (Character.isUpperCase(c)){
                sb.append(c);
            }
        }

        this.logLine = sb.toString();
    }

    public LogLevel getLogLevel() {
        throw new UnsupportedOperationException("Please implement the getLogLevel() method");
    }

    public String getOutputForShortLog() {
        throw new UnsupportedOperationException("Please implement the getOutputForShortLog() method");
    }
}
