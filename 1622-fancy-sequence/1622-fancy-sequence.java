import java.util.*;

class Fancy {
    static final long MOD = 1000000007L;
    List<Long> list;
    long mul;
    long add;

    public Fancy() {
        list = new ArrayList<>();
        mul = 1;
        add = 0;
    }

    public void append(int val) {
        long v = (val - add + MOD) % MOD;
        v = v * modInv(mul) % MOD;
        list.add(v);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = mul * m % MOD;
        add = add * m % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;
        long v = list.get(idx);
        return (int)((v * mul % MOD + add) % MOD);
    }

    long modInv(long x) {
        return modPow(x, MOD - 2);
    }

    long modPow(long a, long b) {
        long res = 1;
        a %= MOD;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % MOD;
            a = a * a % MOD;
            b >>= 1;
        }
        return res;
    }
}
