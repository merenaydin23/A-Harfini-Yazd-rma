public class Main {
    public static void main(String[] args) {
        String[][]dizi=new String[6][4];
        for (int i=0;i<dizi.length;i++){
            for (int k=0;k< dizi[i].length;k++ ){
                if (i==0^i==2){
                    dizi[i][k]="*";
                }
                else if (k==0^k==3) {
                    dizi[i][k]="*";
                }
                else {
                    dizi[i][k]=" ";
                }
            }
        }
        for (int i=0;i< dizi.length;i++){
            for (int k=0;k<dizi[i].length;k++){
              if (k==3) {
                  System.out.print(dizi[i][k] + " ");
                  System.out.println();
              }
           else {
                  System.out.print(dizi[i][k] + " ");
              }
            }
        }






    }
}