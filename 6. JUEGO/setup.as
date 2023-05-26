package  {
	
	import flash.display.MovieClip;
	
	
	public class setup extends MovieClip { //definicion de clase
		private var fondo_new: fondo= new fondo();  //varibles de clase
		private var piso_new: piso= new piso();
		private var antagonista_new: antagonista= new antagonista();
		private var protagonista_new: protagonista= new protagonista();
		private var bala_new: bala= new bala();
		
		public function setup() { //metodo constructor
			// constructor code
			addChild(fondo_new);
			addChild (piso_new);
			addChild (antagonista_new);
			addChild (protagonista_new);
			addChild (bala_new);
			
			
			piso_new.y= 358;
			
			antagonista_new.x=250;
			antagonista_new.y=50
			protagonista_new.x=250;
			protagonista_new.y=320;
			}
	}
	
}
