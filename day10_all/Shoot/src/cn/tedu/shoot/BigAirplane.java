package cn.tedu.shoot;
import java.awt.image.BufferedImage;
import java.util.Random;

/** 大敌机 */
public class BigAirplane extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[5];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("bigplane"+i+".png");
		}
	}
	
	private int speed;
	public BigAirplane(){
		super(69,98);
		Random rand = new Random();
		speed = rand.nextInt(3)+1;
	}
	public void step(){
		System.out.println("大敌机移动啦!");
	}
	
	int deadIndex = 1;
	public BufferedImage getImage(){
		if(isLife()){
			return images[0];
		}else if(isDead()){
			BufferedImage img = images[deadIndex++];
			if(deadIndex==images.length){
				state = REMOVE;
			}
			return img;
		}
		return null;
	}
}










