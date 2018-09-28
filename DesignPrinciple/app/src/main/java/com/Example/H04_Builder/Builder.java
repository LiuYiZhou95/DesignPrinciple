package com.Example.H04_Builder;

public abstract class Builder {
    public abstract void BuildCPU();
    public abstract void BuildMainboard();
    public abstract void BuildHD();
    public abstract Computer GetComputer();
}