package Model;

import Interface.CarInterface;


	public class Car implements CarInterface {
		private String color;
		private String noPlate;
		private int widht;
		private int height;
		private String brand;

		public Car() {
			this.color = "Black";
			this.noPlate = "B 1978 KA";
			this.widht = 1800;
			this.height = 1500;
			this.brand = "Nissan";
	}
		
		public Car(String color, String noPlate, int widht, int height, String brand) {
			this.color = color;
			this.noPlate = noPlate;
			this.widht = widht;
			this.height = height;
			this.brand = brand;
		}
		
		public String getColor() { return color; }
		public String getNoPlate() { return noPlate; }
		public int getWidht() { return widht; }
		public int getHeight() { return height; }
		public String getBrand() { return brand; }

		public void startEngine() {
			System.out.println("Engine started... Stutututu");
		}
		public void throttle() {
			System.out.println("Car is accelerating...");
		}
		public void brake() {
			System.out.println("Car is breaking...");
		}
		public void turnOnHeadLamp() {
			System.out.println("Head Lamp is On");
		}
		public void turnOffHeadLamp() {
			System.out.println("Head Lamp is Off");
		}
	}
