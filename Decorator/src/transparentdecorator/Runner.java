package transparentdecorator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 16:28
 * modifiedBy Miyuki 16:28
 **/

public class Runner extends HumanDecorator{
    public Runner(Human human) {
        super(human);
    }

    @Override
    public void showName() {
        human.showName();
        setRunner(human);
    }

    private void setRunner(Human human){
        System.out.println("I'm running");
    }
}
