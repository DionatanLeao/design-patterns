package Estrutural.Bridge.transmissions;

import Estrutural.Bridge.platforms.Platform;

public class AdvancedLive  extends Live {
    public AdvancedLive(Platform platform) {
        super.platform = platform;
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na Transmissão");
    }

    public void comments() {
        System.out.println("Comentários liberados na live");
    }
}
