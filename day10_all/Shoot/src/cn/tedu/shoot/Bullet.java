package cn.tedu.shoot;
import java.util.Random;
import java.awt.image.BufferedImage;

/** 子弹 */
public class Bullet  extends FlyingObject{
	private static BufferedImage image;
	static{
		image = loadImage("bullet.png");
	}
	
	private int speed;
	public Bullet(int x,int y){
		super(8,14,x,y);
		speed = 3;
	}
	public void step(){
		System.out.println("子弹移动啦!");
	}
	
	public BufferedImage getImage(){
		if(isLife()){
			return image;
		}else if(isDead()){
			state = REMOVE;
		}
		return null;
	}
}
















