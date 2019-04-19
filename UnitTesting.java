public class UnitTesting{
    public static int hrMinToMin(int hr, int min){
        int result = (hr*60)+min;
        return result;
    }
    public static void main(String[] args){
        assert hrMinToMin(0,0)==0 : "(0,0) should be 0";
        assert hrMinToMin(0,1)==1 : "(0,1) should be 1";
        assert hrMinToMin(1,0)==60 : "(1,0) should be 60";
        assert hrMinToMin(0,99)==99 : "(0,99) should be 99";
        assert hrMinToMin(5,0)==300 : "(5,0) should be 300";
        assert hrMinToMin(2,30)==150 : "(2,30) should be 150";
    }
}