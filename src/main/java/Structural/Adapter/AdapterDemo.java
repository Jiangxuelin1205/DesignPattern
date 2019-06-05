package Structural.Adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "sing.mp3");
        audioPlayer.play("mp4", "sing2.mp4");
        audioPlayer.play("vlc", "sing3.vlc");
        audioPlayer.play("avi", "sing4.avi");
    }
}
