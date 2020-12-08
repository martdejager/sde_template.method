package com.hz;

import card.ChristmasCard;
import card.HighschoolGraduationCard;
import card.PostCard;

public class Main {
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        PostCard postCard = new PostCard(printer);
        HighschoolGraduationCard hsgCard = new HighschoolGraduationCard(printer);
        ChristmasCard christmasCard = new ChristmasCard(printer);

        postCard.print();
        hsgCard.print();
        christmasCard.print();
    }
}
