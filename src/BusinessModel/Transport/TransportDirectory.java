/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BusinessModel.Transport;

import java.util.ArrayList;

/**
 *
 * @author aniketbhore
 */
public class TransportDirectory {
    private ArrayList<Transport> Transports;

    public ArrayList<Transport> getBuses() {
        return Transports;
    }

    public void setBuses(ArrayList<Transport> Ambulances) {
        this.Transports = Ambulances;
    }

    public TransportDirectory()
    {
         Transports = new ArrayList<>();
    }
     
    public Transport createBus(Transport bus) 
    {
        Transports.add(bus);
        return bus;
    }
}
