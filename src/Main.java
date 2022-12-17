import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TyresFactory tyresFactory=new TyresFactory();
        Tyres tyres=tyresFactory.getTyres("bosh");
        System.out.println(tyres.rotate());

        TyresFactory tyresFactory1=new TyresFactory();
        Tyres tyres1=tyresFactory1.getTyres("mrf");
        System.out.println(tyres1.rotate());

        System.out.println("Enter your speaker type ");
        Scanner scanner=new Scanner(System.in);
        String speakerType= scanner.next();

        SpeakerFactory speakerFactory=new SpeakerFactory();
        Speakers speakers= speakerFactory.getSpeaker(speakerType);
        System.out.println(speakers.makeSound());


    }
}