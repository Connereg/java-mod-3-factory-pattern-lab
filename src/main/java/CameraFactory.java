public class CameraFactory {
    public enum CameraManufacturer {
        NIKON_FILM("Nikon Film"),
        CANON_FILM("Canon Film");

        String name;

        private CameraManufacturer(String name) {
            this.name = name;
        }
    }

    public static Camera makeCamera(CameraManufacturer makeType) {
        // USING ENUMS TO DETERMINE CAMERA MAKE TYPE INSTANCE
        if (makeType == CameraManufacturer.NIKON_FILM) {
            return new NikonCamera(new NikonFilm(), new NikonShutter(), new NikonMirror());
        }
        else if (makeType == CameraManufacturer.CANON_FILM) {
            return new CanonCamera(new CanonFilm(), new CanonShutter(), new CanonMirror());
        }

        return null; // WILL NEVER HAPPEN BECAUSE WE ARE USING AN ENUM, BUT REQUIRES TO SATISFY COMPILER
    }

}
