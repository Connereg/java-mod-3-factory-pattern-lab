public class NikonMirror implements MirrorOperations {
    public void openMirror() {
        Logger.getInstance().log(getName() + " has opened its mirror");
    }

    public void closeMirror() {
        Logger.getInstance().log(getName() + " has closed its mirror");
    }

    public String getName() {
        return "Nikon Mirror";
    }
}
