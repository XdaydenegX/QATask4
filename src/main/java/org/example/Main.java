package org.example;
import StringOperator.StringOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "c";
        int result = StringOperator.stringOperator(string1, string2);
        System.out.println(result);
    }

    public static String randomString(int n, boolean k, boolean f) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] numbers = "1234567890".toCharArray();
        List<Character> charListToGenerate = new ArrayList<>();
        if (f){
            for (char letter: alphabet) {
                charListToGenerate.add(letter);
            }
        }
        if (k){
            for (char number: numbers) {
                charListToGenerate.add(number);
            }
        }
        StringBuilder result = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < n; i++){
            int index = random.nextInt(charListToGenerate.size());
            result.append(charListToGenerate.get(index));
        }
        return result.toString();
    }
}