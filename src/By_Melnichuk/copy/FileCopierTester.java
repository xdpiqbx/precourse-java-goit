package By_Melnichuk.copy;

import java.io.IOException;

public class FileCopierTester {
    public static void main(String[] args) throws IOException {
        new FileCopier("./src/main/resources/data.txt", "./src/main/resources/out/data-copy.txt").copy();
    }
}
