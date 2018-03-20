import java.util.HashSet;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
/**
 * This class creates a hashset that allows you to store your articles of clothing
 * it then uses a tree set to sort the elements in the set
 * 
 * @author Albert Cedeno 
 * @version 5.11.17
 */
public class Wardrobe
{
    private String articleOfClothing;
    private Scanner keybd;
    private HashSet<String> clothingSet;
    private TreeSet<String> clothingTreeSet;
    private FileWriter clothingWriter;

    /**
     * Constructor for objects of class Wardrobe
     */
    public Wardrobe()
    {
        clothingSet = new HashSet<>();
        clothingTreeSet = new TreeSet<>();

    }

    /**
     * this method allows the user to populate the clothing set
     */
    public void populateWardrobe()
    {
        String stopper = "stop";
        String userArticleOfClothing;
        keybd = new Scanner(System.in);
        System.out.println("Enter article of clothing or stop");
        userArticleOfClothing = keybd.nextLine();
        while(!(userArticleOfClothing.equals(stopper))){
            clothingSet.add(userArticleOfClothing);
            System.out.println("Enter article of clothing or stop");
            userArticleOfClothing = keybd.nextLine();

        }
    }

    /**
     * this method sorts and prints elements in the hash set using a treeset
     */
    public void sortAndPrint()
    {
        clothingTreeSet.addAll(clothingSet);
        System.out.println(clothingTreeSet);

    }

    /**
     * this method writes the articles of clothing into a text file
     */
    public void writeClothes()
    {
        Iterator<String> clothingIteration = clothingSet.iterator();
        try{
            clothingWriter = new FileWriter("clothes.txt" , true);                       
            while(clothingIteration.hasNext()){
                clothingWriter.write(clothingIteration.next() + " , " );
            }
            clothingWriter.close();
        }
        catch(IOException ioException){
            System.out.println("Error.");
        }
    }

    /**
     * main method for Wardrobe
     */
    public static void main(){
        HashSet clothingSet = new HashSet<String>();
        TreeSet clothingTreeSet = new TreeSet<>();

        clothingSet.add("khakis");
        clothingSet.add("black tee");
        clothingSet.add("white tee");
        clothingSet.add("levis");
        
        clothingTreeSet.addAll(clothingSet);
        System.out.println(clothingTreeSet);

        
    }
}
