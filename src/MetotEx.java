

public class MetotEx {

    static int power(int base, int exp){
        int result=1;
        for (int i=1;i<=exp;i++){
            result*=base;
        }
        System.out.println(result);
        return result;

    }
    public static void main(String[] args) {

    power(2,3);

    }
}
