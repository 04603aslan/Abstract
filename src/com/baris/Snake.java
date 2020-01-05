package com.baris;

import javax.swing.*;

public class Snake extends Animal
{
    public  Snake(int a, String n)
    {
        super(a,n);
        this.age=a;
        this.name=n;

    }

    @Override
    public void move() {
        String move =  "crawls";
        JOptionPane.showMessageDialog(null,move);

    }

    @Override
    public boolean isOmniveres() {
        return false;
    }
}
