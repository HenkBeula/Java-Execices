/**
 *
 * @author Henk Beula
 */
public interface Controller {
    //metodos abstratos
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void openMenu();
    public abstract void closeMenu();
    public abstract void volumePlus();
    public abstract void volumeDecrease();
    public abstract void mute();
    public abstract void unmute();
    public abstract void play();
    public abstract void pause();
}
