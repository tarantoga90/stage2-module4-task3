package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }


    @Override
    public String operation() {
        StringBuilder sb = new StringBuilder();
        for (AbstractTextComponent c : componentList) {

            sb.append(c.operation());

            if (this.getComponentType() == TextComponentType.SENTENCE) {
                sb.append("\\. ");

            }

            if (this.getComponentType() == TextComponentType.WORD) {
                sb.append(" ");
            }


        }
        return sb.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        this.componentList.add(textComponent);
        size++;
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        this.componentList.add(textComponent);
        size--;
    }

    @Override
    public int getSize() {
        return size;
    }

}
