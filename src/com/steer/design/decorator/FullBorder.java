package com.steer.design.decorator;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else if(row == display.getRows() +1){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else{
            return "|"+display.getRowText(row-1)+"|";
        }
    }

    private String makeLine(char c, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(c);
        }
        return buffer.toString();
    }
}
