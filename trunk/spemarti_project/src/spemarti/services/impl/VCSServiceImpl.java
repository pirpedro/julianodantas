package spemarti.services.impl;

import java.util.Date;
import java.util.Properties;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;

import spemarti.LabeledText;
import spemarti.List;
import spemarti.SimpleInformationElement;
import spemarti.SpemartiFactory;
import spemarti.SpemartiPackage;
import spemarti.Table;
import spemarti.Text;
import spemarti.Version;
import spemarti.VersionHistory;
import spemarti.custom.dao.SimpleInformationElementDao;
import spemarti.custom.dao.impl.SimpleInformationElementDaoImpl;
import spemarti.services.VCSService;

public class VCSServiceImpl implements VCSService {

	private SessionFactory sessionFactory;
	private SpemartiFactory spemartiFactory;
	
	public VCSServiceImpl() {

		HbDataStore hbds = (HbDataStore) HbHelper.INSTANCE.createRegisterDataStore("MyDb");

		final Properties props = new Properties();
		props.setProperty(Environment.DRIVER, "com.mysql.jdbc.Driver");
		props.setProperty(Environment.URL, "jdbc:mysql://127.0.0.1:3306/spemarti");
		props.setProperty(Environment.USER, "root");
		props.setProperty(Environment.PASS, "");
		props.setProperty(Environment.DIALECT,
				org.hibernate.dialect.MySQLInnoDBDialect.class.getName());
		props.setProperty(Environment.SHOW_SQL, "true");
		hbds.setProperties(props);
		
		hbds.setEPackages(new EPackage[] { SpemartiPackage.eINSTANCE });
		hbds.initialize();
		sessionFactory = hbds.getSessionFactory();
		
		spemartiFactory = SpemartiPackage.eINSTANCE.getSpemartiFactory();
	}

	@Override
	public void checkIn(SimpleInformationElement simpleInfoElm, String comment) {

		if(simpleInfoElm == null) return; // TODO Depois tem que criar uma exceção pra isso! 
		
		SimpleInformationElementDao simpleDao = new SimpleInformationElementDaoImpl(sessionFactory);
		
		SimpleInformationElement currentSimple = simpleDao.findOneByExample(simpleInfoElm);
		
		if(currentSimple == null) {// Não existe no repositório!
			
			Version version = spemartiFactory.createVersion(); // Primeira versão
			Date currentDate = new Date();
			version.setCreationDate(currentDate.toString());
			version.setAnnotation(comment);

			VersionHistory history = spemartiFactory.createVersionHistory(); //  Cria histórico e insere primeira versão
			history.setRootVersion(version);
			history.getVersions().add(version);
			
			simpleInfoElm.setBaseVersion(version); // versão atual, em uso
			simpleInfoElm.setVersionhistory(history); 
			
			
		}
		else{ // Existe no repositório
			
		}
					
		
		// se não, inserir no banco, criar primeira versão, criar histórico e adicionar no histórico
		
		// se sim, recuperar, criar nova versão e adicionar ao histórico 
		

		if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof Text){
			
		}
		else if(simpleInfoElm instanceof Table){
			
		}
		else if(simpleInfoElm instanceof List){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		else if(simpleInfoElm instanceof LabeledText){
			
		}
		
	}
	
	public static void main(String[] args){
		
	}

}
