package core.controller;

import core.model.Expression;
import core.view.RechnungSeite;

// Calculator Controller
public class RechnerController {
    private static RechnerController objController = new RechnerController();

    private RechnerController(){

    }

    public static RechnerController getObjController(){
        return objController;
    }

    public void init(){
        RechnungSeite rechnungSeite = new RechnungSeite();
        Expression expression = new Expression();

        expression.setOp1(rechnungSeite.askOperand());
        expression.setOp2(rechnungSeite.askOperand());
        String operateur = rechnungSeite.askOperator();

        switch (operateur.toLowerCase().trim()){
            case "add" : rechnungSeite.displayResult(expression.addMethod());
                          break;
            case "div" : rechnungSeite.displayResult(expression.divMethod());
                         break;
            case "mul" : rechnungSeite.displayResult(expression.mulMethod());
                         break;
            case "subs" : rechnungSeite.displayResult(expression.subsMethod());
                          break;
        }


    }


}
