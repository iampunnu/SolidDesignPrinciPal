package MainFunction.designpattern.vendingMachine;
import MainFunction.designpattern.vendingMachine.state.IdleState;
import MainFunction.designpattern.vendingMachine.state.State;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }


    public VendingMachine(){
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }
}
