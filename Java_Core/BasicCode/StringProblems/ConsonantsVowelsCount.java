package Java_Core.BasicCode.StringProblems;

public class ConsonantsVowelsCount {


    public String calculateCount(String text){
        int vowelCount = 0;
        int consonantCount = 0;
        String lowerText = text.toLowerCase();
          for(int i=0;i<lowerText.length();i++){
              char ch = lowerText.charAt(i);
              if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
vowelCount+=1;
              }
              else if(Character.isLetter(ch)){
                  consonantCount+=1;
              }
          }
          return "Vowels: "+vowelCount+"\nConsonants: "+consonantCount;
    }
}
