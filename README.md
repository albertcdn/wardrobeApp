# wardrobeApp
create digital copies of your wardrobe
This project allows you create different wardrobe sets using the classes FormalOutfit,
SummerOutfit, and WinterOutfit. To use the app you instantiate the test fixtures on whatever
class you need to use for the wardrobe set you are creating. This will empty the sets and from
here you would call the user wardrobe methods in each class that allow you to start populating the set.
From here you can print your wardrobe and see the different outfits you have. Their is also a class
called Wardrobe which you can insantiate to create your own wardrobe by populating the set. Their is 
methods in this class to sort the wardrobe and print it and also write the the wardrobe into a textfile.
In this class you can alternatively use the main method to get a list of my current wardrobe.

A) 4 classes with object class interaction - Outfit, SummerOutfit, WinterOutfit, FormalOutfit,
and ClearOutfits interact with eachother
B)Inheritance - SummerOutfit, WinterOutfit, FormalOutfit all inherit from the Outfit Class
C)Outfit is an abstract class you cannot instantiate but provides the layout for
different types of outfits
D)Interface - The ClearOutfits class is an interface that allows us to add a method to
the outfit classes that clears the sets
E)File input/output - Their is a method in the wardrobe class that allows you to write
the contents of the wardrobe to a text file
F)HashSets are used in the SummerOutfit, WinterOutfit, FormalOutfit, and Wardrobe classes
G)Used Sorting in the wardorp class
H)Test Fixtures - found in SummerOutfit, WinterOutfit, and FormalOutfit
I)main method used in Wardrobe Class
