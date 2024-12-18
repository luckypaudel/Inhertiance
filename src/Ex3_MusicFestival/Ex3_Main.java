package Ex3_MusicFestival;
import java.util.ArrayList;
public class Ex3_Main {

    public static void run(){
        ArrayList<Event> allEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Walk Off The Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("Bon Iver", "Music"));
        allEvents.add(new MainStageEvent("The Lumineers", "Music"));
        allEvents.add(new MainStageEvent("Fleet Foxes", "Music"));
        allEvents.add(new MainStageEvent("Beirut", "Music"));

        allEvents.add(new PopUps("Curry Connection", "Food Truck", "Food Truck 9", "TSeries"));
        allEvents.add(new PopUps("Lunchly", "Pavillion", "Core", "Logan Paul"));
        allEvents.add(new PopUps("Feastables", "Food Truck", "Beast Corner" ,"Mr.Beast"));
        allEvents.add(new PopUps("Bean Toss", "Games", "Playground", "Zog"));
        allEvents.add(new PopUps("Human Fooseball", "Games", "Hockey Rink", "Rogers"));

        allEvents.add(new SmallStageEvent("Kids Bop", "Music"));
        allEvents.add(new SmallStageEvent("Drake", "Music"));
        allEvents.add(new SmallStageEvent("Marshmello", "Music"));
        allEvents.add(new SmallStageEvent("Chance The Rapper", "Music"));
        allEvents.add(new SmallStageEvent("KSI", "Music"));


        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");
        for (int i = 0; i < allEvents.size(); i++) {
            if(allEvents.get(i) instanceof MainStageEvent) {
                System.out.println(allEvents.get(i).getEventName());
//                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }



while (true) {
    for (int i = 0; i < allEvents.size(); i++) {
        if(allEvents.get(i) instanceof MainStageEvent) {
            System.out.println(allEvents.get(i).getEventName());
//                ((MainStageEvent) allEvents.get(i)).printTech();
        }
    }
    System.out.println("Welcome to the FolkFest");
    System.out.println("Press 1 to Add new event\n Press 2 to Search for an Event\n Press 3 to Filter by event type\n Press 4 to Exit");
    int choice = Library.input.nextInt();
    Library.input.nextLine();
    if (choice == 1) {
        System.out.println("What type of event is it? (SmallStageEvent, MainStageEvent ,NonMusicEvent or Popups");
        String newEvent = Library.input.nextLine();

        if(newEvent.toLowerCase().contains("small")){

            System.out.println("What is the name?");
            String newName = Library.input.nextLine();
            System.out.println("What is the type");
            String newType = Library.input.nextLine();
        allEvents.add(new SmallStageEvent(newName, newType));

        }
        else if(newEvent.toLowerCase().contains("main")){

            System.out.println("What is the name?");
            String newName = Library.input.nextLine();
            System.out.println("What is the type");
            String newType = Library.input.nextLine();
            allEvents.add(new MainStageEvent(newName, newType));

        }
        else if(newEvent.toLowerCase().contains("non")){
            System.out.println("What is the name?");
            String newName = Library.input.nextLine();
            System.out.println("What is the type");
            String newType = Library.input.nextLine();
            System.out.println("Where is the location");
            String newLocation = Library.input.nextLine();
            allEvents.add(new NonMusicEvent(newName, newType, newLocation));

        }
        else if(newEvent.toLowerCase().contains("pop")){
            System.out.println("What is the name?");
            String newName = Library.input.nextLine();
            System.out.println("What is the type");
            String newType = Library.input.nextLine();
            System.out.println("Where is the location");
            String newLocation = Library.input.nextLine();
            System.out.println("Who is the sponsor");
            String newSponsor = Library.input.nextLine();
            allEvents.add(new PopUps(newName, newType,newLocation, newSponsor ));

        }
        else {
            System.out.println("Try again");
        }
    }
    if(choice == 2){
        System.out.println("What event are you searching for");
        String response = Library.input.nextLine();
        for (int i = 0; i < allEvents.size(); i++) {
            if(allEvents.equals(response)){
                System.out.println(allEvents.get(i).getEventName());
            }
        }

    }
    if(choice == 3){
        System.out.println("not yet implemented");
    }
    if(choice == 4){
        System.out.println("Thanks!");

    }
}
    }
    public static void addEvent(){


    }

}
