package Ex1_Animals;

class Dog extends Animal {
    // numLegs
    public Dog(String s) {
        super(s); //calls the parent's constructor
        this.numLegs = 4;
    }

    public void talk() {
        System.out.println(name + " is a dog that says \"Bark!\"");
    }

}