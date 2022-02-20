public abstract class RPGCharacter {
    private String name;
    private String gender;
    private Integer lifePoints;

    public RPGCharacter(String name,
                        String gender,
                        Integer lifePoints) {
        this.name = name;
        this.gender = gender;
        this.lifePoints = lifePoints;
    }
}
