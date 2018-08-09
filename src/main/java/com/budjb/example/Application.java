package com.budjb.example;

import objectexplorer.MemoryMeasurer;

public class Application {
    public static void main(String[] args) {
        System.out.println("The string \"foo\" consumes " + MemoryMeasurer.measureBytes("foo") + " bytes of heap.");
    }
}
