package com.Example.H09_Fascade;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu=new CPU();
        memory=new Memory();
        disk=new Disk();
    }

    public void startup(){
        System.out.println("computer start");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer start finished");
    }
    public void shutdown(){
        System.out.println("cpu shutdown");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("cpu shutdown finished");
    }
}