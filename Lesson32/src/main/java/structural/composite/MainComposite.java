package by.home.structural.composite;

public class MainComposite {

    public static void main(String[] args) {
        by.home.structural.composite.Team team = new by.home.structural.composite.Team();
        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new PhpDeveloper());
        team.addDeveloper(new JavaDeveloper());
        team.writeCode();
    }
}
