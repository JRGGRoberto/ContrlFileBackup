package principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ControlFile {
	private static final String FICHEIROCONTROLFILE = "dados/config.csv";
	private static ArrayList<Backup> backups;
	
	public static void iniciar(){
		backups = new ArrayList<Backup>();
		
	
	}
	private static void carregarDados(){
		File ficheiroclientes = new File(FICHEIROCONTROLFILE);
		if(!ficheiroclientes.exists()){
			System.out.println("Não é possivel carregar ficheiro.");
			return;
		}
		try{
			importarControlFile(ficheiroclientes);
		} catch(Exception e){
			System.out.println("Erro na importação dos ficheiros");
		}
	}
	
	
	private static void importarControlFile(File arq) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(arq));
		String texto = br.readLine();
		
		while (texto != null){
			String[] dadosficheiro = texto.split(";");
			String nome = dadosficheiro[0];
			String dir  = dadosficheiro[1];
			String form = dadosficheiro[2];
			int qnt = Integer.parseInt(dadosficheiro[3]);
			backups.add(new Backup(nome, dir, form, qnt));
			texto = br.readLine();
		}
		br.close();
	}
	
	private static void guardarDados(){
		try{
			PrintWriter pw = new PrintWriter(FICHEIROCONTROLFILE);
			
			for(Backup b: backups){
				b.escreverFicheiro(pw);
			}
			pw.flush();
			pw.close();
		} catch(FileNotFoundException e){
			System.out.println("A pasta para gravação de clientes não existe");
		}
	}
}
