package uglyNumbers;

public class Holi {
	
	static boolean xd=false;

	public static void main(String[] args) {
		int acu=1;
		double vaaaaaalor=2;
		double[] vector = new double[1501];
		vector[0]=1;
		while(acu<=1500){
			Recurs2(valor);
			if(xd==true){
				if(valor!=0.0){
					vector[acu]=valor;
					acu++;
				}
			}
			valor++;
		}
		System.out.print("The 1500'th ugly number is: "+vector[1499]);
	}
	
	public static double Recurs2(double num){
		double aux;
		aux=num/2;
		if(aux%1==0){
			if(aux==1)
			{
				xd=true;
			} else{
				Recurs2(aux);
			}
		} else {
			Recurs3(num);
		}
		
		return num;
	}
	
	public static double Recurs3(double num){
		double aux;
		aux=num/3;
		if(aux%1==0){
			if(aux==1)
			{
				xd=true;
			} else{
				Recurs3(aux);
			}
		} else {
			Recurs5(num);
		}
	
		return num;
	}
	
	public static double Recurs5(double num){
		double aux;
		aux=num/5;
		if(aux%1==0){
			if(aux==1)
			{
				xd=true;
			} else{
				Recurs5(aux);
			}
		} else {
			xd=false;
		}
		
		return num;
	}
}