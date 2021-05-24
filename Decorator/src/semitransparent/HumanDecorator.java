package semitransparent;

/**
 * @author Miyuki
 * createdBy Miyuki 2021/5/23 16:26
 * modifiedBy Miyuki 16:26
 **/

public abstract class HumanDecorator implements Human {
    Human human;

    public HumanDecorator(Human human){
        this.human = human;
    }

    public void showName(){
        human.showName();
    }
}
