package com.example.javamodule2;

public class Gryffindor {

    public static void main(String[] args) {
        int gryffindorScore = 0;
        System.out.println("Harry was caught wandering in the halls. "+(gryffindorScore-=50)+" for Gryffindor");
        System.out.println("Harry was being cheeky in class. "+(gryffindorScore-=3)+" for Gryffindor");
        System.out.println("Harry got full marks on Lockhart's quiz. "+(gryffindorScore+=30)+" for Gryffindor");
        System.out.println("Ron won the underground chess game. "+(gryffindorScore+=100)+" for Gryffindor");
        System.out.println("Harry defeated Quirrell. "+(gryffindorScore+=60)+" for Gryffindor");
        System.out.println(gryffindorScore);

    }

}