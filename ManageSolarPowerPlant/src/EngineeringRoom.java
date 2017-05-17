import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by bilalsay on 22/04/2017.
 */
public class EngineeringRoom {

    public static void main(String args[]) {
        ManagementRemoteControl control = new ManagementRemoteControl();

        Switchyard switchyard = new Switchyard(1);

        /* htpanle 1 */
        HTPanel htPanel = new HTPanel(1);

        /* ------pTransformer1 */
        PowerTransformer powerTransformer1 = new PowerTransformer(1);
        Inverter inverter1 = new Inverter(1);

        SolarPanel solarPanel1_1 = new SolarPanel(1);
        SolarPanel solarPanel2_1 = new SolarPanel(2);
        SolarPanel solarPanel3_1 = new SolarPanel(3);
        SolarPanel solarPanel4_1 = new SolarPanel(4);

        inverter1.connectSolarPanel(solarPanel1_1);
        inverter1.connectSolarPanel(solarPanel2_1);
        inverter1.connectSolarPanel(solarPanel3_1);
        inverter1.connectSolarPanel(solarPanel4_1);

        powerTransformer1.connectInverter(inverter1);

        /* ------pTransformer2 */
        PowerTransformer powerTransformer2 = new PowerTransformer(2);
        Inverter inverter2 = new Inverter(2);

        SolarPanel solarPanel1_2 = new SolarPanel(1);
        SolarPanel solarPanel2_2 = new SolarPanel(2);
        SolarPanel solarPanel3_2 = new SolarPanel(3);
        SolarPanel solarPanel4_2 = new SolarPanel(4);

        inverter2.connectSolarPanel(solarPanel1_2);
        inverter2.connectSolarPanel(solarPanel2_2);
        inverter2.connectSolarPanel(solarPanel3_2);
        inverter2.connectSolarPanel(solarPanel4_2);

        powerTransformer2.connectInverter(inverter2);

        /* ------pTransformer3 */
        PowerTransformer powerTransformer3 = new PowerTransformer(3);
        Inverter inverter3 = new Inverter(3);

        SolarPanel solarPanel1_3 = new SolarPanel(1);
        SolarPanel solarPanel2_3 = new SolarPanel(2);
        SolarPanel solarPanel3_3 = new SolarPanel(3);
        SolarPanel solarPanel4_3 = new SolarPanel(4);

        inverter3.connectSolarPanel(solarPanel1_3);
        inverter3.connectSolarPanel(solarPanel2_3);
        inverter3.connectSolarPanel(solarPanel3_3);
        inverter3.connectSolarPanel(solarPanel4_3);

        powerTransformer3.connectInverter(inverter3);

        /* ------pTransformer4 */
        PowerTransformer powerTransformer4 = new PowerTransformer(4);
        Inverter inverter4 = new Inverter(4);

        SolarPanel solarPanel1_4 = new SolarPanel(1);
        SolarPanel solarPanel2_4 = new SolarPanel(2);
        SolarPanel solarPanel3_4 = new SolarPanel(3);
        SolarPanel solarPanel4_4 = new SolarPanel(4);

        inverter4.connectSolarPanel(solarPanel1_4);
        inverter4.connectSolarPanel(solarPanel2_4);
        inverter4.connectSolarPanel(solarPanel3_4);
        inverter4.connectSolarPanel(solarPanel4_4);

        powerTransformer4.connectInverter(inverter4);


        htPanel.connectPowerTransformer(powerTransformer1);
        htPanel.connectPowerTransformer(powerTransformer2);
        htPanel.connectPowerTransformer(powerTransformer3);
        htPanel.connectPowerTransformer(powerTransformer4);

        switchyard.connectHTPanel(htPanel);

        /* All of Commands */

        SolarPanelOnCommand solarPanelOnCommand1_1 = new SolarPanelOnCommand(solarPanel1_1);
        SolarPanelOnCommand solarPanelOnCommand2_1 = new SolarPanelOnCommand(solarPanel2_1);
        SolarPanelOnCommand solarPanelOnCommand3_1 = new SolarPanelOnCommand(solarPanel3_1);
        SolarPanelOnCommand solarPanelOnCommand4_1 = new SolarPanelOnCommand(solarPanel4_1);
        SolarPanelOnCommand solarPanelOnCommand1_2 = new SolarPanelOnCommand(solarPanel1_2);
        SolarPanelOnCommand solarPanelOnCommand2_2 = new SolarPanelOnCommand(solarPanel2_2);
        SolarPanelOnCommand solarPanelOnCommand3_2 = new SolarPanelOnCommand(solarPanel3_2);
        SolarPanelOnCommand solarPanelOnCommand4_2 = new SolarPanelOnCommand(solarPanel4_2);
        SolarPanelOnCommand solarPanelOnCommand1_3 = new SolarPanelOnCommand(solarPanel1_3);
        SolarPanelOnCommand solarPanelOnCommand2_3 = new SolarPanelOnCommand(solarPanel2_3);
        SolarPanelOnCommand solarPanelOnCommand3_3 = new SolarPanelOnCommand(solarPanel3_3);
        SolarPanelOnCommand solarPanelOnCommand4_3 = new SolarPanelOnCommand(solarPanel4_3);
        SolarPanelOnCommand solarPanelOnCommand1_4 = new SolarPanelOnCommand(solarPanel1_4);
        SolarPanelOnCommand solarPanelOnCommand2_4 = new SolarPanelOnCommand(solarPanel2_4);
        SolarPanelOnCommand solarPanelOnCommand3_4 = new SolarPanelOnCommand(solarPanel3_4);
        SolarPanelOnCommand solarPanelOnCommand4_4 = new SolarPanelOnCommand(solarPanel4_4);

        SolarPanelOffCommand solarPanelOffCommand1_1 = new SolarPanelOffCommand(solarPanel1_1);
        SolarPanelOffCommand solarPanelOffCommand2_1 = new SolarPanelOffCommand(solarPanel2_1);
        SolarPanelOffCommand solarPanelOffCommand3_1 = new SolarPanelOffCommand(solarPanel3_1);
        SolarPanelOffCommand solarPanelOffCommand4_1 = new SolarPanelOffCommand(solarPanel4_1);
        SolarPanelOffCommand solarPanelOffCommand1_2 = new SolarPanelOffCommand(solarPanel1_2);
        SolarPanelOffCommand solarPanelOffCommand2_2 = new SolarPanelOffCommand(solarPanel2_2);
        SolarPanelOffCommand solarPanelOffCommand3_2 = new SolarPanelOffCommand(solarPanel3_2);
        SolarPanelOffCommand solarPanelOffCommand4_2 = new SolarPanelOffCommand(solarPanel4_2);
        SolarPanelOffCommand solarPanelOffCommand1_3 = new SolarPanelOffCommand(solarPanel1_3);
        SolarPanelOffCommand solarPanelOffCommand2_3 = new SolarPanelOffCommand(solarPanel2_3);
        SolarPanelOffCommand solarPanelOffCommand3_3 = new SolarPanelOffCommand(solarPanel3_3);
        SolarPanelOffCommand solarPanelOffCommand4_3 = new SolarPanelOffCommand(solarPanel4_3);
        SolarPanelOffCommand solarPanelOffCommand1_4 = new SolarPanelOffCommand(solarPanel1_4);
        SolarPanelOffCommand solarPanelOffCommand2_4 = new SolarPanelOffCommand(solarPanel2_4);
        SolarPanelOffCommand solarPanelOffCommand3_4 = new SolarPanelOffCommand(solarPanel3_4);
        SolarPanelOffCommand solarPanelOffCommand4_4 = new SolarPanelOffCommand(solarPanel4_4);


        /* inverters Command */
        InverterOnCommand inverter1OnCommand = new InverterOnCommand(inverter1);
        InverterOnCommand inverter2OnCommand = new InverterOnCommand(inverter2);
        InverterOnCommand inverter3OnCommand = new InverterOnCommand(inverter3);
        InverterOnCommand inverter4OnCommand = new InverterOnCommand(inverter4);

        InverterOffCommand inverter1OffCommand = new InverterOffCommand(inverter1);
        InverterOffCommand inverter2OffCommand = new InverterOffCommand(inverter2);
        InverterOffCommand inverter3OffCommand = new InverterOffCommand(inverter3);
        InverterOffCommand inverter4OffCommand = new InverterOffCommand(inverter4);

        /* ht Panel command */

        HTPanelOnCommand htPanelOnCommand = new HTPanelOnCommand(htPanel);
        HTPanelOffCommand htPanelOffCommand = new HTPanelOffCommand(htPanel);

        /* Power Transformer Command */
        PowerTransformerOnCommand powerTransformerOnCommand1 = new PowerTransformerOnCommand(powerTransformer1);
        PowerTransformerOnCommand powerTransformerOnCommand2 = new PowerTransformerOnCommand(powerTransformer2);
        PowerTransformerOnCommand powerTransformerOnCommand3 = new PowerTransformerOnCommand(powerTransformer3);
        PowerTransformerOnCommand powerTransformerOnCommand4 = new PowerTransformerOnCommand(powerTransformer4);

        PowerTransformerOffCommand powerTransformerOffCommand1 = new PowerTransformerOffCommand(powerTransformer1);
        PowerTransformerOffCommand powerTransformerOffCommand2 = new PowerTransformerOffCommand(powerTransformer2);
        PowerTransformerOffCommand powerTransformerOffCommand3 = new PowerTransformerOffCommand(powerTransformer3);
        PowerTransformerOffCommand powerTransformerOffCommand4 = new PowerTransformerOffCommand(powerTransformer4);

        /* Switchyard Command */
        SwitchyardOnCommand switchyardOnCommand = new SwitchyardOnCommand(switchyard);
        SwitchyardOffCommand switchyardOffCommand = new SwitchyardOffCommand(switchyard);


        /* Set command */
        control.setOnCommand(0, switchyardOnCommand, switchyardOffCommand);
        control.setOnCommand(1, powerTransformerOnCommand1, powerTransformerOffCommand1);
        control.setOnCommand(2, powerTransformerOnCommand2, powerTransformerOffCommand2);
        control.setOnCommand(3, powerTransformerOnCommand3, powerTransformerOffCommand3);
        control.setOnCommand(4, powerTransformerOnCommand4, powerTransformerOffCommand4);
        control.setOnCommand(5, htPanelOnCommand, htPanelOffCommand);
        control.setOnCommand(6, inverter1OnCommand, inverter1OffCommand);
        control.setOnCommand(7, inverter2OnCommand, inverter2OffCommand);
        control.setOnCommand(8, inverter3OnCommand, inverter3OffCommand);
        control.setOnCommand(9, inverter4OnCommand, inverter4OffCommand);
        control.setOnCommand(10, solarPanelOnCommand1_1, solarPanelOffCommand1_1);
        control.setOnCommand(11, solarPanelOnCommand1_2, inverter1OffCommand);
        control.setOnCommand(12, inverter1OnCommand, solarPanelOffCommand1_2);
        control.setOnCommand(13, solarPanelOnCommand1_3, solarPanelOffCommand1_3);
        control.setOnCommand(14, solarPanelOnCommand1_4, solarPanelOffCommand1_4);
        control.setOnCommand(15, solarPanelOnCommand2_1, solarPanelOffCommand2_1);
        control.setOnCommand(16, solarPanelOnCommand2_2, solarPanelOffCommand2_2);
        control.setOnCommand(17, solarPanelOnCommand2_3, solarPanelOffCommand2_3);
        control.setOnCommand(18, solarPanelOnCommand2_4, solarPanelOffCommand2_4);
        control.setOnCommand(19, solarPanelOnCommand3_1, solarPanelOffCommand3_1);
        control.setOnCommand(20, solarPanelOnCommand3_2, solarPanelOffCommand3_2);
        control.setOnCommand(21, solarPanelOnCommand3_3, solarPanelOffCommand3_3);
        control.setOnCommand(22, solarPanelOnCommand3_4, solarPanelOffCommand3_4);
        control.setOnCommand(23, solarPanelOnCommand4_1, solarPanelOffCommand4_2);
        control.setOnCommand(24, solarPanelOnCommand4_2, solarPanelOffCommand4_2);
        control.setOnCommand(25, solarPanelOnCommand4_3, solarPanelOffCommand4_3);
        control.setOnCommand(26, solarPanelOnCommand4_4, solarPanelOffCommand4_4);




        /*Starter Stpper Assistant*/

        PowerPlantStarterStopperAssistant assistant = new PowerPlantStarterStopperAssistant(switchyard);
        assistant.start();


        /* Control */
        Scanner sc = new Scanner(System.in);
        System.out.println("Kontrol etmek istediğin display işlemi ve id yi gir: ");
        while (sc.hasNext()) {
            if (sc.nextInt() == 0)
                control.offWasTouched(sc.nextInt());
            else
                control.onWasTouched(sc.nextInt());
        }

    }
}
