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

        for (int i = 0; i < componentList.size(); i++) {
            AbstractTextComponent component = componentList.get(i);

            if (component.getComponentType() == TextComponentType.SYMBOL) {
                sb.append(component.operation());
                continue;
            }

            if (i == 0 || componentList.get(i - 1).getComponentType() == TextComponentType.SYMBOL) {
                sb.append(component.operation());
            } else {
                sb.append(component.getComponentType().getDelimiter()).append(component.operation());
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
