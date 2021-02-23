package dk.kea.junitdemospring;

import dk.kea.junitdemospring.service.Calculator;

public class Lommeregner {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(17, 25)); // 42
        System.out.println(cal.add(2, 2)); // 2
    }
}
