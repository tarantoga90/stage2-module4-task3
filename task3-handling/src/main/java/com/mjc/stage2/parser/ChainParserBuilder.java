package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private final List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {// comment line
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        if (parsers.isEmpty()) {
            throw new IllegalStateException("No parsers added to chain!");
        }

        AbstractTextParser headParser = parsers.get(0);

        AbstractTextParser currentParser = headParser;

        for (int i = 1; i < parsers.size(); i++) {
            currentParser.setNextParser(parsers.get(i));
            currentParser = currentParser.nextParser;
        }

        return headParser;
    }
}
