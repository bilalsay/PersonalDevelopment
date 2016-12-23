package jen;

/**
 * Created by bilalsay on 23.12.2016.
 */
public class BoundedWildCard {


    static void showXY(Coords<?> c) {
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z);
    }

    static void showAll(Coords<? extends FourD> c) {
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + " " + c.coords[i].y + " " + c.coords[i].z + " " + c.coords[i].t);
    }


    public static void main(String args[]) {
        TwoD[] td = {
                new TwoD(0,0),
                new TwoD(7,9),
                new TwoD(18,4),
                new TwoD(-1,-23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        System.out.println("Contens of tdlocs ");
        showXY(tdlocs);
        // showXYZ(tdlocs); Hata, bir TreeD değil
        // showAll(tdlocs); Hata, bir FourD değil

        // Şimdi bazı FourD nesneleri oluştur

        FourD[] fd = {
                new FourD(1,2,3,4),
                new FourD(6,8,14,18),
                new FourD(22,9,4,9),
                new FourD(3,-2,-23,17)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);

        System.out.println("Contents of fdlocs ");

        // Bunların 3 de uygundur
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);


    }
}
