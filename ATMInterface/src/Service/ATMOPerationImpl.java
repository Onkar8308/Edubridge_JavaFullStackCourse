package Service;

import java.util.Iterator;
import java.util.List;

import atmException.InsufficientBalException;

public class ATMOPerationImpl implements ATMOperation{

	
	@Override
	public void transectionHistory(List<String> transections) {
			System.out.println("   Last transections are  ");
			Iterator<String> it = transections.iterator();
			while(it.hasNext()) {
				String str = it.next();
				System.out.println(str);
			}
		// TODO Auto-generated method stub
		
	}

	@Override
	public double withdraw(int ammount, double mainBalnce) {
		if(mainBalnce>=ammount) {
			double updatedBal = mainBalnce - ammount;
			return updatedBal;
		}
		else {
			try {
			throw new InsufficientBalException("Insufficient Bal ");
			
			}
			catch(InsufficientBalException obj) {
				System.out.println(obj);
				return mainBalnce;
			}
		}
	}
	
	
	@Override
	public double transferMoney(double amounttransfer, double mainbal) {
		if(mainbal>=amounttransfer) {
		double updateBal = mainbal - amounttransfer;
		return updateBal;	
		}
		else
			try {
				throw new InsufficientBalException("Insufficient balance to transfer money");
			}
		catch(InsufficientBalException obj) {
			return mainbal;
		}
	}

	@Override
	public double deposite(int depositeMoney, double mainBal) {
		if(depositeMoney>0) {
			double updatedbal = mainBal + depositeMoney;
			return updatedbal;
			}
		else {
			return mainBal;
		}
			
		
	}
}
