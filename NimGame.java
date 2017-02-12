public class NimGame {
    public boolean canWinNim(int n) {
        int x = n%4;
        if(n==2 || x!=0)
            return true;
        return false;
    }
}