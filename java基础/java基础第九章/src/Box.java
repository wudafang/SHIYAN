
public class Box {
	private int  height;
	private int  length;
	private int  width;
	public Box(int height,int length,int width){
		this.height=height;
		this.length=length;
		this.width=width;
	}
	public Box(){
		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		if(height>5){
			this.height = height;
		}else{
			System.out.println("高度为大于5的数值"+height+"非法");
		}
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public static void main(String[] args){
		Box q=new Box();
		 q.setHeight(2);
		System.out.println(q.getHeight());
	}
	
}
