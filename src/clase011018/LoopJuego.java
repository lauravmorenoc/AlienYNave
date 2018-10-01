/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase011018;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext gc;
    private Carro carro;
    private Rectangulo rect;
    
    public LoopJuego(GraphicsContext gc){
        this.gc=gc;
        this.carro=new Carro(0, 200);
        this.rect=new Rectangulo(0, 200);
        
    }
    
    @Override
    public void handle(long l){
        double xpoints[]={10, 30, 60, 80, 10}; //Coordenadas de los vertices del polígono
       double ypoints[]={40, 20, 20, 10, 40};
        //gc.fillPolygon(ypoints, ypoints, xpoints.length);
        
        gc.clearRect(0, 0, 300, 300);
        gc.strokeRect(rect.getX(), rect.getY(), 20, 20);
        rect.mover();
       
        
}
}