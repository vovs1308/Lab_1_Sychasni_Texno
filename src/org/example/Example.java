package org.example;

public class Example {
    public void processNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Число должно быть положительным");
        }
        // Обработка числа, если оно положительное
    }
}