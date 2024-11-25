package tiDo.DigitalVideoDisc;

public class DigitalVideoDisc {
	private String id;
	private String title;
	private String category;
	private int price;
	
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String id, String title, String category, int price) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.price = price;
		setNbDigitalVideoDiscs(getNbDigitalVideoDiscs() + 1);
	}
	

	public String getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public String getCategory() {
		return category;
	}


	public int getPrice() {
		return price;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void display() {
		System.out.println("id: " + this.id + "\n" + 
				"title: " + this.title + "\n" + 
				"category: " + this.category + "\n" + 
				"price: " + this.price + "\n");
		}


	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}


	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
}
