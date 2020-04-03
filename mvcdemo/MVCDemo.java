
package mvcdemo;

/**
 *
 * @author adm-achina
 */

public class MVCDemo {
    
    public static void main(String[] args) {
    	CalculatorView theView = new CalculatorView();
    	CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView,theModel);
        theView.setVisible(true);
    }
}