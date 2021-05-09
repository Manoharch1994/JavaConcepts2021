package OOPsConcepts;

public class InterfaceTest {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		//USBank.min_bal=500;
			HSBCBank hb=new HSBCBank();
			hb.USBankCredit();
			hb.USBankdebit();
			hb.USBankTransferMoney();
			hb.HSBCEDULoan();
			hb.HSBCCarLoan();
			hb.MutualFund();
//Dynamic Polymorphism:
//Child class object can be referred by parent interface reference variable.
			System.out.println("***********Dynamic Polymorphism***********");
			USBank b = new HSBCBank();
			b.USBankCredit();
			b.USBankdebit();
			b.USBankTransferMoney();
			
			
			
			
			
	}

}
