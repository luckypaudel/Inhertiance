package Ex3_MusicFestival;
class SmallStageEvent extends Event {

public String origin;


    public SmallStageEvent(String name, String type) {
        super(name, type);
        super.setLocation("Small Stage");

    }

    public void bandOrigin(String o){
        this.origin = o;
    }

}