package core;

import core.controller.RechnerController;

public class PlayBook {

    public static void main(String[] args) {
	// write your code here
        RechnerController rechnerController = RechnerController.getObjController();
        rechnerController.init();
    }
}
