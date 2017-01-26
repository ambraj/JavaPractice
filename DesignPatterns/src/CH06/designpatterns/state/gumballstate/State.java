package CH06.designpatterns.state.gumballstate;

public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
