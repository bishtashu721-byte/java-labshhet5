interface Camera {
    void takePhoto();
}
interface MusicPlayer {
    void playMusic();
}
class Smartphone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() { System.out.println("Photo taken."); }
    @Override
    public void playMusic() { System.out.println("Music is playing."); }
}
public class Q16_SmartphoneInterfaces {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto(); phone.playMusic();
    }
}
