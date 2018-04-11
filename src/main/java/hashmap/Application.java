package hashmap;

import java.io.*;

public class Application {

    public static void main2(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Hannah", "Lucy");
        myMap.put("Heather", "no pet, so sad :(");

        String str = myMap.get("Heather");
        System.out.println(str);
        /// what prints? why?
    }

    public static void main(String[] args) {

        try (BufferedReader inFile = new BufferedReader(new FileReader(
                "/Users/trevortabaka/Documents/CodingNomads/java_labs_bali/java_labs_bali/randomText.txt"));
             BufferedWriter outFile = new BufferedWriter(new FileWriter(
                     "/Users/trevortabaka/Documents/IOReviewText.txt"))) {
            int in;
            while ((in = inFile.read()) != -1) {

                if (in == (int) 'e') {
                    in = (int) '3';
                }

                outFile.write(in);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}