/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase011018;

/**
 *
 * @author Estudiante
 */
public class Rectangulo {
    private int x;
    private int y;

    public Rectangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void moverEnX(){
        this.x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
