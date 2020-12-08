public class Riddle2{

	public static void main(String[] args){
		int i;
		int j;
		int k;
		int l;
		double a;
		double b;
		String pot;
		int count;

		for(i=0; i<1000; i++){
			for(j=0; j<1000; j++){
				for(k=0; k<1000; k++){
					for(l=0; l<1000; l++){
						a = (double)i/j;
						b = (double)k/l;
						if(a+b == 1.0){
							count = 0;
							pot = i + " " + j + " " + k + " " + l;
							for(int z = 0; z<10; z++){
								String zed = Integer.toString(z);
								if(pot.contains(zed)){count++;}
								if(count == 10){System.out.println(i + "/" + j + " + " + k + "/" + l + " = 1");}
							}
							
						}
					}
				}
			}
		}
	}
}