package main;

import car.RaceCar;
import control.BaseController;
import control.RallyController;
import control.SpeedController;
import control.SafeController;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        try {
            /**
             * Start a run with given settings: - username: used for statistics,
             * trackname: possible values are: - spafrancorchamps1024 - silverstone1024 - interlagos1024 - texas1024
             */

            BaseController controller = new SpeedController();
            String trackname = "interlagos1024";


            RaceCar app = new RaceCar("SampleCar", trackname, controller, false);

            app.setDisplayFps(false);
            app.setDisplayStatView(false);
            app.start();
        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
