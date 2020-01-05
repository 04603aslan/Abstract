package com.baris;

public abstract class Animal
{
    protected  int legs;
    protected int age;
    protected String name;
    protected boolean Omniveres=true;
    public Animal(int age, String name)
    {
        this.age=age;
        this.name=name;

    }
    public abstract void move();

    public void setLegs(int L)
    {
        this.legs=L;

    }
    public int getLegs()
    {
        return legs;
    }
    public void setOmniveres(boolean omniveres)
    {
        this.Omniveres=omniveres;
    }
    public abstract boolean isOmniveres();

}
