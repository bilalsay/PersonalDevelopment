/**
 * Created by bilalsay on 18/02/2017.
 */
public class Gun {

    protected Sarsur sarsur;

    public void bam() {
        if (!(sarsur.getSarsurCapacity() > 0)) {
            System.out.println("Çıttt, çıt çıt....");
            return;
        }
        System.out.println("Bammm.....");
        sarsur.decreaseSarsurCapacity();

    }

    public void setSarsur(Sarsur sarsur) {
        this.sarsur = sarsur;
    }

}
