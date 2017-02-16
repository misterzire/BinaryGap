package lesson1.iterator.binarygap;

import java.util.ArrayList;

public class Solution {

	public int solution(int n){
		
		ArrayList<Integer> lista = decimalToBinary(n);
		
		int gap = getBinaryGap(lista);
		
		System.out.println("gap is "+gap);
		
		return gap;
	}

	private ArrayList<Integer> decimalToBinary(int divisor){
		
		ArrayList<Integer> aux  = new ArrayList<Integer>();
				
		while (divisor>0){
		
		int resto = divisor % 2;
		
		divisor = divisor / 2;
		
		aux.add( Integer.valueOf(resto));
		
		}
		
		return inverteArrayList(aux);
				
	}

	private ArrayList<Integer> inverteArrayList(ArrayList<Integer> rest) {
		
		// inverte a lista para o numero binario ser convertido na ordem correta
		
		ArrayList<Integer> aux  = new ArrayList<Integer>();
		
		System.out.println("Exibe valor binario");
		
		for (int x = rest.size()-1;x>=0;x--){
			
			aux.add(rest.get(x));
						
		}
		
		return aux;
	}
	
	private int getBinaryGap(ArrayList<Integer> listaDeBinario){
		
		int gap =0;
		int temUm=0;
		int temZero=0;
		
		
		for(Integer x:listaDeBinario){

			System.out.println("->"+x.intValue());
			
			if (x.intValue()==1){
				
				temUm++;			
				
			}
			
			if (x.intValue()==0 && temUm==1){
				
				temZero++;			
				
			}
									
			if (temUm==2 && temZero>0){
						
				
				if (gap<=temZero){
					
					gap = temZero;
					
				}
				
				temUm = 1;
				
				temZero=0;
			}
						
		}
				
		return gap;
	}
	
	
}
