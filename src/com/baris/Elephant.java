package com.baris;

import javax.swing.*;

public class Elephant extends Animal
{
    public Elephant(int a,String n)
    {
        super(a,n);

    }

    @Override
    public void move() {
        String move ="Move on the ground";
        JOptionPane.showMessageDialog(null,move);

    }

    @Override
    public boolean isOmniveres() {
        return true;
    }

}
