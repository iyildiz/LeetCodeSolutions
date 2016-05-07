package addtwonumbers;

/**
 * Created by iyildiz on 07/12/14.
 */
public final class Test4 {

    int x = 1000000000;
    class Inner {

        void test() {
            if(Test4.this.flag){
                sample();
            }
        }
    }

    private boolean flag = true;

    public void sample() {
        System.out.println("Sample");
    }

    Test4(){
        (new Inner()).test();
    }

    public static void main(String [] args){

        new Test4();
    }
}
