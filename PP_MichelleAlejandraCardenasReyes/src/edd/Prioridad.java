/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import edd.ColaCircularD;
import java.io.Serializable;
/**
 *
 * @author marip
 */
public class Prioridad implements Serializable
{
    private int noPrioridad;
    public ColaCircularD co;

    public Prioridad()
    {
    }

    public Prioridad(int noPrioridad, ColaCircularD co)
    {
        this.noPrioridad = noPrioridad;
        this.co = co;
    }

    /**
     * @return the noPrioridad
     */
    public int getNoPrioridad()
    {
        return noPrioridad;
    }

    /**
     * @param noPrioridad the noPrioridad to set
     */
    public void setNoPrioridad(int noPrioridad)
    {
        this.noPrioridad = noPrioridad;
    }

    /**
     * @return the co
     */
    public ColaCircularD getCo()
    {
        return co;
    }

    /**
     * @param co the co to set
     */
    public void setCo(ColaCircularD co)
    {
        this.co = co;
    }

    @Override
    public String toString()
    {
        return "Prioridad{" + "noPrioridad=" + noPrioridad + ", co=" + co + '}';
    }
    
    
    
}
