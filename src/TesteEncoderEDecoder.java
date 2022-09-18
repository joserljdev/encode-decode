import java.util.Base64;

public class TesteEncoderEDecoder {
	public static void main(String[] args) {
		String texto = "Gerando texto em Base64";

		// Gerando Base64 a partir do texto
		String base64 = Base64.getEncoder().encodeToString(texto.getBytes());
		System.out.println(base64);

		// Gerando o texto a partir do Base64
		byte[] decodedBytes = Base64.getDecoder().decode(base64);
		System.out.println(new String(decodedBytes));

	}
}
