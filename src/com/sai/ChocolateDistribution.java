package com.sai;

public class ChocolateDistribution {

    public static int getLastStudent(int chocolates, int studentCount) {
        int round = 1;
        int totalChocolates = 0;
        int lastStudent = 0;

        while (chocolates >= totalChocolates + round) {
            totalChocolates += round;
            round++;
        }

        lastStudent = chocolates - totalChocolates;

        if (lastStudent == 0)
            lastStudent = studentCount;
        else if (lastStudent > studentCount)
            lastStudent %= studentCount;

        return lastStudent;
    }

    public static void main(String[] args) {
        int chocolates = 98;
        int studentCount = 9;
        int lastStudent = getLastStudent(chocolates, studentCount);
        System.out.println("Last student to get chocolate: " + lastStudent);
    }
}
