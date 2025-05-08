class Ndemo{
    int a = 10, b= 5;
    double circ_Area(){
    int r = 6;
    final double pi =3.142 ;
    double res = pi * r*r;
	System.out.println(res);
	
	return res;
    }

	void rect(){
		int res  = a * b;
		System.out.println(res);
	}

	void sq(){
		int res  = a * a;
		System.out.println(res);
	}
	void para(){
		int c =9;
		int res  = a *c;
		System.out.println(res);
	}
		void tri(){
		int c =9;
		double res  = 0.5 *a *c;
		System.out.println(res);
	}
		void sector(){
		double t =90.15;
		double res  = 3.142 *a * t;
		System.out.println(res);
	}
		void trapezoid(){
		int h1 =9, h2 = 6;
		double res  = 0.5 *(b+h1)*h2;
		System.out.println(res);
	}

		void ellipse(){
		double res  = 3.142 *a *b;
		System.out.println(res);
	}


	public static void main(String[] args){
	new Ndemo().circ_Area();
	new Ndemo().rect();
	new Ndemo().sq();
	new Ndemo().para();
	new Ndemo().tri();
	new Ndemo().sector();
	new Ndemo().trapezoid();
	new Ndemo().ellipse();

	System.out.println(new Ndemo().a);
	
	

	}
}

