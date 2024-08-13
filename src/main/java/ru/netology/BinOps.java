package ru.netology;

public class BinOps {

    public String sum(String a, String b) {
        int i = Integer.parseInt(a, 2);
        int ii = Integer.parseInt(b, 2);
        int sum1 = i + ii;
        String result = Integer.toBinaryString(sum1);

        return result;
    }

    public String mult(String a, String b) {

        int i = Integer.parseInt(a, 2);
        int ii = Integer.parseInt(b, 2);
        int mult1 = i * ii;
        String result = Integer.toBinaryString(mult1);

        return result;

    }
}
