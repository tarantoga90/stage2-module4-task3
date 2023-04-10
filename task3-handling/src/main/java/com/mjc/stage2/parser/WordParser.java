package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

import java.util.regex.Pattern;

public class WordParser extends AbstractTextParser {
    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        AbstractTextComponent wordComponent = new TextComponent(TextComponentType.WORD);

        abstractTextComponent.add(wordComponent);

        for (int i = 0; i < string.length(); i++) {
            AbstractTextComponent symbolComponent = new SymbolLeaf(string.charAt(i));
            wordComponent.add(symbolComponent);
        }

        if (nextParser != null) {
            nextParser.parse(abstractTextComponent, string);
        }
    }

}
