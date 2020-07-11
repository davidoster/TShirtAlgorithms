/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtalgorithms;

/**
 *
 * @author mac
 */
public class TimePerformance {
    long startTime = 0;
    long endTime = 0;
    
    public TimePerformance() {
        startTime = System.currentTimeMillis();
    }
    
    protected void stopTiming() {
        endTime = System.currentTimeMillis();
    }
    
    public long timeLapse() {
       this.stopTiming();
       long lapse = endTime - startTime;
       return(lapse);
    }
}
