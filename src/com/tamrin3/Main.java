package com.tamrin3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = input.nextLine();
        char[] chars = text.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z')
            chars[0] = (char) (chars[0] - 'a' + 'A');
        text = String.valueOf(chars);
        int numLetter = 1;
        while (numLetter < text.length()) {
            if (text.charAt(numLetter) != '=')
                numLetter++;
            else {
                text = text.substring(0, numLetter - 1).concat(text.substring(numLetter + 1));
                numLetter--;
            }
        }
        System.out.println(text);
    }
}
