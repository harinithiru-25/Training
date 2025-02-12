package com.celcom.day7;


/*setter and getter writing data
in run method synchronizing the object
reader thread 

reader thread is in wait() state ,writer for the same resource 
is writing some value using set data
then notifies the thread waiting for resource
main method has one resource object 
creating reader object by passing resource object
assigns resource object to instance and starts reader thread,
then reader starts executing and waits 
to see clear output suspend the thread 

reader gets signal from writer which is inter thread communication
*/

//Inter-Thread Communication
class Resource1
{
	private String data;
	public String getData() {
		return data;
		
	}
	public void setData(String data)
	{
		this.data=data;
	}
}

class Reader extends Thread{
	Resource1 resource;
	
	Reader(Resource1 resource)
	{
		this.resource=resource;
	}
	@Override
	public void run()
	{
		synchronized (resource)
		{
			System.out.println("Reader is waiting for writer to write a a data");
			try {
				resource.wait();
			}catch (InterruptedException e)
			{
				
			}
			System.out.println("Data from Reader : " +resource.getData());
		}
	}
}

class Writer extends Thread{
	Resource1 resource;
	
	Writer(Resource1 resource)
	{
		this.resource=resource;
	}
	public void run()
	{
		synchronized (resource)
		{
			System.out.println("Writer is writing the data....");
			resource.setData("Hello Reader");
			resource.notify();
		}
	}
}
	

public class ThreadExample6 {

	public static void main(String[] args) throws InterruptedException
	{
		Resource1 resource= new Resource1();
		Reader reader=new Reader(resource);
		
		reader.start();
		
		Thread.sleep(2000);
		
		Writer writer = new Writer(resource);
		
		writer.start();

	}

}
