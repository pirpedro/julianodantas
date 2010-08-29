package spemarti.services.impl;

import spemarti.LabeledText;
import spemarti.SimpleInformationElement;
import spemarti.Table;
import spemarti.Text;
import spemarti.services.VCSService;

public class VCSServiceImpl implements VCSService {

	public VCSServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void checkIn(SimpleInformationElement simpleInfoElm, String comment) {

		if(simpleInfoElm == null) return; // TODO Depois tem que criar uma exceção pra isso! 
		
		
		
		// Verificar se existe no banco
		
		// se não, inserir no banco, criar primeira versão, criar histórico e adicionar no histórico
		
		// se sim, recuperar, criar nova versão e adicionar ao histórico 
		

		if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof Text){
			
		}
		else if(simpleInfoElm instanceof Table){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		
	}
	
	public static void main(String[] args){
		
	}

}
