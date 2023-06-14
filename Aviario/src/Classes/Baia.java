package Classes;

public class Baia {
	private int numeroBaia;
    private float pI;
    private float pF;
	private float rF;
	private float sobras;
	private float cR;
	private float pT;
	private float ca;
    private float mortalidade;
    private float viabilidade;
    private float IEP;
    private float pesoVivo;
    private int quantidadedegalinhas;
    private float idadeAbate;
    private float area;
    private float pD;
    private String data;
    
    public void Dados() {
    	System.out.println("Alguns dados podem nao ser os finais, visto que outros ainda nao foram adicionados \n por isso podem estar sem sentido:\n");
    	System.out.println(" Data da ultima edicao =>   " + data);
    	System.out.println(" numero da Baia        =>   " + numeroBaia);
    	System.out.println(" quantidade de frangos =>   " + quantidadedegalinhas);
        System.out.println(" area do aveario       =>   " + area + " m2");
        System.out.println(" idade de abate        =>   " + idadeAbate + " Dias");
        System.out.println(" Consumo de raçao      =>   " + cR + " g");
        System.out.println(" Sobras                =>   " + sobras + " g");
        System.out.println(" Peso inicial          =>   " + pI + " g");
        System.out.println(" Peso final            =>   " + pF + " g");
        System.out.println(" Ganho de peso diario  =>   " + pD + " g / dia");
        System.out.println(" peso total            =>   " + pT + " g");
        System.out.println(" CR total              =>   " + cR + " g");
        System.out.println(" CA total              =>   " + ca);
        System.out.println(" taxa demortalidade    =>   " + mortalidade + "%");
        System.out.println(" viabilidade           =>   " + viabilidade + "%");
        System.out.println(" IEP                   =>   " + IEP);
        System.out.println("\n");
        System.out.println("\n");
    }
    
    
    public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}




	/*public Baia(int numeroBaia) {
    	this.numeroBaia = numeroBaia;
    }*/
    
    
   
    public float getpD() {
		return pD;
	}


	public void setpD(float pD) {
		this.pD = pD;
	}


	public int getNumeroBaia() {
    	return numeroBaia;
    }
    
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public float getIEP() {
		return IEP;
	}
	public void setIEP(float iEP) {
		IEP = iEP;
	}
	public float getPesoVivo() {
		return pesoVivo;
	}
	public void setPesoVivo(float pesoVivo) {
		this.pesoVivo = pesoVivo;
	}
	public int getQuantidadedegalinhas() {
		return quantidadedegalinhas;
	}
	public void setQuantidadedegalinhas(int quantidadedegalinhas) {
		this.quantidadedegalinhas = quantidadedegalinhas;
	}
	public float getIdadeAbate() {
		return idadeAbate;
	}
	public void setIdadeAbate(float idadeAbate) {
		this.idadeAbate = idadeAbate;
	}
	public float getViabilidade() {
		return viabilidade;
	}
	public void setViabilidade(float viabilidade) {
		this.viabilidade = viabilidade;
	}
	public float getpI() {
		return pI;
	}
	public void setpI(float pI) {
		this.pI = pI;
	}
	public float getpF() {
		return pF;
	}
	public void setpF(float pF) {
		this.pF = pF;
	}
	public float getrF() {
		return rF;
	}
	public void setrF(float rF) {
		this.rF = rF;
	}
	public float getSobras() {
		return sobras;
	}
	public void setSobras(float sobras) {
		this.sobras = sobras;
	}
	public float getcR() {
		return cR;
	}
	public void setcR(float cR) {
		this.cR = cR;
	}
	public float getpT() {
		return pT;
	}
	public void setpT(float pT) {
		this.pT = pT;
	}
	public float getCa() {
		return ca;
	}
	public void setCa(float ca) {
		this.ca = ca;
	}
	public float getMortalidade() {
		return mortalidade;
	}
	public void setMortalidade(float mortalidade) {
		this.mortalidade = mortalidade;
	}
}