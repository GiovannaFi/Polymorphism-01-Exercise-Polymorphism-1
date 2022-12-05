import java.util.Objects;

public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }

    public void animalSound(){
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity){
        if (Objects.equals(intensity, "high")){
            System.out.println("Roarrrrrrrr!");
        } else if (Objects.equals(intensity, "low")){
            System.out.println("Roar!");
        } else {
            System.out.println("Cannot reproduce it properly");
        }
    }

}
