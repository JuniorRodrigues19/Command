package principal;

public class ControleRemoto {
	Command slot;
	public ControleRemoto() {
		
	}
	public void setCommand(Command command){
		slot = command;
		}
	public void botaoPressionado() {
		slot.execute(); 
		}
}
	