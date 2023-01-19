/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kata5p2.main;

import kata5p2.model.Histogram;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.MailListReader;
import kata5p2.view.HistogramDisplay;


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
