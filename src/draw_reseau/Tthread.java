package draw_reseau;

public class Tthread extends Thread {

	  public Tthread(String name){

	    super(name);

	  }

	  public void run(){

	    for(int i = 0; i < 10; i++)

	      System.out.println(this.getName());

	  }       

	}