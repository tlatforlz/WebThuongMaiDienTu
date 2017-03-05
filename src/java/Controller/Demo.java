/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author tranl
 */
public class Demo {
    
    
    public static String convertToVND(int giaTien) {
        String giaTienCD = String.valueOf(giaTien);
        String result = "";
        int count = 0;
        for (int i = giaTienCD.length() - 1; i >= 0; i--) {
            result += giaTienCD.charAt(i);
            count++;

            if (count % 3 == 0 && i != 0) {
                result += ".";
            }
        }
        return new StringBuffer(result).reverse().toString();
    }

    public static void main(String[] args) {
        int x = 100000;
        System.out.println(convertToVND(x));
    }
}
