package base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class Base64Demo {
    public static void main(String[] args) {
        final String originalString = "string to encode";

        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes(StandardCharsets.UTF_8));
        System.out.println(encodedString);

        String decode = new String(Base64.getDecoder().decode(encodedString));
        System.out.println(decode);

        encodedString = Base64.getEncoder().withoutPadding().encodeToString(originalString.getBytes()); // this remove the =
        System.out.println(encodedString);

        decode = new String(Base64.getDecoder().decode(encodedString));
        System.out.println(decode);

        String originalUrl = "https://www.google.co.nz/?gfe_rd=cr&ei=dzbFV&gws_rd=ssl#q=java";
        String encodedUrl = Base64.getUrlEncoder().encodeToString(originalUrl.getBytes());
        System.out.println(encodedUrl);

        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedUrl);
        String decodedUrl = new String(decodedBytes);
        System.out.println(decodedUrl);

        StringBuilder buffer = getMimeBuffer();
        System.out.println(buffer);
        byte[] encodedAsBytes = buffer.toString().getBytes();
        String encodedMime = Base64.getMimeEncoder().encodeToString(encodedAsBytes);
        System.out.println(encodedMime);

        decodedBytes = Base64.getMimeDecoder().decode(encodedMime);
        String decodedMime = new String(decodedBytes);
        System.out.println(decodedMime);
    }

    private static StringBuilder getMimeBuffer() {
        StringBuilder buffer = new StringBuilder();
        for (int count = 0; count < 10; ++count) {
            buffer.append(UUID.randomUUID());
        }
        return buffer;
    }
}
