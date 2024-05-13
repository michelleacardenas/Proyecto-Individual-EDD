/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

import java.io.Serializable;

/**
 *
 * @author marip
 */
public class Proceso implements Serializable
{
    private int noPrioridad;
    private String nombre;
    private int quantums;

    public Proceso()
    {
    }

    public Proceso(int noPrioridad, String nombre, int quantums)
    {
        this.noPrioridad = noPrioridad;
        this.nombre = nombre;
        this.quantums = quantums;
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
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the quantums
     */
    public int getQuantums()
    {
        return quantums;
    }

    /**
     * @param quantums the quantums to set
     */
    public void setQuantums(int quantums)
    {
        this.quantums = quantums;
    }

    @Override
    public String toString()
    {
        return noPrioridad + "\t" + nombre + "\t" + quantums;
    }

    
    

    
    
}
