
package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arquivos {

    
    public static void main(String[] args) {
       //PASSO 01 - Quem é o arquivo,onde ele e está?
       String arquivo = "C:\\Users\\22282179\\Desktop\\arquivos\\teste.txt";
       
       //PASSO 02 - Criar um objeto Path
        Path path = Paths.get(arquivo);
        
        
        //PASSO 03 -Criar um escritor
            try {
            BufferedWriter bw = Files.newBufferedWriter(
                    path,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
       //Passo 04 - passar o conteudo que será escrito no arquivo
        
          bw.write("100;Jandira;SP");
          bw.newLine();//quebrar a linha
          bw.write("101;Jandira;SP");
          bw.newLine();//quebrar a linha
          bw.write("102;Jandira;SP");
          bw.newLine();//quebrar a linha
          bw.write("103;Jandira;SP");
          bw.newLine();//quebrar a linha
          bw.write("104;Jandira;SP");
          bw.newLine();//quebrar a linha
          
        //Passo 05 - Fechar o arquivo  
          bw.close();
          
        } catch (IOException ex) { //catch trata o erro
                JOptionPane.showMessageDialog(null, "O arquivo não foi encontrado");
        }
    }
    
}
//       String teste = "Ola \"Pedro\" ";
//        System.out.println(teste);