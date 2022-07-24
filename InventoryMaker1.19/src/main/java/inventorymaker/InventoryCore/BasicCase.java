package inventorymaker.InventoryCore;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class BasicCase {
    private ItemStack stack;
    private ArrayList<CaseAction> actions;
    private int number;

    public BasicCase(ItemStack stack){
        this.stack=stack;
        this.actions=new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<CaseAction> getActions() {
        return actions;
    }

    public void setActions(ArrayList<CaseAction> actions) {
        this.actions = actions;
    }

    public ItemStack getStack() {
        return stack;
    }

    public void setStack(ItemStack stack) {
        this.stack = stack;
    }
    public void addAction(CaseAction action){
        this.actions.add(action);
    }
}
