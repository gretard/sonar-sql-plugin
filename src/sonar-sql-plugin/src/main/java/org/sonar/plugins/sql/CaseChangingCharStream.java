package org.sonar.plugins.sql;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.misc.Interval;

public class CaseChangingCharStream implements CharStream {

    private final CharStream stream;
    private final boolean upper;

    public CaseChangingCharStream(final CharStream stream, final boolean upper) {
        this.stream = stream;
        this.upper = upper;
    }

    @Override
    public String getText(Interval interval) {
        return stream.getText(interval);
    }

    @Override
    public void consume() {
        stream.consume();
    }

    @Override
    public int LA(int i) {
        int c = stream.LA(i);
        if (c <= 0) {
            return c;
        }
        if (upper) {
            return Character.toUpperCase(c);
        }
        return Character.toLowerCase(c);
    }

    @Override
    public int mark() {
        return stream.mark();
    }

    @Override
    public void release(int marker) {
        stream.release(marker);
    }

    @Override
    public int index() {
        return stream.index();
    }

    @Override
    public void seek(int index) {
        stream.seek(index);
    }

    @Override
    public int size() {
        return stream.size();
    }

    @Override
    public String getSourceName() {
        return stream.getSourceName();
    }
}
