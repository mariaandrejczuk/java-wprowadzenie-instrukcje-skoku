public class DisplayElements {
    public static void main(String[] args) {
        int[] tab = {2,34,2,342,34,23,42,1,23,6,34,234323};

        System.out.println("-------continue--------");
        for(int i = 0; i < tab.length; i++){
            if(i%2 == 1) {  //jeżeli chcemy pominąć nieparzyste, czyli 1, 3, 5 itd, to warunek musi == 1
                continue;
            }
            System.out.println(tab[i]);
        }
        System.out.println("-------continue--------");
        for (int i = 0; i < tab.length; i++) {
            if (i%2 == 0) {
                System.out.println(tab[i]);
            }
        }
    }
}
