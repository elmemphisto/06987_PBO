/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module;

/**
 *
 * @author L
 */

import java.util.ArrayList;
import Entity.SaveEntity;

public class AccountModul implements InterfaceAccount{
    private ArrayList<SaveEntity> saveEntityArrayList;
    public AccountModul(){
        saveEntityArrayList = new ArrayList<SaveEntity>();
        
        
    }

    
    
    public void insert (SaveEntity SaveEntity){
        saveEntityArrayList.add(SaveEntity);
    }
    
    public void view(){
        for (SaveEntity SaveEntity : saveEntityArrayList ){
            System.out.println("=========================================");
			System.out.println("PIN : " + SaveEntity.getpin() +"\n saldo : "+ SaveEntity.getsaldo()+ "\n Depost : "+ SaveEntity.getdeposit());
	    System.out.println("=========================================");

        }
        
    }
    
    public void cekData(String pin){
		for (int i=0; i<saveEntityArrayList.size(); i++){
           if (pin.equals(saveEntityArrayList.get(i).getpin())){
    System.out.println("Saldo anda sekarang !!!!");
    System.out.println("Pin = "+saveEntityArrayList.get(i).getpin());
    System.out.println("Saldo = "+saveEntityArrayList.get(i).getsaldo());
    System.out.println("Deposit = "+saveEntityArrayList.get(i).getdeposit());
           }else {
               System.out.println("pin salah blokkkk goblok");
           }
        }
	}
}
    

