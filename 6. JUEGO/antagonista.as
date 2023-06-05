package  {
	import flash.display. MovieClip;
	import flash.events.Event;
	import flash.utils.Timer;
	import flash.events.TimerEvent;
	
	public class antagonista extends MovieClip{
		private var dir : Number=1;
			private var vel : int= 10;
			private var lim_x_der : int= 510;
			private var limite_x_izq : int= 40;
			private var cambiar : Timer = new Timer (200,0);			
			private var tipo : int;
			
		

		public function antagonista() {
			addEventListener (Event.ENTER_FRAME, actualizar);
			cambiar.addEventListener(TimerEvent.TIMER, cambia_dir);
			cambiar.start();
		}
		
		public function cambia_dir (e:TimerEvent){
			
			tipo=Math.floor(Math.random() * 8);
			//trace(tipo);
			
			switch(tipo){
				case 1:
				dir=1;
				break;
				case 2:
				dir=-1;
				break;
			}
		}
		
		public function actualizar (e:Event): void{
			x+=vel*dir;
			if (x>=lim_x_der ){
				dir=-1;
			
			}
			if (x<=limite_x_izq ){
				dir=1;
				
				
			}
				
				
				
			
		
		}
		
		}

}
	

