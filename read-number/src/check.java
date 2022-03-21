public class check {
        public static void main(String[] args) {
        int b = 3;
        int a = 5;
        int temp;
        int cnt = 10;
        while (cnt > 0) {
            temp = a;
            a = b + a;
            b = temp;
            if(b%2==0){
                System.out.println(" " + b);
                cnt--;
            }
        }
    }
//    public static void main(String[] args) {
//        System.out.println("Số thứ 5 tính từ 5 là ");
//        int i = 9;
//        System.out.println(fibonacci(i));
//    }
//
//    public static int fibonacci(int n) {
//        if (n < 0) {
//            return -1;
//        } else if (n == 0 || n == 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
}
