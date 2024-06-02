/*Define a class Word Example having the followingdescription:
Data members/instance variables:
private String strdata: to store a sentence.
Parameterized Constructor WordExample(String) : Accept a
sentence which
may be terminated by either’.’, ‘? ’or’!’ only. The wordsmay be separated by
more than one blank space and are in UPPER CASE.
Member Methods:
void countWord(): Find the number of wordsbeginning and
ending with a vowel.
void placeWord(): Place the words which begin andend with a vowel at the
beginning, followed by the remaining words as they occur in the sentence
*/


import java.util.*;
public class StringExample{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s;
        while(true){
        System.out.println("enter any string");
        s=scn.nextLine();
        String upper=s.toUpperCase();
        if(!s.equals(upper)){
            System.out.println("enter uppercase");
            continue;
        }
        if(s.charAt(s.length()-1)=='.'||s.charAt(s.length()-1)=='?'||s.charAt(s.length()-1)=='!'){
            break;
        }
        else
        {
            System.out.println("end with '?','.','!' ");
        }
        }
        WordExample w=new WordExample(s);
        w.countWord();
        w.placeWord();
    }
}
class WordExample{
    private String strdata;
    WordExample(String s){
        strdata=s;
    }
    void countWord(){
        int count=0;
        String []newstr=SplitString(strdata);
        for(int i=0;i<newstr.length;i++){
            if(isVowel(newstr[i].charAt(0))&&isVowel(newstr[i].charAt(newstr[i].length()-1))){
                count++; 
            }
        }
        System.out.println("count="+count);

    }
    void placeWord(){
        String []newstr=SplitString(strdata);
        String res="";
        String vow="",nonvow="";
        for(int i=0;i<newstr.length;i++){
            if(isVowel(newstr[i].charAt(0))&&isVowel(newstr[i].charAt(newstr[i].length()-1))){
                vow=vow+" "+newstr[i];
            }
            else{
            nonvow=nonvow+" "+newstr[i];
            }
        }
        res=vow+nonvow;
        System.out.println(res.trim());
    }
    boolean isVowel(char ch){
        return "AEIOU".indexOf(ch)!=-1;
    }
    String[] SplitString(String strdata){
        String newstr[]=strdata.substring(0,strdata.length()-1).split("\\s+");
        return newstr;
    }
}
