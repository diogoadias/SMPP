import com.seleniumsoftware.SMPPSim.SMPPSim;

public class AppSMPPSim {

    public static void main(String[] args){
        System.out.println("Starting SMPP app");

        String[] smppArgs = new String[1];
        smppArgs[0] = "conf\\smppsim.props";

        try {
            SMPPSim.main(smppArgs);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
