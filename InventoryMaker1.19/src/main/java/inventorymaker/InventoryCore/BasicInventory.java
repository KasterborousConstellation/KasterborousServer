package inventorymaker.InventoryCore;

import inventorymaker.InventoryExeptions.NonModulo9InventoryException;
import inventorymaker.InventoryExeptions.NonSetObserverEcxeption;
import inventorymaker.InventoryUtility.ActionBank;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public abstract class BasicInventory {
    private String name;
    private BasicCase[] cases;
    public Player observer;
    public BasicInventory(int size,Player player,String name) {
        if(size%9!=0){
            try {
                throw new NonModulo9InventoryException();
            } catch (NonModulo9InventoryException e) {
                e.printStackTrace();
                return;
            }
        }
        BasicCase[] cases = new BasicCase[size];
        if(this instanceof GUI){
            for(int e =0; e<size;e++){
                BasicCase bCase = new BasicCase(null);
                bCase.addAction(ActionBank.preventAction);
                bCase.addAction(ActionBank.preventClick);
                cases[e]=bCase;
            }
        }
        this.cases = cases;
        this.name = InventoryMakerHandler.id+name;
        this.observer=player;
    }
    public abstract void generate(CaseGenerator inventory);

    public BasicCase[] getCases() {
        return cases;
    }

    public void setCases(BasicCase[] cases) {
        this.cases = cases;
    }

    public void open(){
        final CaseGenerator generator = new CaseGenerator(cases);
        generate(generator);
        cases= generator.generate();
        final Inventory inventory = Bukkit.createInventory(null,cases.length,name);
        int e=0;
        for(final BasicCase bCase: cases){
            inventory.setItem(e,bCase.getStack());
            e++;
        }
        if(observer==null || !observer.isOnline()){
            try{
                throw new NonSetObserverEcxeption();
            }catch (NonSetObserverEcxeption ex){
                ex.printStackTrace();
                return;
            }
        }
        InventoryMakerHandler.inventory.put(observer.getUniqueId(),this);
        observer.openInventory(inventory);
    }
}