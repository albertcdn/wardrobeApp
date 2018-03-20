import java.util.HashSet;
import java.util.Scanner;
/**
 * this is the child class of outfit that allows you to create formal outfits
 * 
 * @author Albert Cedeno 
 * @version 5.11.17
 */
public class FormalOutfit extends Outfit implements ClearOutfits
{
    private String suit;
    private String tie;
    private HashSet<FormalOutfit> formalOutfitSet;
    private Scanner keybd;

    /**
     * Constructor for objects of class FormalOutfit
     */
    public FormalOutfit(String anyShirt, String anyPants, String anyShoes, String anySuit, String anyTie)
    {
        super("shirt", "pants", "shoes");
        suit = anySuit;
        tie = anyTie;
        formalOutfitSet = new HashSet<>();
    }

    /**
     * this method lets you set the tuxedo
     */
    public void setSuit(String anySuit)
    {
        suit = anySuit;
    }

    /**
     * this method lets you set the tie
     */
    public void setTie(String anyTie)
    {
        tie = anyTie;
    }

    /**
     * this method returns the tuxedo
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * this method returns the tie
     */
    public String getTie()
    {
        return tie;
    }

    /**
     * this method allows the user to add formal outfits to the set
     */
    public void userFormalSet()
    {
        keybd = new Scanner(System.in);
        String formalShirt;
        String formalPants;
        String formalShoes;
        String formalSuit;
        String formalTie;
        String stopper = "stop";
        System.out.println("Enter the shirt or stop to end operation");
        formalShirt = keybd.nextLine();
        System.out.println("Enter the pants or stop to end operation");
        formalPants = keybd.nextLine();
        System.out.println("Enter the shoes or stop to end operation");
        formalShoes = keybd.nextLine();
        System.out.println("Enter the suit or stop to end the operation");
        formalSuit = keybd.nextLine();
        System.out.println("Enter the tie or stop to end the operation");
        formalTie = keybd.nextLine();
        while(!(formalShirt.equals(stopper)&formalPants.equals(stopper)&formalShoes.equals(stopper)&formalSuit.equals(stopper)&formalTie.equals(stopper))){
            formalOutfitSet.add(new FormalOutfit(formalShirt, formalPants, formalShoes, formalSuit, formalTie));
            System.out.println("Enter the shirt or stop to end operation");
            formalShirt = keybd.nextLine();
            System.out.println("Enter the pants or stop to end operation");
            formalPants = keybd.nextLine();
            System.out.println("Enter the shoes or stop to end operation");
            formalShoes = keybd.nextLine();
            System.out.println("Enter the suit or stop to end the operation");
            formalSuit = keybd.nextLine();
            System.out.println("Enter the tie or stop to end the operation");
            formalTie = keybd.nextLine();
        }

    }

    /**
     * this method prints the formal outfit info
     */
    public void printInfo()
    {
        System.out.println(super.toString() + "\nSuit: " + suit + "\nTie: " + tie);
    }

    /**
     * this method prints the formal outfits stored in the set
     */
    public void printOutfitSet()
    { for(FormalOutfit formalOutfitObject : formalOutfitSet){
            formalOutfitObject.printInfo();
            System.out.println();
        }  

    }

    /**
     * this method clears the outfits in the set
     */
    public void clearOutfits()
    {
        formalOutfitSet.clear();
    }

}
