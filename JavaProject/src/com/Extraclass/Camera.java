package com.Extraclass;

//public interface Camera {
	interface Camera1 {
	    int getMaxPhotos();
	    String takePhotograph();
	}

	class DigitalCamera implements Camera1 {
	    private final int maxPhotos = 2000;

	    @Override
	    public int getMaxPhotos() {
	        return maxPhotos;
	    }

	    @Override
	    public String takePhotograph() {
	        return "Taking a picture on my digital camera!";
	    }
	}

	class PolaroidCamera implements Camera1 {
	    private final int maxPhotos = 10;

	    @Override
	    public int getMaxPhotos() {
	        return maxPhotos;
	    }

	    @Override
	    public String takePhotograph() {
	        return "Taking a picture on my polaroid camera!";
	    }
	}

	class PhoneCamera implements Camera1 {
	    private final int maxPhotos = 12600;

	    @Override
	    public int getMaxPhotos() {
	        return maxPhotos;
	    }

	    @Override
	    public String takePhotograph() {
	        return "Taking a picture on my phone camera!";
	    }
	}
	public interface Camera
	{
	public static void main(String arg[])
	{
		DigitalCamera d=new DigitalCamera();
		d.getMaxPhotos();
		d.takePhotograph();
		PolaroidCamera p=new PolaroidCamera();
		p.getMaxPhotos();
		p.takePhotograph();
		
		PhoneCamera p1=new PhoneCamera();
		p1.getMaxPhotos();
		p1.takePhotograph();
	}	
}

	
	
	
		