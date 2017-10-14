//Make a toy class
 class Toy {
    String name = "Mr.Cellophane ";
    int number = 0;
//Make a method that changes the varibles
    void changer() {
        String name = "Hot Shot ";
        int number = 42;
//Print vars
        System.out.println(name + number);
    }

}




public class Sec2Chap5 {

    public static void main(String[] args) {
    Toy toy = new Toy();
    System.out.println(toy.name + toy.number);
    toy.changer();

    }
}
