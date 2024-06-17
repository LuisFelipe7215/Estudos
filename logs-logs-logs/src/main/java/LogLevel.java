public enum LogLevel {
    TRACE("TRC"),
    DEBUG("DBG"),
    INFO("INF"),
    WARNING("WRN"),
    ERROR("ERR"),
    FATAL("FTL");

    private final String loglevel;

    LogLevel(String logLevel) {
        this.loglevel = logLevel;
    }
}
