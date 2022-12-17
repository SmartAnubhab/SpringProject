public class NoSpeakerException implements Speakers{
    @Override
    public String makeSound() {
        return "No speaker found";
    }
}
