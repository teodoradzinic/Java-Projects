public class Elf extends RPGCharacter{
    public Elf(String name, String gender) {
        super(name, gender, Integer.MAX_VALUE);
    }
    public void shootArrow() {
        System.out.println("---> \uD83D\uDC9A");
    }
}
