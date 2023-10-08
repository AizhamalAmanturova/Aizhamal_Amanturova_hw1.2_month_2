public class Boss extends Woman {
    public Boss(int age, String name, Character character) {
        super(age, name, character);

    }


    public void givingTask() {
        System.out.println("Finish the project");
    }
    public final void givingTask(String task) {
        System.out.println(task);
    }
}
