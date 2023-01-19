/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata3.main;

import kata3.model.Histogram;
import kata3.model.Histogram;
import kata3.model.Mail;
import kata3.view.MailHistogramBuilder;
import kata3.view.MailListReader;
import kata3.view.HistogramDisplay;


/**
 *
 * @author Minerva
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram<String> histo= MailHistogramBuilder.build(MailListReader.read("emails.txt"));
        new HistogramDisplay(histo).execute();
        
        
    }
    
}
