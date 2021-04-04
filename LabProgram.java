import java.util.Scanner;

public class LabProgram {
   public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {
      // Returns index of word's first occurrence in wordList. If not found, returns -1.
      int i;

      for (i = 0; i < numInList; ++i) {
         if (wordList[i].equals(wordToFind)) {
            return i;
         }
      }

      return -1;
   }


   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String[] wordsToReplace = new String[20];
      String[] wordReplacements = new String[20];
      String currWord;
      int i;
      int numWordsToReplace;
      int numUserWords;
      int currWordIndex;

      // Populate word replacement pair arrays
      numWordsToReplace = scnr.nextInt();

      for (i = 0; i < numWordsToReplace; ++i) {
         currWord = scnr.next();
         wordsToReplace[i] = currWord;
         currWord = scnr.next();
         wordReplacements[i] = currWord;
      }

      // Replace words in user defined sentance
      numUserWords = scnr.nextInt();

      for (i = 0; i < numUserWords; ++i) {
         currWord = scnr.next();
         currWordIndex = findWordInWordList(wordsToReplace, currWord, numWordsToReplace);

         if (currWordIndex == -1) {
            System.out.print(currWord + " ");
         }
         else { // Found in replacement list; replace
            System.out.print(wordReplacements[currWordIndex] + " ");
         }
      }
      System.out.println();
   }
}
