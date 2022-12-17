public class TyresFactory {
    Tyres getTyres(String tyreType){
        if (tyreType==null){
            return null;
        }
        else if (tyreType.equalsIgnoreCase("mrf")){
            return new MRFtyres();
        }
        else if (tyreType.equalsIgnoreCase("bosh")) {
            return new BOSHtyres();
        }
        return null;
    }
}
