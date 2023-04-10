package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(char value) {
        super(TextComponentType.SYMBOL);
        this.value = value;
    }


    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("This operation is not supported in Leaf component");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("This operation is not supported in Leaf component");
    }

    @Override
    public int getSize() {
        return 1;
    }


}
