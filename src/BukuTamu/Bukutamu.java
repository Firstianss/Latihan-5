package BukuTamu;
public class Bukutamu {
    private static int ID=1;
    private static final String arr[][]= new String [3][25];
    public static void nama(String a, int b){
        arr[1][b]= a;
        String x = Integer.toString(ID);
        arr[0][b]=x;
    }
    public static void alamat(String a, int b){
        arr[2][b]=a;
    }
    public static void tampil(){
        System.out.println("==================================================");
        System.out.println("==================== Daftar Tamu =================");
        System.out.println("==================================================");
        System.out.println("||\tID\t||\tNama\t||\tAlamat\t||");
        for(int i=0; i<ID; i++){
            for(int j=0; j<3; j++){
                System.out.print("||\t"+arr[j][i]+"\t");
                if(j==2){
                    System.out.print("||");}
            }
            System.out.println("");
        }
        System.out.println("==================================================");
        ID++;
    }
}
