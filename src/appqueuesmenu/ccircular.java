/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueuesmenu;

public class ccircular {
    int[] datos;
    int tam;
    int p,u;
    
    public ccircular(int n)
    {
        tam = n;
        datos = new int [tam];
        p = u = -1;
    }
    
    public boolean insertar (int dato)
    {
        if((u == tam - 1) && (p == 0) || (u + 1 ==p))
            return false;
        else if(u == tam -1)
            u = 0;
        else 
            u++;
        datos[u] = dato;
        if(p == -1)
            p = 0;
        return true;
    }
//    ELIMINAR EL PRIMERO
//    OBJETO DE ENTRADA - SALIDA
    
    public boolean eliminar (Numero dato)
    {
        if(p == -1)
            return false;
        dato.num = datos[p];
        if(p == u)
        {
            datos[p] = -1;
            p = u = -1;
        }
        else
        {
            datos[p] = -1;
            p++;
        }
        return true;
    }
//    UTILIZAR ESTOS METODOS
//    EN LA CALSE Y EN LA APLICACION
    
    public boolean esta_vacia()
    {
        return (p == -1);
    }
    
    public boolean esta_llena()
    {
        int resul = (u + 1) % tam;
        return resul == p;
//        return (((u+1) % tam) == p);
    }
}
