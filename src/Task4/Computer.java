package Task4;

public class Computer {
    String name;

    public Computer(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Комп1");
        computers[1] = new Computer("Комп2");
        computers[2] = new Computer("Комп3");
        computers[3] = new Computer("Комп4");
        computers[4] = new Computer("Комп5");

        for (Computer computer : computers){
            System.out.println(computer.name);
        }
    }
}