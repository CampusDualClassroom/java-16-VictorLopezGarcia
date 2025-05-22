package com.campusdual.classroom;

public class Tractor implements IMachine {

	protected int horsePower = 0;

	private boolean isEngineOn = false;

	private boolean isMaintenance = false;

	private boolean isMoving = false;

	private boolean isBackwards = false;
	
	public Tractor(int hp) {
		this.horsePower = hp;
	}

	public void forward() {
		if (!isMoving && !isBackwards && isEngineOn){
			System.out.println("El tractor avanza");
			isMoving = true;
		}else if (!isEngineOn) System.out.println("El tractor no está en marcha");
		else if (isMaintenance) System.out.println("El tractor está en mantenimiento no se puede poner en marcha");
		else if (isMoving) System.out.println("El tractor está en marcha");
		else System.out.println("El tractor va marcha atrás, primero detenga el tractor");
	}

	public void backward() {
		if (!isMoving && !isBackwards && isEngineOn){
			System.out.println("El tractor retrocede");
			isBackwards = true;
		}else if (!isEngineOn) System.out.println("El tractor no está en marcha");
		else if (isMaintenance) System.out.println("El tractor está en mantenimiento no se puede poner en marcha");
		else if (isMoving) System.out.println("El tractor está en marcha, primero detenga el tractor");
		else System.out.println("El tractor ya está en marcha");
	}

	@Override
	public void start() {
		if (!isEngineOn && !isMaintenance){
			System.out.println("Tractor en marcha");
			isEngineOn = true;
		}
		else if (isMaintenance) System.out.println("El tractor está en mantenimiento no se puede poner en marcha");
		else System.out.println("El tractor ya está en marcha");
	}

	@Override
	public void stop() {
		if (isEngineOn && !isMoving){
			System.out.println("Tractor detenido");
			isEngineOn = false;
		}
		else if (isMoving) System.out.println("El tractor está en marcha, primero detenga el tractor");
		else System.out.println("El tractor ya está detenido");
	}

	@Override
	public void maintenance() {
		if (!isMaintenance && !isEngineOn){
			System.out.println("Tractor en mantenimiento");
			isMaintenance = true;
		}
		else if (isEngineOn) System.out.println("El tractor está en marcha, primero detenga el tractor");
		else System.out.println("El tractor ya está en mantenimiento");
	}


}
