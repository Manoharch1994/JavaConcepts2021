package OOPsConcepts;

public class HSBCBank implements USBank,BrazilBank {

//If a class is implementing any interface,then its mandatory to define/override all the methods of interface.
	
	//Overridden Methods:
	public void USBankCredit() {
		System.out.println("HSBC-Credit");		
	}
	public void USBankdebit() {
		System.out.println("HSBC-Debit");		
	}
	public void USBankTransferMoney() {
		System.out.println("HSBC-TransferMoney");	
	}
	//HSBC Own Methods:
	public void HSBCCarLoan() {
		System.out.println("HSBC-CarLoan");	
	}
	public void HSBCEDULoan() {
		System.out.println("HSBC-EduLoan");	
	}
	//BrazilBank Mutualfund://overridden method
		public void MutualFund() {
			System.out.println("BrazilBank-Mutualfund");		
		}

}
