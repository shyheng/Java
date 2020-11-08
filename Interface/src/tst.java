public class tst {
    public static void main(String[] args) {
        mymash mm = new mymash();
        mm.my(new shy(){
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },100,200);
    }
}
//纠正错误alt+回车