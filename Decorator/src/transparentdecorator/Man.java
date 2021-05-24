package transparentdecorator;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 16:25
 * modifiedBy Miyuki 16:25
 **/

public class Man implements Human{
    @Override
    public void showName() {
        System.out.println("I'm Adam.");
    }
}
