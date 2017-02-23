import java.util.Random;

/**
 * Created by bilalsay on 19/02/2017.
 */
public abstract class Soldier {

    protected String name;
    public Location location;
    protected DisplayElement displayElement;
    protected Gun gun;

    public abstract Soldier move(int x, int y);

    public String getName() {

        return this.name;
    }

    public void setDisplayElement(DisplayElement displayElement) {

        this.displayElement = displayElement;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public Soldier changeSarsur(Sarsur sarsur) {

        this.gun.setSarsur(sarsur);
        System.out.println(name + " " + this.gun.sarsur.getSarsurCapacity() + " mermilik yeni bir şarşür  taktı");
        return this;
    }

    public DisplayElement getDisplayElement() {

        return this.displayElement;
    }

    public Soldier bamm() {
        System.out.println("Bammmmmm.   " + this.name + " ateş etti.");
        this.gun.sarsur.decreaseSarsurCapacity();
        System.out.println(this.name + "' in " + this.gun.sarsur.getSarsurCapacity() + " mermisi kaldı.");
        return this;
    }
}
