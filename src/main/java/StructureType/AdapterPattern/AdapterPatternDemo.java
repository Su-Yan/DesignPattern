package StructureType.AdapterPattern;

/**
 * 结构型模式-适配器模式
 * 作为两个不兼容的接口之间的桥梁
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond thie horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("avi","mind me.aci");
    }
}
