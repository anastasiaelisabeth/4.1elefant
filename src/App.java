
public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int tal1 = 4;
        int tal2 = 5;

        double kvot;
        double produkt;

        produkt = tal1/tal2;

        System.out.println(" ange tal 1 "+tal1);
        System.out.println(" ange tal 2 "+tal2);
        System.out.println(" kvoten är: "+(double)tal1/tal2);
        System.out.println(" svaret är: "+tal1/tal2);

        Scanner scan = new Scanner(System.in);
        System.out.println();
        
        System.out.println("ange ett substantiv");
        String substantiv = scan.nextLine();
        System.out.println("ange ditt substantivs pluraländelse");
        String pluraländelse = scan.nextLine();
        System.out.println("En "+substantiv+" flera "+substantiv+pluraländelse+"");

    }
}
