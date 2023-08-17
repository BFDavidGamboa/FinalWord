package finalword;

public final class FinalClass {

    //Variables marcadas como final
    public final int varNumber = 10;

    //constantes en Java
    public static final int VAR_PRIMITIVE = 15;

    public static final Person VAR_PERSON = new Person();

    //final method, we'll see in detail in the overwrite theme
    public final void finalMethod(){}
    
}
// If the definition of this method isn't final it should not modify the parent class
//class DaughterClass extends FinalClass {
//    public void finalMethod(){}
//}
