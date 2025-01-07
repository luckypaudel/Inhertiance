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
//        for (int i = 0; i < allEvents.size(); i++) {
//            if(allEvents.get(i) instanceof MainStageEvent) {
//                System.out.println(allEvents.get(i).getEventName());
////                ((MainStageEvent) allEvents.get(i)).printTech();
//            }
//        }



while (true) {
//    for (int i = 0; i < allEvents.size(); i++) {
//        if(allEvents.get(i) instanceof MainStageEvent) {
//            System.out.println(allEvents.get(i).getEventName());
////                ((MainStageEvent) allEvents.get(i)).printTech();
//        }
//    }
    System.out.println("Welcome to the FolkFest");
    System.out.println("Press 1 to Add new event\n Press 2 to Search for an Event\n Press 3 to Filter by event type\n Press 4 to print events grouped together \n Press 5 to Add main stage tech  \n Press 6 to exit.");
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
    else if(choice == 2){
        System.out.println("What event are you searching for");
        String response = Library.input.nextLine();
        for (int i = 0; i < allEvents.size(); i++) {
            if(allEvents.get(i).getEventName().equals(response)){
                Event event = allEvents.get(i);
                System.out.println("Event Name: " + event.getEventName());
                System.out.println("Event Type: " + event.getEventType());
                System.out.println("Location: " + event.getLocation());
                System.out.println("Time: " + event.getTime());
            }
        }

    }
    else if(choice == 3){
        System.out.println("Enter type to filter by ");
        String eventType = Library.input.nextLine();
        for (Event event : allEvents) {
            if (eventType.equalsIgnoreCase("MainStageEvent") && event instanceof MainStageEvent) {
                System.out.println("Event Name: " + event.getEventName());
            } else if (eventType.equalsIgnoreCase("PopUps") && event instanceof PopUps) {
                System.out.println("Event Name: " + event.getEventName());
            } else if (eventType.equalsIgnoreCase("SmallStageEvent") && event instanceof SmallStageEvent) {
                System.out.println("Event Name: " + event.getEventName());
            }
        }
    }
    else if(choice == 4){
        System.out.println("Print events grouped by type");
        System.out.println("Non Music events");
        for (Event event : allEvents) {
            if (event instanceof NonMusicEvent) {
                System.out.println("Event name: " + event.getEventName());
            }
        }
            System.out.println("Main Stage events");
            for (Event event : allEvents) {
                 if (event instanceof MainStageEvent) {
                    System.out.println("Event name: " + event.getEventName());
                }
            }
                System.out.println("Small Stage events");
                for (Event event : allEvents) {
                    if(event instanceof SmallStageEvent){
                        System.out.println("Event name: " + event.getEventName());
                    }
        }
    }
    else if(choice == 5){
        System.out.println("Search for a main stage event by the name");
        String name = Library.input.nextLine();
        boolean found = false;
        for (Event event : allEvents){
if(event instanceof MainStageEvent && event.getEventName().equalsIgnoreCase(name) ){
    found = true;
    System.out.println("Main event found: " + event.getEventName());
    String newTech = Library.input.nextLine();
    ((MainStageEvent)event).addTech(newTech);
    System.out.println("Tech added succesfully!");

}
else if(!found){
    System.out.println("No event was found in Main stage. Try adding it first.");
    break;
}


        }
    }
    else if(choice == 6){
        System.out.println("Thanks for using the Folkfest Menu!");
break;
    }
}
    }
    public static void addEvent(){


    }

}
