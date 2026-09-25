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
    public void add(String word){
        letters+=word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    public char randomLetter(){
        return letters.charAt((int)(Math.random()*letters.length()));
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    public String companyCentered(){
        return (letters.substring(0,letters.length()/2)+company+letters.substring(letters.length()/2));
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    public void removeFirstVowel(){
        for(int i = 0; i<letters.length(); i++){
            if(letters.charAt(i)=='a'||letters.charAt(i)=='e'||letters.charAt(i)=='i'||letters.charAt(i)=='o'||letters.charAt(i)=='u'){
                letters = letters.substring(0,i)+letters.substring(i+1);
                break;
            }
        }
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    public void removeSome(int num){
        int rand=(int)(Math.random()*letters.length());
        letters=letters.substring(0,rand)+letters.substring(rand+num);

    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    public void removeWord(String word){
        letters=letters.replace(word,"");

    }
}
