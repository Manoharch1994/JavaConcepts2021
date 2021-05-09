package OOPsConcepts;

public interface USBank {
	//Only method declaration.
	//no method body,Only method prototype.
	//In interface we can declare the variables,variables are by default static in nature.
	//Variables value will not be changed.
	//no static method in interface.
	//no main method in interface
	//we cant create Object for interface
	//interface is abstract in nature.	
	int min_bal=100;
	public void USBankCredit();
	public void USBankdebit();
	public void USBankTransferMoney();
}
