/**
 *
 * @author Henk Beula
 */
public class RemoteController implements Controller{
    //Attrs
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //special methods
    public RemoteController(){
        this.volume=50;
        this.ligado=false;
        this.tocando=false;
    }
    
    private int getVolume(){
        return volume;
    }
    
    private void setVolume(int volume){
        this.volume=volume;
    }
    
    private boolean isOn(){
        return ligado;
    }
    
    private void setOn(boolean ligado){
        this.ligado=ligado;
    }
    
    private boolean isPlaying(){
        return tocando;
    }
    
    private void setPlay(boolean tocando){
        this.tocando=tocando;
    }
    
    //metodos abstratos
    @Override
    public void turnOn() {
        this.setOn(true);
    }

    @Override
    public void turnOff() {
        this.setOn(false);
    }

    @Override
    public void openMenu() {
        if(this.isOn()){
           System.out.println("It's on? " + this.isOn());
           System.out.println("It's on? " + this.isOn());
           System.out.print("Volume: " + this.getVolume());
           for(int i=5;i<=this.getVolume();i+=5)
               System.out.print("||||||");
        }
        
    }

    @Override
    public void closeMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void volumePlus() {
        if(this.isOn())
            this.setVolume(this.getVolume()+5);
    }

    @Override
    public void volumeDecrease() {
        if(this.isOn())
            this.setVolume(this.getVolume()-5);
    }

    @Override
    public void mute() {
        if(this.isOn() && this.getVolume()>0)
            this.setVolume(0);
    }

    @Override
    public void unmute() {
        if(this.isOn() && this.getVolume()==0)
            this.setVolume(50);
    }

    @Override
    public void play() {
        if(this.isOn() && this.isPlaying()==false)
            this.setPlay(true);
    }

    @Override
    public void pause() {
        if(this.isOn() && this.isPlaying())
            this.setPlay(false);
    }
    
}
