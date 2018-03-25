package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** 英雄机 */
public class Hero extends FlyingObject {
	private static BufferedImage[] images;
	static{
		images = new BufferedImage[6];
		for(int i=0;i<images.length;i++){
			images[i] = loadImage("hero"+i+".png");
		}
	}
	
	private int life;
	private int doubleFire;
	public Hero(){
		super(97,124,140,400);
		life = 3;
		doubleFire = 0;
	}
	public void step(){
		System.out.println("英雄机切换图片啦");
	}
	public void moveTo(int x,int y){
		
	}
	
	int index = 0;
	int deadIndex = 2;
	public BufferedImage getImage(){
		if(isLife()){
			return images[index++%2];
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











