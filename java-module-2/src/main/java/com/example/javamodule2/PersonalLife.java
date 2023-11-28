package com.example.javamodule2;

public class PersonalLife {

    public static void main(String[] args) {
        String myName = "Sam";
        int age = 35;
        String whereImFrom = "England";
        String favouriteSport = "Basketball";
        int timePlayingSports = 2;
        String tiredTime = "Checkers";
        String favouriteSubject = "Chemistry";
        char scoreInFavouriteSubject = 'B';
        System.out.println(
                "My name is " + myName +
                ". I'm " + age + " years old" +
                ", and I'm from " + whereImFrom +
                ". My favourite sport is " + favouriteSport +
                ". I play for " + timePlayingSports + " a day." +
                "When I'm tired, I like to play " + tiredTime +
                ". In school, my favourite subject was " + favouriteSubject +
                ", I scored a " + scoreInFavouriteSubject + "."

        );
    }

}
