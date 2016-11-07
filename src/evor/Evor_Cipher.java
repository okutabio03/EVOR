package evor;

public class Evor_Cipher {
    protected int euclides(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    protected int euclidesExtendido(int a, int b) {
        int i = b, v = 0, d = 1;
        while (a > 0) {
            int t = i / a, x = a;
            a = i % x;
            i = x;
            x = d;
            d = v - t * x;
            v = x;
        }
        v %= b;
        if (v < 0) v = (v + b) % b;
        return v;
    }
}
