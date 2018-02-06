/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zegre
 */
public class clientwscalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(suma(2,5));
        System.out.println(resta (2,3));
    }

    private static int resta(int n1, int n2) {
        pac1.Calc_Service service = new pac1.Calc_Service();
        pac1.Calc port = service.getCalcPort();
        return port.resta(n1, n2);
    }

    private static int suma(int n1, int n2) {
        pac1.Calc_Service service = new pac1.Calc_Service();
        pac1.Calc port = service.getCalcPort();
        return port.suma(n1, n2);
    }


   
    
}
