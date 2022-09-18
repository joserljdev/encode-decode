import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

public class TesteEncoderEDecoderPDF {
	public static void main(String[] args) throws IOException {
		// Arquivo PDF na pasta raíz do projeto
		File file = new File("requisicoes_http.pdf");

		byte[] bytes = Files.readAllBytes(file.toPath());

		// Gerando Base64 a partir do PDF
		String base64 = Base64.getEncoder().encodeToString(bytes);
		System.out.println(base64);

		// Gerando PDF a partir do Base64
		FileOutputStream fos = new FileOutputStream("arquivo.pdf");

		byte[] decoder = Base64.getDecoder().decode(base64);

		fos.write(decoder);
		fos.close();

	}
}