import java.util.HashSet;
import java.util.Scanner;
/**
 * this is the child class of outfit that allows you to create summer outfits
 * 
 * @author Albert Cedeno
 * @version 5.11.17
 */
public class SummerOutfit implements ClearOutfits
{
    private String hat;
    private String shirt;
    private String pants;
    private String shoes;
    private Scanner keybd;
    private HashSet<SummerOutfit> summerOutfitSet;
   

    /**
     * Constructor for objects of class SummerOutfit
     */
    public SummerOutfit(String anyShirt, String anyPants, String anyShoes, String anyHat)
    {
       
        shirt = anyShirt;
        pants = anyPants;
        shoes = anyShoes;
        hat = anyHat;
        summerOutfitSet = new HashSet<>();
    }

    /**
     * this method lets you set the hat
     */
    public void setHat(String anyHat)
    {
        hat = anyHat;
    }

    /**
     * this method returns the hat
     */
    public String getHat(String anyHat)
    {
        return hat;
    }

    /**
     * this method allows you to add summer outfits to the set
     */
    public void userSummerSet()
    {
        keybd = new Scanner(System.in);
        String summerShirt;
        String summerPants;
        String summerShoes;
        String summerHat;
        String stopper = "stop";
        System.out.println("Enter the shirt or stop to end operation");
        summerShirt = keybd.nextLine();
        System.out.println("Enter the pants or stop to end operation");
        summerPants = keybd.nextLine();
        System.out.println("Enter the shoes or stop to end operation");
        summerShoes = keybd.nextLine();
        System.out.println("Enter the hat or stop to end the operation");
        summerHat = keybd.nextLine();
        while(!(summerShirt.equals(stopper)&summerPants.equals(stopper)&summerShoes.equals(stopper)&summerHat.equals(stopper))){
            summerOutfitSet.add(new SummerOutfit(summerShirt, summerPants, summerShoes,summerHat));
            System.out.println("Enter the shirt or stop to end operation");
            summerShirt = keybd.nextLine();
            System.out.println("Enter the pants or stop to end operation");
            summerPants = keybd.nextLine();
            System.out.println("Enter the shoes or stop to end operation");
            summerShoes = keybd.nextLine();
            System.out.println("Enter the hat or stop to end the operation");
            summerHat = keybd.nextLine();
        }
    }
    /**
     * this method prints the summer outfit info
     */
    public void printInfo()
    {
        System.out.println(super.toString() + "\nHat: " + hat);
    }
     /**
     * this method prints the summer outfits stored in the set
     */
    public void printOutfitSet()
    { for(SummerOutfit summerOutfitObject : summerOutfitSet){
            System.out.println(summerOutfitObject);
            System.out.println();
        }  

    }
     /**
     * this method clears the outfits in the set
     */
    public void clearOutfits()
    {
        summerOutfitSet.clear();
    }
}