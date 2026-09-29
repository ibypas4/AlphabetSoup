//Name: Ivy Pascover
//Date: 09/25/26
//Description: This program will produce soup that will only contain letters that spell out specific words in the hopes of subliminally influencing the customers

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //precondition letters is a non null and valid string
    //postcondition letters is what it was before but with what the user inputed on hte end
    public void add(String word){
        letters+=word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //precondition letters is a non null and valid string
    //postcondition letters is the same but a random letter from it has been returned
    public char randomLetter(){
        return letters.charAt((int)(Math.random()*letters.length()));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //precondition letters is a non null and valid string and company is a non null and valid string
    //postcondition letters is the same but with the company name placed in the center
    public String companyCentered(){
        return (letters.substring(0,letters.length()/2)+company+letters.substring(letters.length()/2));
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //precondion letters variable in a non-null and is a valid string
    //postcondition letters no longer contain first vowel
    public void removeFirstVowel(){
       letters=letters.replaceFirst("[aeiouAEIOU]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //precondition letters is a non null and valid string
    //postcondition letters is the same but with "num" letters removed from a random spot
    public void removeSome(int num){
        int rand=(int)(Math.random()*letters.length());
        letters=letters.substring(0,rand)+letters.substring(rand+num);

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //precondition letters is a non null and valid string
    //postcondition letters is the same but with the word "word" removed
    public void removeWord(String word){
        letters=letters.replace(word,"");

    }
}
