package Ex1_Animals;
import java.util.ArrayList;
public class Ex1_Main {
    public static void run(){
ArrayList<Animal> allAnimals = new ArrayList<>();

allAnimals.add(new Animal("Peppy"));
        allAnimals.add(new Dog("Scout"));
        allAnimals.add(new Rotweiller ("Rubble"));
        allAnimals.add(new Shihtzu("Bubbles"));
        allAnimals.add(new Trout ("Slippy"));
      allAnimals.add(new Baboon("Chuckles", 750, "ape"));
//        for (int i = 0; i < allAnimals.size(); i++) {
//            allAnimals.get(i).talk();
//
//        }
        System.out.println("What do the dogs say");
        for (int i = 0; i < allAnimals.size(); i++) {
            if(  allAnimals.get(i) instanceof  Dog)


            allAnimals.get(i).talk();

        }
        System.out.println(allAnimals.get(5));
        System.out.println();
        System.out.println("Stupid AP Question #1");
        Animal a = new Rotweiller("AngryDog");
//        Rotweiller b = new Dog("Butch");
    }

}
