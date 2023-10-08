public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(55, "Magdalena", Character.POSITIVE);
        Mother mother = new Mother(1980, "Vera");
        Mother mother2 = new Mother(1975, "Kristi");

        System.out.println("Boss age is: " + boss.getAge() + " Her name is: " + boss.getName() + " She is: " + boss.getCharacter());
        System.out.println("Mother was born in: " + mother.getYear() + " Her name is: " + mother.getName());
        System.out.println("Mother2 was borrn in: " + mother2.getYear() + " Her name is: " + mother2.getName());
    }
}