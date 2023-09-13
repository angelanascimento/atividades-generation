package atividades08;

public class Pharmacy extends Company{
	
	private boolean CRF;
	private boolean certificateAFE;
	private boolean SNGPC;
	
	public Pharmacy(String razaoSocial, String address, int number, String city, String zipCode, String CNPJ, boolean CRF, boolean certificateAFE, boolean SNGPC) {
		super(razaoSocial, address, number, city, zipCode, CNPJ);
		this.CRF = CRF;
		this.certificateAFE = certificateAFE;
		this.SNGPC = SNGPC;
	}

	public boolean getCRF() {
		return CRF;
	}

	public void setCRF(boolean cRF) {
		CRF = cRF;
	}

	public boolean getCertificateAFE() {
		return certificateAFE;
	}

	public void setCertificateAFE(boolean certificateAFE) {
		this.certificateAFE = certificateAFE;
	}

	public boolean getSNGPC() {
		return SNGPC;
	}

	public void setSNGPC(boolean sNGPC) {
		SNGPC = sNGPC;
	}

	@Override
	public void view() {
		
		System.out.printf("Dados da Farmácia:\n");
		super.view();
		System.out.println("=============================================================");
		System.out.println("Documentações e Autorizações:");
		System.out.printf("Autorização CRF: %s\nAutorização do SNGPC: %s\nCertificado AFE: %s\n", getCRF(), getCertificateAFE(),getSNGPC());
		
	}

}
