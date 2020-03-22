public class AttractionRide {
    public static void main(String[] args) {
        final int childsHeidht = 148;
        final boolean ChildrenWithParents = false;
        final boolean inputAttraction = ChildrenWithParents==true || childsHeidht >= 160;
        if (inputAttraction) {
            System.out.println("Можно пропускать на Аттракцион.");
        } else {
            System.out.println("Нельзя пропускать на Аттракцион.");
        }
    }
}