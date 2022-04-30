package org.college;

public class desktop extends computer
{
public void desktopSize(){
	
		System.out.println("desk top size is small");
	}

	public static void main(String[] args) {
		computer computer=new computer();
		computer.computerModel();
		desktop desktop=new desktop();
		desktop.desktopSize();
		
	}
}
