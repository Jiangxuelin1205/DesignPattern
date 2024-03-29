package Structural.Adapter;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp3":
                System.out.println("Playing mp3 file. Name: " + fileName);
                break;
            case "mp4":
            case "vlc":
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
                break;
            default:
                System.out.println(audioType + " is not support");
                break;
        }
    }
}
