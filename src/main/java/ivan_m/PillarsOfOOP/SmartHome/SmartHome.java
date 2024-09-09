package ivan_m.PillarsOfOOP.SmartHome;

public class SmartHome {
    private CleaningRobot cleaningRobot = new CleaningRobot();
    private Stove stove = new Stove();
    public void clean(){
        cleaningRobot.speak();
        cleaningRobot.engineStart(); //как при инкапсуляции выводить сообщения, если при описании классов этого делать нельзя?
        cleaningRobot.go();
    }

    public void cook(){
        stove.speak();
        stove.turnOnTheGas();
    }
}
