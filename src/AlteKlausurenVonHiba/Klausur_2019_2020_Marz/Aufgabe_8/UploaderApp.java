package AlteKlausurenVonHiba.Klausur_2019_2020_Marz.Aufgabe_8;

public class UploaderApp {
    public static void main(String[] args) {
        System.out.println("HALLO");
        String name = args[0];
        UploadVerifier verifier = new JavaFileVerifier();
        Uploadable file = new SimpleFile(name);
        Uploader uploader = new VerifyingUploader(verifier);
        if (uploader.upload(file)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }
}
