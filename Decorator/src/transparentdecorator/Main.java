package transparentdecorator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 16:30
 * modifiedBy Miyuki 16:30
 **/

public class Main {
    public static void main(String[] args) {
        Human adam = new Man();
        Human runner = new Runner(adam);
        runner.showName();
    }
}
