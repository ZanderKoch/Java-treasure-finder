package nu.te4.treasurefinder;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Zander Koch
 */
public class Driver{

    public static void main(String[] args){
        try{
            //reading lines from file, processing with regex and saving to array
            File inputFile = new File("C:\\Users\\Elev\\Documents\\GitHub\\Java-treasure-finder\\treasureFinder\\src\\main\\java\\nu\\te4\\treasurefinder\\input.txt");
            Scanner scanner = new Scanner(inputFile);
            ArrayList<Integer> frequencyChanges = new ArrayList();

            while(scanner.hasNextLine()){
                String scannedline = scanner.nextLine();
                String filtered = scannedline.replaceAll("[^\\+\\-\\d+]", "");
                frequencyChanges.add(Integer.parseInt(filtered));
            }

            /*for(int frequncyChange : frequencyChanges){
                System.out.println(frequncyChange);
            }*/
            
            System.out.println("answer for first task:");
            System.out.println(task1(frequencyChanges));
            
            System.out.println("answer for second task:");
            System.out.println(task2(frequencyChanges));
            
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * starts at the frequency 0, changes the frequency according to the
     * changes in the given list of changes, and returns the frequency it
     * stopped at
     * @param frequencyChanges the list of changes in freqency
     * @return the frequency stopped at
     */
    public static int task1(ArrayList<Integer> frequencyChanges){
        int currentFrequency = 0;
        for(int frequency : frequencyChanges){
            currentFrequency += frequency;
        }
        return currentFrequency;
    }
    
    /**
     * starts at frequency 0, applies frequency changes until a frequency is
     * landed on twice, then returns this frequency
     */
    public static int task2(ArrayList<Integer> frequencyChanges){
        int currentFrequency = 0;
        HashSet<Integer> found = new HashSet();
        found.add(0);
        
        while(true){
           for(int frequency : frequencyChanges){
               currentFrequency += frequency;
               if(found.contains(currentFrequency)){
                  return currentFrequency;
               }
               else{
                   found.add(currentFrequency);
               }
           }
        }
    }
}
