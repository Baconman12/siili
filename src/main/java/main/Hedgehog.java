package main;

public class Hedgehog {
    public String name;
    public int age;

    public Hedgehog(){
        name = "Pikseli";
        age = 5;
    }
    public Hedgehog(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void run(int laps){
        for (int i = 1; i<=laps; i++){
        System.out.println(name + " juoksee kovaa vauhtia!");
        }
}
}
