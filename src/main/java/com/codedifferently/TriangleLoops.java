package com.codedifferently;

public class TriangleLoops {
    public static String getTriangle(int numberOfRows) {
        String rows = "";
        for(int i=1; i<numberOfRows; i++){
            rows += getRow(i) + "\n";
        }

        return rows;
    }
// create a string that empty because its being returned
    //for loop from zero to number of stars
// add it to the string
    //return the stars
    public static String getRow(int numberOfStars) {
        String widthSize = "";
        for(int i=0; i<numberOfStars; i++){
            widthSize += "*";
        }
        return widthSize;
    }
    // create a string
    // make a for loop from 1 to 5 because i know i want 4
    // use getRow that i have up there and put k in there
    // have to add the break?

    public static String getSmallTriangle() {
        String output = "";
        for(int k=1; k<5; k++){
            output += getRow(k);
            output += "\n";

        }
        return output;
    }
// same as up there but use 10
    public static String getLargeTriangle() {
        String output = "";
        for(int i=1; i<10; i++){
            output += getRow(i);
            output += "\n";

        }
        return output;

    }
}
