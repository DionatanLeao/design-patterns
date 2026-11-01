package Estrutural.Bridge;

import Estrutural.Bridge.platforms.Facebook;
import Estrutural.Bridge.platforms.Platform;
import Estrutural.Bridge.platforms.TwitchTV;
import Estrutural.Bridge.platforms.YouTube;
import Estrutural.Bridge.transmissions.AdvancedLive;
import Estrutural.Bridge.transmissions.Live;

public class MainBridge {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
    }

    public static void startLive(Platform platform) {
//        System.out.println("... Aguarde");
//        Live live = new Live(platform);
//        live.broadCasting();
//        live.result();
        System.out.println("Transmissão avançada...aguarde");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadCasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();
    }
}
