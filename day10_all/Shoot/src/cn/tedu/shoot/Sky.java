package cn.tedu.shoot;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
/** 天空 */
public class Sky extends FlyingObject{
	private static BufferedImage image;
	static{
		image = loadImage("background.png");
	}
	
	private int speed;
	private int y1;
	public Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
		speed = 1;
		y1 = -height;
	}
	public void step(){
		System.out.println("天空移动啦!");
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public void paintObject(Graphics g){
		g.drawImage(getImage(),x,y,null);
		g.drawImage(getImage(),x,y1,null);
	}
}













