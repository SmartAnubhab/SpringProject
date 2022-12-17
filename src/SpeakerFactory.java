public class SpeakerFactory {

    public Speakers getSpeaker(String speakerType){
        if (speakerType == null) {
            return new NoSpeakerException();
        }
        else if (speakerType.equalsIgnoreCase("Bose")){
            return new BoseSpeakers();
        }
        else if (speakerType.equalsIgnoreCase("Sony")){
            return new SonySpeakers();
        }
        return null;
    }
}
