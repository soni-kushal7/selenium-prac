package Day12;

public class BoxConstructor {
	
	
// First we have to declare variable
	
	double width, height , depth;
	
	 BoxConstructor(){
		 
		//width =0;
		//height=0;
		//depth =0;
		 
		 width=height=depth=0;   //1--> wothout parameter
		 
	 }
	
	BoxConstructor(double w,double h,double d){
		
		width=w;
		height=h;  // 2--> 3 parameters
		depth=d;
		
	}
	
	BoxConstructor(double len){
		
		width=height=depth=len;  //3--> one parameter
		
	}
	
	
	double volume() {
		
		return(width*height*depth);   //we create this method to find volume of a box
	}
	

}
