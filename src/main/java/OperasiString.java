public class OperasiString {
    public static void main(String[] args) {
        String kota = "Banjarbaru";
        System.out.println(kota);

        int usia;
        double ipk;

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);

        //B a n j a r b a r u
        //0 1 2 3 4 5 6 7 9 10
        System.out.println(kota.toUpperCase());
        System.out.println(kota.toLowerCase());
        System.out.println(kota.substring(5));
        System.out.println(kota.substring(1,5));

    }
}
