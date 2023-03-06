package by.home.behavioral.visitor;

public class JuniorDeveloper implements Developer {

    @Override
    public void create(by.home.behavioral.visitor.ProjectClass projectClass) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(by.home.behavioral.visitor.Test test) {
        System.out.println("Creating not reliable tests...");
    }
}
