package net.lamgc.oracle.sentry.common.logging;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * @author LamGC
 */
public class NoMarkerFilter extends Filter<ILoggingEvent> {
    @Override
    public FilterReply decide(ILoggingEvent event) {
        return event.getMarker() != null ? FilterReply.DENY : FilterReply.NEUTRAL;
    }
}
