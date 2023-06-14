package Classes;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {
		
		int numeroBaia = 1;
		int op, opb,baia;
		
		
		
		
        Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		ArrayList<Baia> listaBaia = new ArrayList<>();
		//contador de numero de baias
		

		
		//BaiaDAO objbaiadao = new BaiaDAO();
		//objbaiadao.cadastrarBaia(b);
		
		do {
	   System.out.println("======= MENU ================");
	   System.out.println("==                         ==");
	   System.out.println("== 1. adicionar lote       ==");
	   System.out.println("== 2. ver lote             ==");
	   System.out.println("== 3. excluir lote         ==");
	   System.out.println("== 4. pesquisar lote       ==");
	   System.out.println("== 5. editar lote          ==");
	   System.out.println("=============================");
	   System.out.println("== 10. sair                ==");
	   System.out.println("=============================");

       op = leia.nextInt();
	   
		switch(op)
		{
			case 1:
					
				   
				  /* numeroBaia +=1;
				   System.out.println("======= MENU =======");
				   System.out.println("Para comecar informe a data da sua ediçao!");
				   System.out.println("");
				   System.out.println("Data:  ");
				   String data = leia.next();
				   b.setData(data);
				   b.getData();
				   System.out.println("");
				   System.out.println("");
				   
				   */
					Baia b = new Baia();
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Para comecar informe quantos frangos existem em seu lote!");
				   System.out.println("");
				   System.out.println("Quantidade de frangos:  ");
				   int numgalinhas = leia.nextInt();
				   b.setQuantidadedegalinhas(numgalinhas);
				   b.getQuantidadedegalinhas();
				   System.out.println("");
				   System.out.println("");
				   new BaiaDAO().cadastrarBaia(b);

				   /*
				   System.out.println("======= MENU =======");
				   System.out.println("Agora informe qual a idade de abate dos frangos");
				   System.out.println("");
				   System.out.println("Idade de abate:  ");
				   float abate = leia.nextFloat();
				   b.setIdadeAbate(abate);
				   b.getIdadeAbate();
				   System.out.println("");
				   System.out.println("");
				   

				   System.out.println("======= MENU =======");
				   System.out.println("Agora informe qual a area em metros quadrados em que os frangos ficaram alojados");
				   System.out.println("");
				   System.out.println("area do aveario em m2:  ");
				   float area = leia.nextFloat();
				   b.setArea(area);
				   b.getArea();
				     
				   System.out.println("");
				   System.out.println("");

			       System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println("");
				   System.out.println("Qual o peso inicial? ");
				   float pI = leia.nextFloat();
				   b.setpI(pI);
				   b.getpI();
				   System.out.println("");
				   System.out.println("");

				   
				   
				   System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println(" Qual o peso final? caso nao tenha esse dado deixe em 0");
				   float pF = leia.nextInt();
				   b.setpF(pF);
				   b.getpF();
			       
				   
                   float pT = b.getpF() - b.getpI();
                   if(pT < 0) {
                	   pT = 0;
                   }else {
                	   b.setpT(pT);
                   }
				   

				   			  

				   float pD;
				   pD = b.getpT() / b.getIdadeAbate();
				   b.setpD(pD);
				  
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos  calcular o consumo de raçao da sua baia");
				   System.out.println("");
				   System.out.println("para isso subtraimos a racao fornecida pelas sobras");
				   System.out.println("");

				   System.out.println("Qual a quantidade de racao fornecida? ");
				   float rF = leia.nextInt();
				   b.setrF(rF);
				   b.getrF();
				   System.out.println("");
				   System.out.println("");
				   
				   System.out.println("======= MENU =======");
				   System.out.println("");
				   System.out.println("Qual a quantidade de sobras da baia? caso ainda nao tenha esse dado deixe em 0");
				   float sobras = leia.nextInt();
				   b.setSobras(sobras);
				   b.getSobras();
				   
				   float cR = b.getrF() - b.getSobras();
				   b.setcR(cR);

				   System.out.println("");
				 
				   System.out.println("======= MENU =======");
			
				   System.out.println("Qual a taxa de mortalidade da baia: caso nao tenha o dado, deixe em 0");
				   float mortalidade = leia.nextInt();
				   b.setMortalidade(mortalidade);
				   b.getMortalidade();
				   float taxamortal;	
				   b.setMortalidade(mortalidade);

				   taxamortal = b.getMortalidade() / 100;		   
				   float result;
				   result =  100 - mortalidade;	
				   b.setViabilidade(result);
				   System.out.println("");
				     
				
				  
				   float cA;
				  
				   cA = b.getcR() / b.getpT();
				   if(pT < 0) {
					   cA = 0;
				   }else {
					b.setCa(cA);
				   }
				  
				   System.out.println("");
				   System.out.println("");
				  
				   
				   System.out.println("======= MENU =======");
				   System.out.println("Agora vamos calcular o IEP do seu lote");
				   System.out.println("");
				   System.out.println("IEP = [(viabilidade x peso vivo) / (Ca x idade de abate)] x 100");
				   System.out.println("");
				   System.out.println("Para isso informe o peso vivo do seu lote: caso nao tenha esse dado, deixe em 0");
				   float pesoVivo = leia.nextFloat();
				   b.setPesoVivo(pesoVivo);
				   b.getPesoVivo();
				   System.out.println("");
				   System.out.println("");
				   float IEP;
				   
				   IEP = ((b.getViabilidade() * b.getPesoVivo()) / (b.getCa() * b.getIdadeAbate())) * 100;
				   
				   if(IEP < 0) {
					   IEP = 0;
				   }else {
					   b.setIEP(IEP);

				   }

*/
				   //listaBaia.add(b);
				   
				break;
				
			case 2: 
				
				// verificar baias
				 for(Baia a: listaBaia){
					 
					  
                      System.out.println("\n");
                      
                      a.Dados();
                     
				 }
				break;
				
			case 3:
				// excluir baia
				 System.out.println("====== MENU ===== ");
				 System.out.println("Agora vamos remover uma baia");
				 System.out.println("Digite o numero do codigo da baia que voce deseja excluir");
                 int opremove = leia.nextInt();
				 int cont=0;
                 
                for(Baia c: listaBaia) {
                	if(opremove == c.getNumeroBaia()) {
                		listaBaia.remove(c);
                		cont=1;
                	}
                }
				if(cont==1) {
				 System.out.println("LOTE exluida");	
				}else {System.out.println("Baia nao encontrada");}
				
				break;
				
			case 4:
				 System.out.println("====== MENU ===== ");
				 System.out.println("Voce pode pesquisar um lote em especifico");
				 System.out.println("para ver os dados somente dela");
				 System.out.println("Digite o codigo do lote que deseja visualizar");
                 int num = leia.nextInt();
				 int cont2 = 0;
				 
                 for(Baia d: listaBaia) {
                 	if(num == d.getNumeroBaia()) {
                 		d.Dados();
                 		cont2=1;
                 	}
                 }
 				if(cont2==1) {
 					 System.out.println("Lote encontrado!!!");
 				}else {System.out.println("Lote nao encontrado");}
				 System.out.println("");

 				break;	
 				
			case 5:
				// editar baia
				System.out.println("====== MENU ===== ");
				 System.out.println("Voce pode editar um lote em especifico");
				 System.out.println("para editar os dados da baia");
				 int nun = leia.nextInt();
				 int con = 0;
				 
                 for(Baia d: listaBaia) {
                 	if(nun == d.getNumeroBaia()) {
                 		d.Dados();
                 		con=1;
                 		
      				   numeroBaia +=1;
      				   System.out.println("======= MENU =======");
      				   System.out.println("Para comecar informe a data da sua ediçao!");
      				   System.out.println("");
      				   System.out.println("Data:  ");
      				   data = leia.next();
      				   d.setData(data);
      				   System.out.println("");
      				   System.out.println("");
      				   
      				   
      				   
      				   
      				   System.out.println("======= MENU =======");
      				   System.out.println("Para comecar informe quantos frangos existem em seu lote!");
      				   System.out.println("");
      				   System.out.println("Quantidade de frangos:  ");
      				    numgalinhas = leia.nextInt();
      				   d.setQuantidadedegalinhas(numgalinhas);
      				   System.out.println("");
      				   System.out.println("");

      				   System.out.println("======= MENU =======");
      				   System.out.println("Agora informe qual a idade de abate dos frangos");
      				   System.out.println("");
      				   System.out.println("Idade de abate:  ");
      				   abate = leia.nextFloat();
      				   d.setIdadeAbate(abate);
      				   System.out.println("");
      				   System.out.println("");
      				   

      			       System.out.println("======= MENU =======");
      				   System.out.println("");
      				   System.out.println("");
      				   System.out.println("Qual o peso inicial? ");
      				    pI = leia.nextFloat();
      				   d.setpI(pI);
      				   System.out.println("");
      				   System.out.println("");

      				   
      				   
      				   System.out.println("======= MENU =======");
      				   System.out.println("");
      				   System.out.println(" Qual o peso final? caso nao tenha esse dado deixe em 0");
      				    pF = leia.nextInt();
      				   d.setpF(pF);
      			       
                          pT = d.getpF() - d.getpI();	
      				   d.setpT(pT);

      				   			  

      				   pD = d.getpT() / d.getIdadeAbate();
      				   d.setpD(pD);
      				  
      				   System.out.println("======= MENU =======");
      				   System.out.println("Agora vamos  calcular o consumo de raçao da sua baia");
      				   System.out.println("");
      				   System.out.println("para isso subtraimos a racao fornecida pelas sobras");
      				   System.out.println("");

      				   System.out.println("Qual a quantidade de racao fornecida? ");
      				    rF = leia.nextInt();
      				   d.setrF(rF);
      				   System.out.println("");
      				   System.out.println("");
      				   
      				   System.out.println("======= MENU =======");
      				   System.out.println("");
      				   System.out.println("Qual a quantidade de sobras da baia? caso ainda nao tenha esse dado deixe em 0");
      				    sobras = leia.nextInt();
      				   d.setSobras(sobras);
      				   
      				    cR = d.getrF() - d.getSobras();
      				   d.setcR(cR);

      				   System.out.println("");
      				 
      				   System.out.println("======= MENU =======");
      			
      				   System.out.println("Qual a taxa de mortalidade da baia: caso nao tenha o dado, deixe em 0");
      				    mortalidade = leia.nextInt();
      				   d.setMortalidade(mortalidade);
      				   d.setMortalidade(mortalidade);

      				   taxamortal = d.getMortalidade() / 100;		   
      				   result =  100 - mortalidade;	
      				   d.setViabilidade(result);
      				   System.out.println("");
      				     
      				
      				  
      				  
      				   cA = d.getcR() / d.getpT();
      				   d.setCa(cA);
      				   System.out.println("");
      				   System.out.println("");
      				  
      				   
      				   System.out.println("======= MENU =======");
      				   System.out.println("Agora vamos calcular o IEP do seu lote");
      				   System.out.println("");
      				   System.out.println("IEP = [(viabilidade x peso vivo) / (Ca x idade de abate)] x 100");
      				   System.out.println("");
      				   System.out.println("Para isso informe o peso vivo do seu lote: caso nao tenha esse dado, deixe em 0");
      				    pesoVivo = leia.nextFloat();
      				   d.setPesoVivo(pesoVivo);
      				   System.out.println("");
      				   System.out.println("");
      				   
      				   IEP = ((d.getViabilidade() * d.getPesoVivo()) / (d.getCa() * d.getIdadeAbate())) * 100;
      				   d.setIEP(IEP);

      				  
                 	}
                 }
 				if(con==0) {
 					 System.out.println("Lote nao encontrado");
 				}

				
				
				break;
				
				
		}
		}while(op != 10);
		   System.out.println("");
		   System.out.println("OBG por usar meu software :)");	
	}
	}