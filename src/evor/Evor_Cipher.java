package evor;

import java.util.List;

public class Evor_Cipher {

    protected List<Long> generaCadenaAdicion(List<Long> lsListaCadenaAdicion, long lExponente) {
        long lBits = 1;
        do {
            lsListaCadenaAdicion.add(lBits);
        } while ((lBits *= 2) <= lExponente);
        return lsListaCadenaAdicion;
    }

    protected List<Long> metodoBinario(List<Long> lsListaCadenaAdicion, long lExponente) {
        int iIndiceInicial = 0;
        int iIndiceMitad;
        int iLongitudArreglo = lsListaCadenaAdicion.size() - 1;
        Long lUltimoElemento;
        Long lElementoCadena;
        while (iIndiceInicial <= iLongitudArreglo) {
            iIndiceMitad = (iIndiceInicial + iLongitudArreglo) / 2;
            lUltimoElemento = lsListaCadenaAdicion.get(lsListaCadenaAdicion.size() - 1);
            lElementoCadena = lUltimoElemento + lsListaCadenaAdicion.get(iIndiceMitad);
            if (lElementoCadena <= lExponente) {
                lsListaCadenaAdicion.add(lElementoCadena);
                iIndiceInicial = 0;
                iLongitudArreglo = lsListaCadenaAdicion.size() - 1;
            } else {
                iLongitudArreglo = iIndiceMitad - 1;
            }
        }
        return lsListaCadenaAdicion;
    }

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
