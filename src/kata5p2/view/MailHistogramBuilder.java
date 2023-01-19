/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata5p2.view;

import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Histogram;
import kata5p2.model.Mail;

/**
 *
 * @author Minerva
 */
public class MailHistogramBuilder {
    
    
    public static Histogram<String> build (ArrayList<Mail> correos){
        Histogram<String> histo= new Histogram();
        for (int i = 0; i < correos.size(); i++) {
            histo.increment(correos.get(i).getDomain());
            
        }
        return histo;
    }
}
