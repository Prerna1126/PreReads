package com.prereads;
// changess
class TwelveDays {
    String verse(int verseNumber) {
        String songverse="";
        String[] day={"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] gave={"a Partridge in a Pear Tree.\n", "two Turtle Doves, and ", "three French Hens, ", "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ", "seven Swans-a-Swimming, ", "eight Maids-a-Milking, ", "nine Ladies Dancing, ", "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", "twelve Drummers Drumming, "};
        String start="On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: ";
        String end="";
        for(int j=verseNumber-1;j>=0;j--){
            end+=gave[j];
        }
        songverse=start+end;
        return songverse;
    }
    String verses(int startVerse, int endVerse) {
        String song="";
        for(int i=startVerse;i<=endVerse;i++){
            song=song+verse(i);
            if(i!=endVerse){
                song+="\n";
            }
        }
        return song;
    }
    String sing() {
        return verses(1,12);
    }
}