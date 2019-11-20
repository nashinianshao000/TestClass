public class 画星星 {
        public void XingXing(int z,boolean f){
                for (int x=1; x<=z; x++) {
                        if(!f){
                                for (int j = 1; j<=z-x; j++) {
                                        System.out.print(" ");
                                }
                        }
                        for (int i= 1; i<= x;i++) {
                                System.out.print("*");
                        }
                        System.out.println();
                }
        }
        public static void main(String[]args){
                画星星 p=new 画星星();
                p.XingXing(12,true);
        }
}