/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J2SP0107;

/**
 *
 * @author PHONG VU
 */
public class Loading {

    public static void main(String[] args) {
        progressBar prg = new progressBar();
        prg.setVisible(true);
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                progressBar.lbload.setText("Operation is " + Integer.toString(i) + "% complete");
                progressBar.prload.setValue(i);
            }
        } catch (Exception e) {
        }
    }
}
