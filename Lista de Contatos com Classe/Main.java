import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        int keep = 1;
        ArrayList<Contato> listaCtt = new ArrayList<Contato>();


        do{
           int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para escolher qual operação irá realizar:\n 1- Adcionar Contato\n 2-Listar contato\n 3- Editar contato\n 4- Excluir contato\n 5- Sair"));

           switch (escolha) {

            
            //Adicionar
            case 1:
            String nome = JOptionPane.showInputDialog("Digite o nome desse contato:");
            String email = JOptionPane.showInputDialog("Digite o email desse contato:");
            String telefone = JOptionPane.showInputDialog("Digite o telefone desse contato:");

            Contato novoContato = new Contato(nome, email, telefone);
            listaCtt.add(novoContato);
                break;



            //Listar
            case 2:
            String exibir = "";
            for (Contato contato : listaCtt) {
                exibir += "Nome: "+contato.getNome()+" --> Email: "+contato.getEmail()+" --> Telefone: "+contato.getTelefone()+"\n";
            }
            
            JOptionPane.showMessageDialog(null, exibir);
            exibir = "";
                break;



            //Editar
            case 3:
            String edit = JOptionPane.showInputDialog("Digite o nome do ctt que deseja editar:");
            //Procura o Contato 
            for (Contato contato : listaCtt) {
                //Se achar ele irá mudar suas istâmcias
                if (contato.getNome().equalsIgnoreCase(edit)) {
                   contato.setNome(JOptionPane.showInputDialog("Digite o novo nome:"));
                    contato.setEmail(JOptionPane.showInputDialog("Digite o novo email:"));
                    contato.setTelefone(JOptionPane.showInputDialog("Digite o novo telefone:"));
                    JOptionPane.showMessageDialog(null, "Contato atualizado com sucesso!!");
                    break;
                }
            }
                break;



            //Excluir
            case 4:
            String excluir = JOptionPane.showInputDialog("Digite o nome do contato que deseja excluir:");
            
            for (Contato contato : listaCtt) {
                if (contato.getNome().equalsIgnoreCase(excluir)) {
                    listaCtt.remove(contato);
                    JOptionPane.showMessageDialog(null, "Contato excluido com sucesso!");
                    break;
                }
            }

                break;

            //Sair
            case 5:
            JOptionPane.showMessageDialog(null, "Obrigado por escolher nossa ajuda:)");
            System.exit(0);
                break;

            //Caracter inválido
            default:
            JOptionPane.showMessageDialog(null, "Carácter Inválido");
                break;
           }
        }while(keep == 1);

        JOptionPane.showMessageDialog(null, "Obrigado por escolher nossa ajuda");

    }
    
}