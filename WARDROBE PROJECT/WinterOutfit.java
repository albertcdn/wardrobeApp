import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * this is the child class of outfit that allows you to create winter outfits
 * 
 * @author Albert Cedeno
 * @version 5.10.17
 */
public class WinterOutfit extends Outfit implements ClearOutfits
{
    private String jacket;
    private Scanner keybd;
    private HashSet<WinterOutfit> winterOutfitSet;

    /**
     * Constructor for objects of class WinterOutfit
     */
    public WinterOutfit(String anyShirt, String anyPants, String anyShoes, String anyJacket)
    {
        super("shirt", "pants", "shoes");
        jacket = anyJacket;
        winterOutfitSet = new HashSet<>();
    }

    /**
     * this method lets you set the jacket
     */
    public void setJacket(String anyJacket)
    {
        jacket = anyJacket;
    }

    /**
     * this method lets you return the jacket
     */
    public String getJacket()
    {
        return jacket;

    }

    /**
     * this method allows the user to add winter outfits to the set
     */
    public void userWinterSet()
    {
        keybd = new Scanner(System.in);
        String winterShirt;
        String winterPants;
        String winterShoes;
        String winterJacket;
        String stopper = "stop";
        System.out.println("Enter the shirt or stop to end operation");
        winterShirt = keybd.nextLine();
        System.out.println("Enter the pants or stop to end operation");
        winterPants = keybd.nextLine();
        System.out.println("Enter the shoes or stop to end operation");
        winterShoes = keybd.nextLine();
        System.out.println("Enter the jacket or stop to end the operation");
        winterJacket = keybd.nextLine();
        while(!(winterShirt.equals(stopper)&winterPants.equals(stopper)&winterShoes.equals(stopper)&winterJacket.equals(stopper))){
            winterOutfitSet.add(new WinterOutfit(winterShirt, winterPants, winterShoes,winterJacket));
            System.out.println("Enter the shirt or stop to end operation");
            winterShirt = keybd.nextLine();
            System.out.println("Enter the pants or stop to end operation");
            winterPants = keybd.nextLine();
            System.out.println("Enter the shoes or stop to end operation");
            winterShoes = keybd.nextLine();
            System.out.println("Enter the jacket or stop to end the operation");
            winterJacket = keybd.nextLine();
        }

    }

    /**
     * this method prints the winter outfit info
     */
    public void printInfo()
    {
        System.out.println(super.toString() + "\nJacket: " + jacket);
    }

    /**
     * this method prints the winter outfits stored in the set
     */
    public void printOutfitSet()
    { for(WinterOutfit winterOutfitObject : winterOutfitSet){
            winterOutfitObject.printInfo();
            System.out.println();
        }  

    }

    /**
     * this method clears the outfits in the set
     */
    public void clearOutfits()
    {
        winterOutfitSet.clear();
    }

   
}
