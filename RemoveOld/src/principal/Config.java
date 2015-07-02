package principal;


import java.util.Scanner;

public class Config {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int op;
//		Banco.iniciar(); // necessário para iniciar o array
						 // clientes = new ArrayList<Cliente>();
		do{
			
			System.out.println("- Menu Principal - ");
			System.out.println();
			System.out.println("1 -> Criar ControlFile");
			System.out.println("2 -> Desativar ControlFile");
			System.out.println("3 -> Apagar ControlFile");
			System.out.println("4 -> Alterar ControlFile");
			System.out.println("5 -> Listar ControlFile");
			System.out.println("6 -> Sair");
			System.out.print("[:");
			
			op = key.nextInt();
			
			switch(op){
				case 1: //Ok
						System.out.println("- Criar ControlFile");
						//String nome, String diretorio, String formato, int qndSalva
						System.out.println();
						System.out.print("Nome: ");
						String nome = key.next();
						System.out.print("Diretorio: ");
						String dir = key.next();
						System.out.print("Formato: ");
						String form = key.next();
						System.out.print("Qnt a ser guardada: ");
						int qnt = key.nextInt();
						
						
						System.out.println();
					break;
					
				default: System.out.println("Opção inválida\n");
					break;
			}
			
		}while(op != 7 );
		System.out.println("Fim!");
	//	ControlFile
//		Banco.guardarDados();
		
		/**
		 * 
/backup/aes
backup_AES01CDom0_aaaa_mm_dd_hh_MM_ss.tgz
backup_AES02CDom0_aaaa_mm_dd_hh_MM_ss.tgz

/backup/cm
backup_AACMACDom0_aaaa_mm_dd_hh_MM_ss.tgz
backup_AACMACDom0_aaaa_mm_dd_hh_MM_ss.tgz
backup_AACMESSCDom0_aaaa_mm_dd_hh_MM_ss.tgz
full_AACMA_040001_aaaammdd.tar.gz
full_AACMB_040001_aaaammdd.tar.gz
full_AACMESS_105209_aaaammdd.tar.gz

/backup/cms
CMS-aammdd-01-LSAC-00-F-01-05-CMS010000000000
CMS-aammdd-01-LSAC-00-F-01-05-CMS020000000000

/sbce
07-02-2015_13-18-57_6.3.2-08-5478.zip  repo.xml
07-02-2015_15-53-34_6.3.2-08-5478.zip


/smgr
backup_SMGR01CDom0_2015_07_02_12_31_03.tgz
backup_SMGR02CDom0_2015_07_02_12_41_47.tgz
smgr01_2015_Jul_02_03_33_26_653.zip

		 */

	}
}