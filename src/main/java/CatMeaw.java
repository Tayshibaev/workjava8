public interface CatMeaw {
    void canMeaw();
    default void canMurMur(){
        System.out.println("MurMurMur");
    }
}
