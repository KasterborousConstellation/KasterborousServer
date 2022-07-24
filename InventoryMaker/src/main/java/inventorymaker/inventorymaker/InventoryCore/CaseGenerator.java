package inventorymaker.inventorymaker.InventoryCore;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class CaseGenerator {
    private BasicCase[]cases;
    public CaseGenerator(BasicCase[]cases){
        this.cases=cases;
    }
    public void setCase(int number,BasicCase basicCase){
        cases[number]=basicCase;
    }
    public BasicCase getCase(int number){
        return cases[number];
    }
    public void addAction(int number,CaseAction action){
        if(cases[number]==null){
            cases[number]=new BasicCase(null);
        }
        getCase(number).addAction(action);

    }
    public void setItemStack(int number, ItemStack stack){
        if(cases[number]==null){
            cases[number]=new BasicCase(null);
        }
        getCase(number).setStack(stack);
    }
    public BasicCase[] generate(){
        final BasicCase[] ret = new BasicCase[cases.length];
        int e=0;
        for(BasicCase bcase : cases){
            if(bcase==null){
                ret[e] = new BasicCase(null);
            }else{
                ret[e]=cases[e];
            }
            e++;
        }
        return ret;
    }
}
