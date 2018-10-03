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
        this.carro=new Carro(10, 40);
        this.rect=new Rectangulo(0, 200);
        
    }
    
    @Override
    public void handle(long l){
        double xpoints[]={carro.getChasis().getX(), carro.getChasis().getX()+20, carro.getChasis().getX()+50, carro.getChasis().getX()+70, carro.getChasis().getX()}; //Coordenadas de los vertices del polígono
       double ypoints[]={carro.getChasis().getY(), carro.getChasis().getY()-20, carro.getChasis().getY()-20, carro.getChasis().getY(), carro.getChasis().getY()};
        //gc.fillPolygon(ypoints, ypoints, xpoints.length);
        
        gc.clearRect(0, 0, 700, 700);
        gc.strokePolygon(xpoints, ypoints, xpoints.length);
        gc.strokeRect(carro.getChasis().getX()-20, carro.getChasis().getY(), 110, 20);
        gc.strokeOval(carro.getLlantas()[0].getX(), carro.getLlantas()[0].getY(), 20, 20);
        gc.strokeOval(carro.getLlantas()[1].getX(), carro.getLlantas()[1].getY(), 20, 20);
        carro.moverEnX();
       
        
}
}