
/**
 * This is the super class Outfit in which other classes inherit the basic requirements for an outfit
 * 
 * @author Albert Cedeno
 * @version 5.10.17
 */
public abstract class Outfit
{
    public String shirt;
    private String pants;
    private String shoes;

    /**
     * Constructor for objects of class Outfit
     */
    public Outfit(String anyShirt, String anyPants,String anyShoes)
    {
        shirt = anyShirt;
        pants = anyPants;
        shoes = anyShoes;

    }

    /**
     * this method allows you to set the shirt
     */
    public void setShirt(String anyShirt){
        shirt = anyShirt; 

    }

    /**
     * this method allows you to set the pants
     */
    public void setPants(String anyPants){
        pants = anyPants;
    }

    /**
     * this methos allows you to set the shoes
     */
    public void setShoes(String anyShoes){
        shoes = anyShoes;
    }

    /**
     * this method returns the shirt
     */
    public String getShirt(){
        return shirt;

    }

    /**
     * this method returns the pants
     */
    public String getPants(){
        return pants;
    }

    /**
     * this method returns the shoes
     */
    public String getShoes(){
        return shoes;
    }

    /**
     * this method converts the outfit info to a string
     */
    public String toString()
    {
        String outfitString = ("Shirt: " + shirt+ "\nPants: " + pants + "\nShoes: " + shoes);
        return outfitString;
    }
    /**
     * this method prints the outfir info
     */
    public void printInfo()
    {
        System.out.println(this);
        
        
    }
}
